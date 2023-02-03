package com.kh.chapter2.wrapper;

public class A_Wrapper {
	
	
	// Java 10_기본 API 6. Wrapper 클래스
	public void method1() {	//221201 7교시
	
	//Boxing
		int iNum = 10;
		double dNum = 3.14;
		
		// 1. 인스턴스 생성을 통한 방법 (Deprecated)			221201 7교시
		Integer integer = new Integer(iNum);// 참조변수 만드는 단축키 대입연산자 alt shift l
		Double double1 = new Double(dNum);
		Double double2 = new Double(3.14);	// 짝대기 뜨는 거 비권장한다는 의미
		
		System.out.println(integer);
		System.out.println(double1);
		System.out.println(double2);
		System.out.println(double1 == double2);
		System.out.println(double1.equals(double2));
		System.out.println();
		
		
		// 2. 인스턴스를 직접 생성하지 않고 정적 메소드를 통한 방법		221201 8교시
		Integer integer2 = Integer.valueOf(3);	// valueOf라는 정적 메소드를 사용하여 인스턴스를 가져옴
		Double double3 = Double.valueOf(1.11);
		Double double4 = Double.valueOf("2.22");
		
		System.out.println(integer2);
		System.out.println(double3);
		System.out.println(double4);
		System.out.println();
		
		
		// 3. Auto Boxing								221201 8교시
		Integer integer3 = 5;	// 인티저타입(참조변수) = 정수값 양쪽의 데이터 타입 다른데 대입이 됨 자동으로 박싱 
		Double double5 = 180.5;	
		
		System.out.println(integer3);
		System.out.println(double5);
		System.out.println();
		
		
		
	// UnBoxing											221201 8교시
		// 1. Wrapper 인스턴스의 메소드를 통한 방법
		int iNum2 = integer.intValue();
		int iNum3 = integer2.intValue();
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		System.out.println(iNum2 + iNum3);
		System.out.println();
		
		
		// 2. Wrapper 클래스의 정적 메소드를 통한 방법
		int iNum4 = Integer.parseInt("19");	
		double dNum3 = Double.parseDouble("34.78");
		
		System.out.println(iNum4 + dNum3);	//19 + 34.78 = 53.78
		System.out.println();
		
		// 3. Auto UnBoxing
		double dNum4 = double1;	 // 양쪽의 데이터 타입이 다름 더블 = 더블클래스타입 그래도 문제없이 대입 되고 있음 자동으로 언박싱
		double dNum5 = double3;
		
		System.out.println(dNum4 + dNum5);		
		System.out.println(integer + integer2);	// 얘도 연산이 됨 integer끼리 연산? 자동으로 언박싱이 되어서 연산가능		
		System.out.println(double4 + double5 + dNum4); // 인스턴스 + 인스턴스 + 기본자료형 불가능한데 가능함 자동 언박싱

		
	}
}
