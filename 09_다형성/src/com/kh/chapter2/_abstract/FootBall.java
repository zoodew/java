package com.kh.chapter2._abstract;

public class FootBall extends Sports{ //추상클래스를 상속하는 자식클래스					//221130 4교시
	public FootBall (int numberOfPlayers) {			// 생성자는 void 안 써줌!!!!!! public void abc 하면 새로운 메소드 하나 만든 것
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() {	//rule 메소드 재정의 sports 클래스추상메소드
		System.out.println("FootBall의 선수는 " + this.numberOfPlayers +
							"명, 손이 아닌 발로 공을 차야한다.");
	}
}
