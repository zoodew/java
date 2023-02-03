package com.kh.chapter3.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_Date {
	
	// Java 10기본API 07 Data 클래스 08 SimpleDateFormat 클래스		221202 1,2교시
	public void method1() {						//221202 1교시
		
		// 기본 생성자로 인스턴스를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 인스턴스를 생성한다.
		Date today = new Date();			//Date 적고 ctrl space java.util 누르기
		
		System.out.println(today);
		
		// 매개변수가 있는 생성자는 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다.
		// 한국 표준 시간(KST)으로 출력될 땐 그리니치 평균시(GMT)보다 +9 증가된 시간으로 표시된다.
		Date when = new Date(1);	// 1970년 1월1일을 기준으로 밀리세컨드 단위의 시간을 넣어줌
			
		System.out.println(when);
		
		Date when1 = new Date(1000);	//밀리세컨드 단위로 계산해서 1000 넣어서 9:00:01이 됨
		
		System.out.println(when1);
		
		
		// Deprecated 된 생성자를 사용한 인스턴스 생성
		when= new Date((2022 - 1900), (12 - 1), 2);
		
		System.out.println(when);
		System.out.println();

		System.out.println(today.getTime());
		System.out.println((today.getYear() + 1900) + "년");
		System.out.println((today.getMonth() + 1) + "월");
		System.out.println(today.getDate() + "일");
		System.out.println(today.getHours() + "시");
		System.out.println(today.getMinutes() + "분");
		System.out.println(today.getSeconds() + "초");
		System.out.println();
		
		
		// SimpleDateFormat 클래스 사용					//221202 2교시
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 a dd일 hh시 mm분 ss초 (E)");
		String formatDate = sdf.format(today);
		
		System.out.println(formatDate);
	}
}
