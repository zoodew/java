package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.before.Television;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {
	
		//Desktop 인스턴스 생성							221128 3교시	
//		Desktop desktop = new Desktop("애플", "a1111", "맥 24인치", 1500000, true);	//boolean 일체형이라 true 일체형 아닐시 false
		//ㄴ before용					// ㄴ ctrl space 누르면 매개변수 뭐 넣어야 하는지 뜸 그거 따라서 매개변수에 값 넣기
	
		Desktop desktop = new Desktop();		//221128 4교시	after.product
		
		desktop.setBrand("애플");					//221128 4교시	after.product
		desktop.setpCode("a1111");
		desktop.setName("아이맥 24인치");
		desktop.setPrice(1500000);	// 18~21행 Desktop클래스에 없는데 출력됨 왜? Product를 상속받아서
		desktop.setAllInOne(true);	//	ㄴ 게터세터는 왜? 프라이빗이면 직접 상속이 안 됨 그래서 게터세터사용
			// ㄴ221128 4교시까지 Desktop이랑 Product 따로 설정 걸어줘야해서 13행처럼 한번에 매개변수설정 못함 syso도 product info랑 desktop allinone값 따로 출력
			// 이걸 해결보기 위해 5교시 수업 들어감
		
		//SmartPhone 인스턴스 생성							//221128 4교시
		SmartPhone smartphone = new SmartPhone("애플", "a2222", "아이폰12 미니", 900000, "KT");

		//television 인스턴스 생성							//221128 4교시
		Television television = new Television("엘지", "t-01", "벽걸이 TV", 200000, 40);
		
		//출력										
		System.out.println(desktop.information());		//221128 3교시기본, 4교시 afterproduct
//		System.out.println(desktop.isAllInOne());//boolean은 게터 is로		//221128 4교시 37분
		System.out.println(smartphone.information());	//221128 4교시
		System.out.println(television.information()); 	//221128 4교시
		
		
		
		System.out.println("======================================");
		
		
		//오버라이딩 테스트			221128 7교시
		Book book1 = new Book("자바의 정석", "남궁성", 3000);
		Book book2 = new Book("자바의 정석", "남궁성", 3000);
		Book book3 = new Book("자바 너무 어려워", "문인수", 3000);
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());

		System.out.println();
		
		// 1. Object 클래스의 'toString() 메소드' 오버라이딩 출력		221128 7교시
//		System.out.println(book1.toString());
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
		
		System.out.println();
		
		// 2. Object 클래스의 'equals() 메소드' 오버라이딩 출력		221128 7교시 8교시
		System.out.println(book1 == book2);	//false가 나옴 왜?? ==는 참조변수의 데이터가 아닌 주소값을 비교하는 것임 주소값이 다르기 때문에 false
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		
		
		System.out.println();
		
		//3. Object 클래스의 'hashCode() 메소드' 오버라이딩						221128 8교시
		System.out.println("문인수".hashCode());
		System.out.println(new String("문인수").hashCode());
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		
		
	}

	
}
