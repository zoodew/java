package com.kh.chapter2._abstract;

public class BasketBall extends Sports{	//추상클래스를 상속하는 자식클래스				//221130 4교시
	public BasketBall (int numberOfPlayers) {
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() {		//rule 메소드 재정의 sports 클래스추상메소드
		System.out.println("BasketBall의 선수는 " + this.numberOfPlayers +
							"명, 공을 던져서 링에 넣어야한다.");
	}	//반드시 추상메소드 재정의해야함 추상메소드(Sports)의 추상메소드가 미완성이기 때문에
	
	
	
}
