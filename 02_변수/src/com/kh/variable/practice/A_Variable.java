package com.kh.variable.practice;

public class A_Variable {
	public void printValue() {
		//변수를 사용하지 않으면
		System.out.println(10 * 2 * 3.141592); 	// 원의 둘레 반지름 * 2 * 3.14...
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 반지름 * 반지름 * 3.14...
		
		//변수를 사용하면
		int r = 10; 			// r = 반지름				변수 선언 한 것 int로
		int h = 20;				// h = 높이
		double pi = 3.141592; 	//double =  실수형 자료형	변수 선언 한 것 
				// = 는 대입연산 =기준 오른쪽에 있는 값을 왼쪽 변수명에 대입해준다는 의미
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);
		System.out.println(pi * r * r * h);		//원기둥 부피 공식
			//일일히 다 바꿔줄 필요가 없고 변수 선언에서만 바꾸면 됨
	}
	//메소드는 여러개 만들 수 있음 (221117 7교시 19분)
	
	
	public void variableTest() {										//메소드 선언
		/*
		 * 변수의 선언
		 * 	[표현법]
		 * 	  자료형 변수명;
		 * 
		 * 		- 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보이다.
		 * 		- 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		 *
		 * 	변수의 초기화
		 * 	 [표현법]
		 *		변수명 = 값;				> '='는 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자이다. 같다는 뜻 아님
		 */
		
		//	논리형
		boolean isTrue;	// 1byte의 논리 값을 담을 수 있는 변수를 선언한다.
		
		//	문자형
		char ch;		// 2byte의 문자(유니코드)를 담을 수 있는 변수를 선언한다.		char = charature
			// 선언과 동시에 초기화	 221117 8교시!!!!!
			// char ch = 'a';
			// char ch = 90;
			// char ch = -90;	> 에러 남   유니코드의 범위는 0 ~ 65,535
				//System.out.println();     더 채워넣기
		
		//	정수형
		byte bNum;		// 1byte의 정수를 담을 수 있는 변수를 선언한다.
		short sNum;		// 2byte의 정수를 담을 수 있는 변수를 선언한다.
		int iNum;		// 4byte의 정수를 담을 수 있는 변수를 선언한다.
		long lNum;		// 8byte의 정수를 담을 수 있는 변수를 선언한다.
		
		//	실수형
		float fNum;		// 4byte의 실수를 담을 수 있는 변수를 선언한다.
		double dNum;	// 8byte의 실수를 담을 수 있는 변수를 선언한다.
		
		
		//	문자열		자바에서 단어나 문장을 문자열이라 한다. 문자 하나 아님!
		//String name;	// 문자열을 가리킬 수 있는 참조형 변수를 선언한다.		221117 7교시 30분!!
			//선언과 동시에 초기화   221117 8교시!!!!
			//String name = "";
			//String name = "문인수";
				//System.out.println("name : " + name);   선언
// 에러잡기8교시		String name = new String("문인수"); 		// 변수 선언 후 값 대입해서 초기화 하는 것까지
		
		//지역 변수를 생성 후 초기화가 되지 않은 경우 사용하려고 하면 에러가 발생한다. 
		// System.out.println(isTrue);		> 에러 남 변수 선언만 하고 값은 대입하지 않았기 때문에
		
		isTrue = true;	// 변수 선언 후 초기화
//		isTrue = 1;		// 에러 발생
		System.out.println(isTrue); 		// 에러 안 남
		System.out.println("isTrue : " + isTrue);//문자열의 다른 자료형을 더하기 연산에 넣으면 하나의 문자열로 봄

	
		bNum = 11;
//		bNum = 128; 	// 에러 발생 byte 값의 범위 -128~127이라서
		sNum = 12;
		iNum = 300;
//		lNum = 9223372036854;	// 에러 발생   > 정수형 리터럴은 기본적으로 int 타입으로 컴파일 된다. int타입 정수형을 넘어버림 그래서 에러가 남  221117 8교시 시작!!!
//		long 타입 리터럴은 숫자 뒤에 l 또는 L을 입력해야 한다
		lNum = 9223372036854l;
		
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		
		
//		fNum = 3.14;	// 에러 발생   > 실수형 리터럴은 기본적으로 double 타입으로 컴파일 된다.   !!!! 플롯 더블 차이가 뭔지!!!
//		float 타입의 리터럴은 숫자 뒤에 f 또는 F를 입력해야 한다.
		fNum = 3.14F;
		dNum = 12.34567;
		
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		
		
		
		
		
		
//		변수의 명명 규칙
//		1) 대소문자 구분
		int number;
		//String number;	//에러  > 자료형이 달라도 변수명이 같으면 에러 발생
		int NUMBER;
		int Number;
		
//		2) 숫자로 시작하면 안 된다.
		int a2g3e4;	//중간에 들어가는 건 가능
		//int 1age;	//숫자로 시작은 불가능
		
//		3) 특수문자는 '_', '$'만 사용이 가능하다.
		int _age;	//특문은 앞에 써도 괜찮다
		int a_g_e;
		int age$;
		// int %age;	에러 _$가 아님
		
//		4) 예약어를 사용하면 안 된다.
		//int public;		// 이미 자바에서 정해진 역할이 있는 애들이라서 쓸 수 없음
		//int void;
		//int class;
		//int int;
		
	}

	public void constant() {
		/*
		 * 	상수
		 * 	  [표현법]
		 * 		final 자료형 변수명;		/ 'final'을 변수 선언 앞에 추가해주면 됨
		 * 
		 *		- 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 *		- 초기화 이후에는 값을 변경할 수 없다.
		 */
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		System.out.println("age = " + age);
		System.out.println("AGE = " + AGE);
		
		age = 25;
//		AGE = 35;	//	에러 발생 final 선언하면 초기화 후 변경 불가능
		
		
		
		
		
		
		
	}

}
