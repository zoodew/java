package com.kh.operator.practice;

public class B_InDecrease {
	/*
	 * 증감 연산자 				221118 6교시
	 * 	 [표현법]
	 * 		(증감 연산자)값; 또는 값(증감 연산자);		-> '값' 앞 뒤에 증감 연산자 붙이기
	 * 
	 * 	  - 증감 연산자는 피연산자의 값을 1 증가시키거나 1 감소시키는 연산자이다.
	 *	  - ++ : 피연산자의 값을 1 증가시키는 연산자
	 *	  - -- : 피연산자의 값을 1 감소시키는 연산자
	 *	  - (증감 연산자)값 : 전위 연산으로 '먼저' '증감' 연산을 수행하고 '다른' 연산을 수행한다.
	 *	  - 값(증감 연산자) : 후위 연산으로 '먼저' '다른' 연산을 수행하고 '증감' 연산을 수행한다.
	 */

	public void method1() {
		int number = 10;
		
		// 전위 연산자 테스트
		System.out.println("전위 연산자 적용 전 number의 값 : " + number);	//10
		System.out.println("1회 수행 후 값 : " + ++number);		//11 number + 1 해서 이걸 다시 number에 대입 한 것
																//  -> number = number + 1; 과 같은 결과를 만들어 낸다.
		System.out.println("2회 수행 후 값 : " + ++number);		//12 세미콜론까지가 하나의 문장 이 하나의 문장을 수행하기 전에 전위연산을 먼저 수행함
		System.out.println("3회 수행 후 값 : " + ++number);		//13 이 문장에 들어있는 ++로 +1해서 13만들고 이 문장 끝남
		System.out.println("전위 연산자 적용 후 number의 값 : " + number);	//13
		
		
		// 후위 연산자 테스트
		System.out.println("후위 연산자 적용 전 number의 값 : " + number);	//위랑 이어짐 13
		System.out.println("1회 수행 후 값 : " + number++);				//13 왜냐? 이 문장이 출력 된 '후'에 연산이 수행되는 거라서! 
		System.out.println("2회 수행 후 값 : " + number++);				//14
		System.out.println("3회 수행 후 값 : " + number++);				//15
		System.out.println("후위 연산자 적용 후 number의 값 : " + number);	//16
		
	}
	
	public void method2() {
		int number = 20;
		int result = number++ * 3; // 내 답 = 60 정답 = 후위 연산은 여기서 계산 안 됨 20*3 60
		
		System.out.println("number : " + number);	// 내 답 = 21 정답 = 21 위에 ++ 더해져서
		System.out.println("result : " + result);	// 내 답 = 60 정답 = 60
					//전후위 연산 할 때 같은 변수끼리 따지는 것!!!!
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println(number1++);// 답 10 (1이 남음)
		System.out.println((++number1) + (number2++));	// number1위에서 남은 1 이 줄 number1로 가져옴 그리고 이 줄의 전위 연산 추가 numbrer1 = 12
														// number2 20 후위연산 +1 남겨둠		12 + 20 = 32
		System.out.println((number1++) + (--number2) + (--number3)); // number1 위에서 12 내려옴 이 식의 후위 +1 남음  = 12
																	 // number2 위 후위로 남은 +1 내려오고 이 식의 전위 여기서 -1 = 20
																	 // number3 변수 30 이 식의 전위 -1 이 식에서 계산 = 29   총 12+20+29= 61
		
		System.out.println("number1 : " + number1);	// 위 식의 후위 +1 = 13
		System.out.println("number2 : " + number2);	// 위 식의 계산 그대로 내려옴 20
		System.out.println("number3 : " + number3);	// 위 식의 계산 그대로 내려옴 29
		
		
	}
	
	
	
}
