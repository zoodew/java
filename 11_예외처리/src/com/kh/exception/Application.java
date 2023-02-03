package com.kh.exception;

import java.io.IOException;

import com.kh.exception.practice.A_TryCatch;

public class Application {
											// r 221202 4교시 B_Throws
	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");	// ㄴ 메인 메소드에서도 예외 떠넘기면 JVM이 예외를 처리함
		
		new A_TryCatch().method1();
//		new B_Throws().method1();
//		new C_UnCheckedException().method1();
//		new C_UnCheckedException().method2();
//		new D_CheckedException().method1();
//		new E_SuperClass().method();
		System.out.println("프로그램 종료");

	}

}
