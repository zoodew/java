package com.kh.chapter3._interface;

public interface Basic {
	// 인터페이스에서 필드는 무조건 상수이다.				221201 2교시
	/*public static final(생략되어있는 상태)*/int NUM = 10;
	
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다.		221201 2교시
	/*public abstract(생략 상태)*/void turnOn()/*{}중괄호 블록을 추가하면 에러가 남*/;
	
	/*public abstract(생략 상태)*/void turnOff();
		//데탑 스마트폰 티비의 기본기능
}
