package com.kh.control.practice;

import java.util.Scanner;

public class C_For {				//221121 for문 6교시
	
	/*
	 * for 문
	 * 	 [표기법]
	 * 		for(초기식(반복문을 제어할 제어 변수 선언); 조건식(반복문이 수행할 조건을 ); 증감식(제어변수를 증가시키거나 감소시키는){
	 * 			..실행 코드..(실제로 반복시행 시킬 코드를 작성)
	 * 		}
	 * 
	 * 	- 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * 	- 조건식은 반복문이 수행되는 조건을 작성하는 구문으로 조건식의 결과가 true이면 실행 코드를 수행하고,
	 * 	  조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나온다.
	 * 	- 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다. 	
	 */
	
	
	public void method1() {
		// 1부터 10까지 출력하라 1부터 10까지 더하라 
		// 반복문을 사용하지 않을 때
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);
			
			
			System.out.println(1+2+3+4+5+6+7+8+9+10);
					//할만 함 100까지라고 하면 ????
					// 이럴 때 사용하는 게 반복문
		
		// 반복문을 사용할 때
			// 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {	// (처음에 실행되는 변수 초기화; 조건문 시행; 증감식)
												//i가 1 -> 10보다 작음 {}조건수행 -> 증감식으로 넘어감 1추가하기
												//i가 2 -> 10보다 작음 {}조건수행 -> 증감식으로 넘어감 1추가하기
												//i가 3 10까지 반복 11이 되면 멈춤
										//증감식의 ++ -- i의 앞이나 뒤나 상관없음 단항 연산이라서 상관없을 때는 주로 뒤에 씀
			System.out.println(i);
		}
		
		System.out.println();
		
			// 10부터 1까지 출력 (반복문 사용)
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	
	public void method2() {
		// 1부터 10까지의 정수들의 합계를 출력
		// 1 + 2 + 3 + 4 + ... + 10
		// sum += 1;     ==        sum = sum + 1;   
		// sum += 2;
		// sum += 3;
		// ...
		// sum += 10;
		
		int sum = 0; 		//누적해서 더할 정수형 변수 하나 만들기
		
		for(int i = 1; i <= 10; i++) {				//증감식에 홀수만 건드려라~ 하면 i += 2; 로 쓰면 됨 상황에 따라 쓰기
			sum += i; 	//	sum = sum + i; 같음	
		}

		System.out.println("합계 : " + sum);
		
		
	}

	
	public void method3() {			//221121 6교시 35분~ 7교시 5분
		/*
		 * 1부터 랜덤값(1~10)까지의 합계를 구하시오.
		 * 
		 * ^java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.^
		 * java.lang.Math.random() 호출 시 -> 0.0 ~ 0.99999.. 사이의 값을 발생		 
		 */
		
	
//		int random = Math.random();		// double타입이라 에러 발생 int는 정수형인데 mathrandom은 0부터 1사이 값이라
//		int random = (int) (Math.random() * 10);	// 0.0 ~ 9.9999999..	-> 나는 1~10이 필요한데 1~9까지만 나옴
		int random = (int) (Math.random() * 10 + 1);	// 1.0 ~ 10.9999999.. -> 1을 더해서 1~10 만듦
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++){		// i <= 10까지라고 하면 안 되고 i <= random
			sum += i;
		}
		
		//	System.out.println(i);		//에러 남 왜??? 변수 i는 for문 안에서 선언 되고 for문 안에서만 사용되고 끝나면 소멸됨
										//그래서 for문 밖에서 변수 i를 불러오면 불러오기가 안 되고 에러가 남
										//if 문에서도 마찬가지 . 지역 변수의 특징
		System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
	}


	/*
	 * 중첩 for 문
	 * 	 [표현법]
	 * 	   for(초기식; 조건식; 증감식;){
	 * 		 ..실행 코드..
	 * 		 for(초기식; 조건식; 증감식){
	 * 		 	..실행 코드..
	 * 		  }
	 * 		..실행 코드..
	 * 	   }
	 * - 중첩 갯수 제한은 없으나 너무 복잡해서 보통은 두 단계까지만 씀
	 */
	public void method4() {
		/*
		 * 2단 ~ 9단 출력
		 * 	단은 2 ~ 9까지 1씩 증가 (바깥쪽 for 문을 통해 해결)
		 * 	곱해지는 수는 1 ~ 9까지 1씩 증가 (안쪽 for문을 통해 해결)
		 * 
		 * 예시)
		 * == 2단 == 
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * == 9단 ==
		 * 9 X 1 = 9
		 * 9 X 2 = 18
		 * 9 X 3 = 27
		 * ...
		 * 9 X 9 = 81
		 */
		
	for(int i = 2; i <= 9; i++) {				//221121 7교시 실습 다시 해보기!!
		System.out.printf("== %d단 ==\n", i);
		
		for(int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %d\n", i, j, (i * j));
		}
	}
	}


	public void method5() {			//221121 7교시 35분 별찍기
		/*
		 * 별 찍기 예제
		  
		 	*****
		 	*****
		 	*****
		 	*****
		 	
		 	행이 1 ~ 4까지 반복	(바깥쪽 for 문)
		 	열이 1 ~ 5까지 반복 (안쪽 for 문)
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");				
			}
			
			System.out.println();		//안쪽 for문 끝날때마다 줄바꿈해주기 주석으로 바꾸고 비교해보기
		}
		
		
		
		
	}
	

	/*
	 * 실습 문제 1
	 * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
	 * 예시)
	 * 	정수 > 10
	 * 	총 합계 > 55
	 */
	public void practice1() {
		
		int num = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);		//!!!!!!!!!!!scanner 세줄을 안으로 넣는게 아니라 for문 밖에 쓰기
		
		System.out.print("정수 > ");
		num = scanner.nextInt();
		
		
		for (int i = 0; i <= num; i++) {		//i는 사용자가 입력한 값까지
			sum += i;
		}
		
		System.out.printf("총 합계 > %d", sum);
		
		scanner.close();
		
	
	}


	/*
	 * 실습 문제 2
	 * 사용자가 입력한 단을 출력하시오.
	 * 	예시)
	 * 	  단 수(2~9)를 입력해 주세요. > 3
	 * 	  3 X 1 = 3
	 * 	  ...
	 *    3 X 9 =27
	 *    
	 *    단 수(2 ~ 9)를 입력해 주세요. > 12
	 *    1 ~ 9 사이의 양수를 입력하여야 합니다.
	 */
