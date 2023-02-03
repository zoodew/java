package com.kh.chapter1;

import com.kh.chapter1.thread.Thread1;
import com.kh.chapter1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인스레드 실행");	
		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority()); 	// 221209 3교시 20분쯤~ .currentThread() 현재 스레드의 인스턴스를 줌
		
		Thread1 th1 = new Thread1();		//메인스레드 : 메인메소드가 실행되면 쭉 차례대로 실행되는 스레드
		
//		th1.setPriority(10);						// 우선순위 설정			221209 3교시 10분~	
		th1.setPriority(Thread.MAX_PRIORITY);		// ㄴ 우선순위는 start호출 전에 하는 게 좋음
		// r run() start() 주석 풀어가며 출력 어떻게 달라지나 보기		221209 2교시 처음
		//		th1.run();			// 메인스레드 실행,Thread1로 가서 run 실행 다시 메인스레드로 돌아와서 실행
		th1.start();		// 메인스레드는 쭉 자기 실행타고 종료까지 가고 start()메소드로 Thread1로 가서 실행 
			// thread-0 : th1 실행흐름
		
		System.out.println("th1.getPriority() : " + th1.getPriority()); // 현재 th1에 우선순위가 뭘로 설정되어있나
		
		Thread th2 = new Thread(new Thread2());				//221209 2교시 15분~
		
		th2.setPriority(1);
//		th2.setPriority(Thread.MIN_PRIORITY);
//		th2.run();
		th2.start();
			// thread-1 : th2 실행흐름	
		
		System.out.println("th2.getPriority() : " + th2.getPriority()); // 현재 th1에 우선순위가 뭘로 설정되어있나

												// 1209 2교시 25분쯤~ 여기까지 실행흐름 정리!!!!봐보기!!!!!!!!!!!!보자보자보자!!!!!

		
		/*
		 * 2-1) 익명 구현 객체									//221209 2교시 10시 30분~
		 * 	[표현법]
		 * 	  new 인터페이스() {... 구현 내용 ...};
		 * 	  
		 * 	- 자바에서 소스 파일을 만들지 않고도 구현 인스턴스를 만들 수 있는 방법을 제공하는데 그 방법을 익명 구현 객체라고 한다.
		 * 	- 인스턴스를 생성할 때 인터페이스를 직접 구현해서 인스턴스를 생성할 수 있다.
		 * 	- 중괄호({ ... })에는 인터페이스에서 선언된 모든 추상 메소드들을 재정의해야 한다.
		 */
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 작업하고자 하는 코드를 작성한다.
				for (int i = 1; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
				
			}
		});
		
		th3.start(); 
			// thread-2	: th3 실행 흐름
		
		
		
		/*
		 * 2-2) 람다식을 통한 익명 구현 객체 (참고만 하기 후에 다시)			//221209 2교시 40분~
		 */
		Thread th4 = new Thread(() -> {
			// 작업하고자 하는 코드를 작성한다.
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}			
		});
		
		th4.start();
			// thread-3	: th4 실행 흐름
		
		
		
		try {
			/*
			 * join() 메소드를 호출한 스레드(ex여기서는 main 스레드 but 꼭 main 스레드일 필요는 없음)는 아래의 스레드가 종료될 때까지 기다렸다가
			 * 아래의 스레드가 종료되면 join() 메소드를 호출한 스레드(main 스레드)를 다시 실행한다.
			 */
			th1.join();								// 스레드 제어		221209 3교시 5분~
			th2.join();
			th3.join();
			th4.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인스레드 종료");
							
		
	}

}
