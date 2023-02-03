package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자
	 *   a < b : a가 b보다 작은가?
	 *   a > b : a가 b보다 큰가?
	 *   a <= b : a가 b보다 작거나 같은가?
	 *   a >= b : a가 b보다 크거나 같은가?
	 *   a == b : a와 b가 같은가?
	 *   a != b : a와 b가 같지 않은가?
	 *   
	 *   - 비교 연산의 조건을 만족하면 true, 만족하지 않으면 false를 반환한다(리턴한다).
	 */

	public void method1() {
		// 변수 여러 개 선언 할 때 한 번에 하는 방법. 관례상 잘 사용하지 않는다.
		int num1 = 10, num2 = 25, num3 = 0;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		
		System.out.println();
		
		System.out.println('A' == 65); //A의 코드값 65 형변환
		System.out.println(3 == 3.0); // 3.0 == 3.0  형변환
		// 단, 예외가 있다.
		// 부동 소수점 방식은 오차가 생길 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다.
		System.out.println(0.1 == 0.1F); // 이건 틀림 왜냐면 더블형에서 플롯으로 형변환 할 때 오차가 생길 수 있기 때문에
		
	}
	
	public void method2() {				//221118 7교시 실습 영상 공부공부 이해하기
		// 산술 연산 + 비교 연산
		// 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단
		
		int number = 0;	//초기화
		boolean result = false;			//트루폴스 변수
		
		Scanner scanner = new Scanner(System.in);		//사용자 값 받아오는거
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();						//사용자 값 받고 엔터 누를때까지 기다림 그 후에 밑에 식에 포함해서 뜸
		
		result = ((number % 2) == 0);		//정수값 정수값 비교연산 => 논리연산(트루폴스)
				
		System.out.printf("%d는 짝수인가요? %b\n", number, result);
				
		scanner.close();
	}
}
