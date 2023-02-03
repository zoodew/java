package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Application {

	public static void main(String[] args) {
		User user = null;		//user라는 참조 변수 어떠한 값도 가르키지 않는다는 뜻 null값
		
		
		// 기본 생성자로 인스턴스 생성
		user = new User();		//user 클래스의 1* 주석 풀고 묶고 해보면서 비교 
		
//		System.out.println("user : " + user);
		System.out.println(user.information());
					//  ㄴ null, null, null, 0,  출력 //맨 마지막 공백이 기본값 JVM이 넣은 기본값으로 들어간 것
		
		//user 세터로 초기화하고 여기로 와서 값 설정
		user.setId("ismoon");
		user.setPassword("1234");
		user.setName("문인수");
		user.setAge(17);
		user.setGender('남');
		
		// 출력
		System.out.println(user.information());
		
		
		// 매개 변수가 있는 생성자로 인스턴스 생성 (세 개의 값을 생성자로 전달)
		user = new User("hong", "5678", "홍길동");
		
		System.out.println(user.information());
					//	ㄴ hong, 5678, 홍길동, 0, 	 출력 // 초기화 하지 않은 매개 변수는 기본값으로 나옴
				
		// 매개 변수가 있는 생성자로 인스턴스 생성 (다섯 개의 값을 생성자로 전달)
		user = new User("jyp", "0000", "박진영", 50, '남');
		
		System.out.println(user.information());
	}

}
