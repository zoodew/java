package com.kh.control.practice;

import java.util.Scanner;

public class E_Break {
	/*
	 * break 문
	 * 
	 * 	 [표현법]
	 * 	   반복문/switch(조건식){
	 * 		 [break;]
	 *		}
	 *
	 *		- break 문은 반복문과 switch 문의 실행을 중지하고 빠져나갈 때 사용한다.
	 *		- 반복문이 중첩되어 있는 경우 break 문이 포함되어 있는 반복문만 빠져나간다.
	 */
	
	
	
	public void method1() {
		// 1 ~ 10까지 출력
		for (int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				break;
			}
			
			System.out.print(i + " ");
			
		}
			
		System.out.println();
		
		// 2 ~ 9단까지 출력
		for (int i = 2; i <= 9; i++) {
			if(i == 3) {
				break;
			}
			
			for (int j = 1; j <= 9; j++) {
//				if(i == 3) {						//if문 풀고 어떻게 나오는지 보기
//					break;								//의도 = 3단부터 안 나오게 만들고 싶은거
//				}										//break문은 해당하는 break문을 감싸고 있는 제일 가까운 반복문만 break를 걸어서
														//바깥의 반복문은 계속 반복됨 그래서 34열의 if문처럼 밖에다가 적어서 break를 걸어줘야 3단부터 안나오는 게 됨 
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
		}
			
			
	}

	
	
	public void method2() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계를 반복문을 통해서 출력한다.
		// 단, 랜덤값이 5가 나오면 프로그램을 종료한다.
		
		int sum = 0;
		int random = 0;
		
		while(true) {
			sum = 0;			//반복하면서 sum에 누적 대입을 함 여기서 초기화를 안 해주면 기존에 있던 거에 계속 누적을 해줘서
								//위에서 변수 초기화 해주고도 안에서 또 초기화 해 줌
			random = (int) (Math.random() * 10 + 1);
			
			if(random == 5) {
				break;				//break를 감싸고 있는 문 while문 얘까지 걸림
			}
			
			for (int i = 1; i <= random ; i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
			
			
		}
		
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
		
		
			//내가 만든 개똥 		다시 풀어보기
			//		int random = (int) (Math.random() * 10 + 1);
			//			
			//			int sum = 0;
			//			
			//			if(random == 5) {
			//				
			//				return;
			//			}
			//			
			//			for(int i = 1; i <= random; i++) {
			//				sum += i;
			//			}
		
		}

	
	
	
}
