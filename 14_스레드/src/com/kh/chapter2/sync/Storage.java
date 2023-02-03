package com.kh.chapter2.sync;

public class Storage {				//221209 4교시
	
	private int data;
	
	private boolean empty = true;	//현재 storage 인스턴스의 상태값 저장하고 흐름을 제어하기 위한 필드. data가 소비됐는지 차있는 상태인지 //1209 4교시 35분~
	// ㄴ 인스턴스의 상태를 저장하고 흐름을 제어하기 위한 필드(플래그 변수)
	
	public synchronized/*동기화 예약어*/ void getData() {			// 상품 꺼내오는 메소드
		while (empty) {
			try {
				wait();	// ㄴ synchronized 잠금상태일땐 인스턴스 잠금 풀고 스레드를 일시정지 상태로
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		System.out.println("소비자가 " + this.data + " 번 상품을 소비하였습니다.");
		notify();
	}
	
	
	public synchronized/*동기화 예약어*/ void setData(int data) {	// 상품 넣어주는 메소드
		
		while(!empty) {				//221209 5교시~
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.data = data;
		this.empty = false;
		
		System.out.println("생산자가 " + this.data + " 번 상품을 생산하였습니다.");
		notify();
	}
	
	
}
