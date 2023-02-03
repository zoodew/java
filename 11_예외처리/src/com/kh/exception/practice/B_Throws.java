package com.kh.exception.practice;

import java.io.IOException;

//Java 11 예외처리 3.2 throw		221202 4교시
public class B_Throws {
	public void method1() throws IOException {
		System.out.println("method1() - 호출");
		
		method2();
					
		System.out.println("method1() - 종료");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() - 호출");
		
		method3();
		
		System.out.println("method2() - 종료");
	}
	
	public void method3() throws IOException{
		System.out.println("method3() - 호출");
		
		int random = (int)(Math.random() * 2 + 1);	//랜덤값가져오는 구문
		
		if(random == 1) {
			throw new IOException();	// 메소드 안에서 예외를 발생하면 그 메소드에 예외를 처리할 구문이 필요함 ex) try catch문
										// 지금 이 구문 안에 없음 발생한 메소드가 아니라 다른 데서 처리 할 수 있음
										// 메소드를 호출한 쪽으로 넘겨서 throw IOException
		}
		
		System.out.println("method3() - 종료");		
	}
}
