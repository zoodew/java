package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {
	public void method1() {				//221118 7교시 논리곱연산자 실습 연습!!
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		int number = 0;	//초기화
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);		//처음 스캐너 치고 ctrl space 눌러서 제일 위에 거 클릭 그래야 사용자 정보 가져옴
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		
		//1 <== number <= 100 의 조건을 맞춰야 함
		
		//result = 1 <= number <= 100;	//에러 남 연산은 왼 오 순 그래서 1<=number 먼저 연산 true가 나옴 true랑 100 비교 불가 그래서 에러
			//이럴 때를 위해서 논리곱 연산이 필요
		result = (number >=1 ) && (number <= 100);	// &&는 식 둘 다 참이어야 false
		
		
		System.out.printf("%d는 1부터 100사이의 값인가요? : %b\n", number, result);
		
		scanner.close(); 						//위 scanner 노란색 뜨면 없애는 법 굳이 안 해도 되는데 해주는 게 좋음 정리!
	}

	public void method2() {				//221118 8교시 실습 연습!!!!!! 논리곱논리합 쉽게 하는 법
		// Short Cut Evaluation 숏컷연산 &&앞이 폴스면 이미 땡이라 굳이 뒤에꺼 연산 안 하는, ||앞이 트루면 이미 트루라 굳이 뒤에꺼 연산 안 하는
		int number = 10;
		boolean result = false;
		
		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (number < 5) && (++number > 0);
		
		System.out.println(result);
		System.out.println(number);
		
		// || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 굳이 뒤쪽의 연ㄴ산은 수행하지 않는다.
		result = (number < 20) || (++number > 0);
		
		System.out.println(result);
		System.out.println(number);
		
	}
	
	
	/*
	 * 실습 문제
	 * 
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z' 까지가 코드값으로 65 ~ 90까지의 숫자로 나열되어 있다.
	 */
	 public void practice() {
		 
	 }
	 
	 
}
