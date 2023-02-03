package com.kh.operator.practice;

public class C_Arithmetic {
	/*
	 * 산술 연산자
	 * 	+ (더하기)
	 * 	- (빼기)
	 * 	* (곱하기)
	 * 	/ (나누기)
	 * 	% (나머지)
	 */
	
	public void method1() {
		// 정수의 산술 연산
		int number1 = 10;
		int number2 = 3;
		
		//System.out.println("number1 + number2 = " + number1 + number2); //왜 103? "" 문자열이 들어있어서 나머지도 다 문자열처럼 인식 그래서 10 문자 3 문자
		System.out.println("number1 + number2 = " + (number1 + number2)); //뒤 수식을 먼저 계산해 주라고 괄호를 쳐주면 먼저 계산해서 숫자 10+3으로 13이 됨
		System.out.println("number1 - number2 = " + (number1 - number2));
		System.out.println("number1 * number2 = " + (number1 * number2));
		System.out.println("number1 / number2 = " + (number1 / number2));
		System.out.println("number1 % number2 = " + (number1 % number2));
		
		
		//실수의 산술 연산
		double dNumber1 = 35.0;
		double dNumber2 = 10.0;
		
		System.out.println("dNumber1 + dNumber2 = " + (dNumber1 + dNumber2));	//45.0
		System.out.println("dNumber1 - dNumber2 = " + (dNumber1 - dNumber2));	//25.0
		System.out.println("dNumber1 * dNumber2 = " + (dNumber1 * dNumber2));	//350.0
		System.out.println("dNumber1 / dNumber2 = " + (dNumber1 / dNumber2));	//3.5
		System.out.println("dNumber1 % dNumber2 = " + (dNumber1 % dNumber2));	//5.0
	
		// 참고		헷갈리거나 실수하기 쉬운 경우들
//		System.out.println(5 / 0);	//나누는 수가 0 이러면 오류남 이걸 확인해주는 코드 넣어주는 식으로 체크확인
		System.out.println(5 / 0.0);	//infinity
		System.out.println(5 % 0.0);	//NaN(not a number)	숫자가 아니다라는 뜻
		System.out.println((5 / 0.0) + 10);	//infinity
		System.out.println(Double.isInfinite(5 / 0.0)); //()안의 식이 무한대가 맞는지 확인하는 식 무한이면 true 아니면 false
		System.out.println(Double.isNaN(5 % 0.0)); 		//()안의 식이 NaN이 맞는지 확인하는 식
	}
}
