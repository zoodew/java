package com.kh.control.practice;

public class F_Continue {
	/*
	 * continue 문
	 * 	 [표현법]
	 * 		반복문(조건식){
	 * 			[continue;]		//continue를 만나면 continue 아래 실행코드를 실행하지 않고
	 * 								반복문의 조건식이나 증감식으로 감
	 * 			.. 실행 코드 ..
	 *  	}
	 * 
	 * 		- continue 문은 반복문 안에서만 사용이 가능하다.
	 * 		- 반복문 안에서 continue 문을 만나게 되면 다음 구문들은 실행하지 않고
	 * 		  continue 문이 포함되어 있는 반복문의 조건식 또는 증감식으로 이동한다.
	 */
	
	public void method1() {
		// 1부터 10까지의 정수들의 합을 출력하시오.
		// 단, 5의 배수는 제외하고 덧셈한다.
		
		int sum = 0;
		
//		for문으로 합 출력		
//		for (int i = 1; i <= 10; i++) {
//			
//			if((i % 5) == 0) {
//				continue;		//continue만나면 for의 조건식으로 감 가서 다시 sum += i로 내려감
//			}
//			sum += i;
//			
//		}
		
		
//		while문으로 합 출력
		
		int i = 1;
		
		while(i <= 10) {
			if((i % 5) == 0) {
				i++;			//while문 안의 continue 증감식으로 가는 게 아니라 while의 조건식(i <= 10)으로 감
								//그래서 계속 무한루프가 걸림 -> i++;로 별도의 증감 작업을 해줌
				continue;		//continue만나면 for의 조건식으로 감 가서 다시 sum += i로 내려감
			}
			
			sum += i;
			
			i++;				//while문에는 증감식이 따로 없어서 증감식 추가
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	
	/*
	 * 구구단(2 ~ 9단)을 출력하시오. (단, 홀수단을 빼고 출력) 
	 */
	public void method2() {		//선생님 답 참조해서 이리저리 비교하고 돌려보기
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
				if((i % 2) == 1) {
					i++;
					continue;
				}
				
			System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}	
		}
		
	}
}

