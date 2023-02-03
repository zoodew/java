package com.kh.chapter3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B_JavaTime {
	// Java 10기본API 9 java.time 패키지
	public void method1() {							//221202 2교시
		
		// Java 10기본API 9 java.time 패키지			//221202 2교시
		LocalDateTime now = LocalDateTime.now();	// 정적(static) 메소드 new 붙을 필요 없음
		LocalDateTime when = LocalDateTime.of(2022, 5, 25, 22, 32, 25);
		
		System.out.println(now);
		System.out.println(when);
		System.out.println(ZonedDateTime.now());	//타임존에 대한 정보도 가져옴
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());	//ctrl space로 반환형 클래스 정보 봐보기
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());		// 1년의 몇 번째 일이냐
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		System.out.println();
		
			// 날짜와 시간을 조작하기						//221202 2교시
//		LocalDateTime plusDays = now.plusDays(1);
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).minusYears(1);	//plusDays 라는 새로운 인스턴스 생성했기 때문에 거기에 추가로 더해서 응용가능
		LocalDateTime minusMonths = now.minusMonths(5);
		
		System.out.println(now);			// 원본 값에는 변화가 없음
		System.out.println(plusDays); 		// 현재시간에 하루 더 더해진 새로운 인스턴스 생성
		System.out.println(minusMonths);	// 현재 시간에 다섯 달 뺀 새로운 인스턴스 생성
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));	//true > now가 매개값인 plusDays보다 이후의 날짜인지 보는 메소드
		System.out.println(now.isBefore(plusDays));	//false > now가 매개값인 plusDays보다 이전의 날짜인지 보는 메소드
		System.out.println(now.isEqual(minusMonths)); //now랑 minusMonths가 같은지
		System.out.println();
		
		
		//											//221202 3교시
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2022, 12, 2);
		LocalDate localDate = now.toLocalDate();		//now 메소드에서 로컬타임만 가져옴

//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(9, 30, 45);
		LocalTime localTime = now.toLocalTime();		//now 메소드에서 로컬시간정보만 가져옴
				
		System.out.println(now);	//localDateTime 날짜 시간 정보 다 
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		
		// DateTimeFormatter 클래스 사용				//221202 3교시
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일(E) a hh시 mm분 ss초"); //new 연산자를 통해 메소드 생성 불가 정적메소드 .ofPattern을 통해 만들기
		
		System.out.println(now.toString());
		System.out.println(now.format(formatter)); //지정한 포맷대로 출력
		System.out.println();
		
		System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE));	// 몇 년도의 몇 번째 날인지 출력하는 방법
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));	// 몇 년도의 몇 번째 주의 몇 번째 날인지
//		System.out.println(now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));	// timeZone 정보가 없어서 에러 남
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));	// timeZone 정보가 넣어주기
		

	}
}
