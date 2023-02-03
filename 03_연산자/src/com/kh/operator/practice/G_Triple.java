package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 * 	 [표현법]
	 * 		조건식 ? 식1 : 식2;
	 * 
	 * 		- 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * 		- 조건식의 결과가 true 이면 식1을 수행한다.
	 * 		- 조건식의 결과가 false이면 식2를 수행한다.	
	 */

	public void method1() {
		// 입력받은 정수가 양수인지 음수인지 판단
		int number = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);		//처음 스캐너 컨트롤 스페이스 자바유틸선택해야 3열의 import자바유틸이 들어감
														//사용자값 가져옴
		System.out.print("정수값 입력 > ");
		number = scanner.nextInt();
		
//		result = (number > 0) ? "양수이다." : "음수이다.";		//이 식은 양수 음수만 판단 가능하고 0은 판단 못 함
		result = (number == 0) ? "0입니다." : (number > 0) ? "양수이다." : "음수이다.";
					// 삼항연산자 중첩 사용 >> 왼쪽부터 ?앞이 참이면 0입니다. 거짓이면 : 오른쪽으로 넘어가서 또 삼항 연산자 풀면 됨
		
		System.out.println(number + "는(은) " + result);
		
		
		scanner.close();
	}
	
	
	//실습문제 깃에서 보고 해보기

}