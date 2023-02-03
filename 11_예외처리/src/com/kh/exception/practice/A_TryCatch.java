package com.kh.exception.practice;


//Java 11 예외처리 3.1 try-catch		221202 4교시
public class A_TryCatch {
				 		
	/*
	 * 	try-catch								221202 4교시 11 예외처리 3.1 try-catch-finally 문
	 * 	  [표현법]
	 * 		try{
	 * 			// 예외가 발생할 가능성이 있는 코드가 위치한다.
	 * 			...
	 * 		} catch(Exception e){
	 * 			// try 블록에서 예외가 발생하면 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다.
	 * 			...
	 * 		} [finally {
	 * 			// 예외가 발생하지 않거나 예외가 발생해 catch 블록을 실행한 후 무조건 실행되는 코드 블록이다. (생략 가능)
	 * 			...
	 * 		}]
	 */
	public void method1() {								//221202 4교시	인강 꼭 듣기 이해 0000!!!!!!
//		int result = 10 / 0;/*예외 발생하는 코드 try문 주석잡고 얘만 찍으면 어떻게 나오는지 확인 > 코드 실행을 멈춤*/
		
		try {			
			int result = 10 / 0;/*예외 발생하는 코드 잘못된 값(0)으로 나누기*/
			System.out.println(result);	
			
		} catch (ClassCastException | ArithmeticException e) {	// 예외가 발생하면 처리하는 곳이 다 다르기 때문에 클래스 아리스 나눠서 확인 발생하는 예외에 따라서 다르게 동작한다.
			System.out.println("ClassCastException 또는 ArithmeticException 예외가 발생했습니다.");	// 멀티캐치
			System.out.println(e.getMessage());	//예외를 던지면 캐치 구문이 받음
		} catch (Exception e) {	// 총괄 exception 위에서 예상하지 못한 예외 발생시 잡는 곳 이것으로만 다 예외 처리 가능 어떤 예외이냐에 따라 다르게 처리해야하면 나누기
			System.out.println(e.getMessage());		//다중캐치 != 멀티캐치	
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행된다.");
		}
		System.out.println();
		
		//위 아래 어떻게 출력되는지 비교하기 예외 있고 없고
		try {
			int result = 10 / 2;/*예외 없는 코드*/
			System.out.println(result);	
			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행된다.");
		}

		
	}
	
	
	
}
