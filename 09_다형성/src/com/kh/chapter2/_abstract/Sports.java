package com.kh.chapter2._abstract;

public abstract class Sports {	//농구 풋볼 공통적인 것들 정의해 놓은 것		//221130 4교시 5교시

	protected int numberOfPlayers;						
	
	public Sports(int numberOfPlayers) {		//기본생성자 없고 매개변수 있는 생성자만 만들어놓은 상태
	super();
	this.numberOfPlayers = numberOfPlayers;
	}
	
	
	/*
	 * 추상 메소드
	 * 	- 중괄호({})가 구현되지 않은 미완성의 메소드이다.
	 * 	- 자식 클래스에서 재정의하지 않으면 에러가 발생한다.
	 */
	public abstract void rule();			//추상메소드도 abstract 추가. {}없고 메소드 선언부만 있음
		// 추상메소드 스포츠에는 rule이라는 완성되지 않은 메소드가 있음 자식 클래스들이 이 미완성 메소드를 재정의해야함
		// 추상메소드는 반드시 추상클래스의 내부에 있어야 함(Sports 클래스의 abstract 지워보기 에러 남)
}
