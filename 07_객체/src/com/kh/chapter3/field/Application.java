package com.kh.chapter3.field;
	//A_Field랑 같은 클래스에 있음 import도 필요 없음
public class Application {
	
	public static void main(String[] args) {
		A_Field fieldTest = new A_Field();
		
		// 2. 접근 제한자 테스트
		// public : 필드에 직접 접근이 가능하다. 어디서든 접근을 할 수 있다.
		System.out.println(fieldTest.publicField);
		
		// protected : 같은 패키지에 존재하거나 상속 구조에서만 접근이 가능하다.
		System.out.println(fieldTest.protectedField);
		
		// default : 같은 패키지 내에서만 접근이 가능하다.
		System.out.println(fieldTest.defaultField);
		
		// private : 같은 클래스 내에서만 접근이 가능하다.		A_Field내에서만 가능
//		System.out.println(fieldTest.privateField);

	}

}
