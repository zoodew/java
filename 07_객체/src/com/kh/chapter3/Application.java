package com.kh.chapter3;

import com.kh.chapter3.field.A_Field;

public class Application {

	public static void main(String[] args) {
		
		// 1. 변수 구분 테스트
		A_Field fieldTest = new A_Field();
		
		// 매개 값으로 정수형 데이터를 넘겨주어야 한다.
		fieldTest.test(10); // ㄴ 정수형 데이터여야지 문자형 데이터는 불가능함 매개변수 자료형이 정수형, 값도 하나만 보낼 수 있음
		System.out.println();
		
		
		// 2. 접근 제한자 테스트
		// public : 필드에 직접 접근이 가능하다. 어디서든 접근을 할 수 있다.
		System.out.println(fieldTest.publicField);
		
		// protected : 같은 패키지에 존재하거나 상속 구조에서만 접근이 가능하다.
//		System.out.println(fieldTest.protectedField);
		
		// default : 같은 패키지 내에서만 접근이 가능하다.
//		System.out.println(fieldTest.defaultField);
		
		// private : 같은 클래스 내에서만 접근이 가능하다.
//		System.out.println(fieldTest.privateField);
	}

}