/*	public void practice2() {	// !!!!!!!!!221121 7 8교시 실습 풀이 풀이는 강의없음 깃헙 코드 보고 참고
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("단 수(2~9)를 입력해 주세요. > ");		
		num = scanner.nextInt();
		
		if(num >= 2 && num < 10){
		for (int i = 2; i = 사용자가 입력한 단 수 ; i++) {
					
			}
		}	
		}
*/
	
	
	/*
	 * 실습 문제 3
	 * 
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 * 	1***
	 * 	*2**
	 * 	**3*
	 * 	***4
	 */
	public void practice3() {
		//	행이 1 ~ 4까지 반복, 열이 1 ~ 4까지 반복
		//	행과 열의 값이 같으면 숫자를 출력, 이외에는 * 출력
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
					if(i == j) {				// 같다는 == 임!!!! =는 대입임!!!!
						System.out.print(i);
					}else {
					System.out.print("*");
					}
			}
			
			System.out.println();
		}
	}
	
	
	/*
	 * 실습 문제 4
	 * 
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	*****
	 */
	public void practice4() {
		// 행이 1 ~ 5까지 반복, 열이 1 ~ 5까지 반복
		// 열의 값이 행보다 작거나 같을 때까지 * 출력
		for (int i = 1; i <= 5; i++) {	
			for (int j = 1; j <= i; j++) {
				if(j <= i) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	
}
