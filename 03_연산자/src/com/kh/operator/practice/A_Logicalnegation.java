package com.kh.operator.practice;

public class A_Logicalnegation {
	
	/*
	 * 논리 부정 연산자
	 * 	[표현법]
	 * 	  !논리값(true, false)
	 * 
	 * 	  - 논리 값을 반대로 바꾸는 연산자이다. (ture -> false, false -> true)
	 */

	public void method1() {	//메소드생성
		boolean b1 = true;	//true는 논리의 리터럴
		boolean b2 = false;
		
		System.out.println("b1 : " + b1);
		System.out.println("b1의 부정 : " + !b1);		// '!' 논리부정연산자
		System.out.println("b1 : " + b1);	// 논리부정연산자 쓴다고 해서 실제 변수의 값을 변경하지는 않음
													//원본값이 변경되는 게 아니다
		System.out.println();
		
		System.out.println("b2 : " + b2);
		System.out.println("b2의 부정 : " + !b2);
		System.out.println("b2 : " + b2);
	}

}
