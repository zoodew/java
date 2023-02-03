package com.kh.variable;

import com.kh.variable.practice.A_Variable;
import com.kh.variable.practice.B_casting;
import com.kh.variable.practice.C_keyBoardInput;

public class Application {

	public static void main(String[] args) {
		//클래스 생성  > 클래스선언 클래스명 =      7교시 10분 실행하는 방법 익히기!!! 이건 필수필수!!!! 
		A_Variable variable = new A_Variable();		// 221118 5교시 02-11변수와 메모리구조 왼쪽은 스택영역에 만들어짐 new heap 영역에 만들어짐
		B_casting casting = new B_casting();
		C_keyBoardInput KeyBoardInput = new C_keyBoardInput();
		
		//메소드 호출
//221117		variable.printValue();
//221117		variable.variableTest();
//221118 1교시			variable.constant();
		
//		casting.autoCasting();
//		casting.casting();
//		casting.practice1();
//		casting.practice2();
		
		KeyBoardInput.input();
		
	}

}
