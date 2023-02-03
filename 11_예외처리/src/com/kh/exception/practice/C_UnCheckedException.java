package com.kh.exception.practice;

import java.util.Scanner;

//Java 11 예외처리 2.2 UnCheckedException		221202 5교시
public class C_UnCheckedException {
	
	/*										221202 5교시
	 * UnCheckedException
	 * 	- 컴파일 시 예외 처리 코드가 있는지 검사하지 않는 예외를 말한다.
	 * 	- RuntimeException 클래스를 상속하고 있는 예외를 UnCheckedException이라 한다.
	 * 	- 프로그램 실행할 때 문제가 발생되는 것으로 충분히 예측이 가능하기 때문에 조건문들을 통해서 처리가 가능하다.
	 *
	 * RuntimeException의 후손들		강의 35분쯤부터 듣고 어떨 때 나는 에러인지 정리하기
	 * 	- NullPointerException
	 * 	- ClassCastException
	 * 	- ArithmeticException
	 * 	- ArrayIndexOutOfBoundsException
	 * 	- NegativeArraySizeException
	 */
	public void method1() {
		// ArithmeticException				221202 5교시
		
		// 사용자로부터 값을 입력 받아서 그 값을 나눌 때 예상 가능한 예외를 처리하는 방법
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);		//사용자로부터 표준입력을 받는 system in 강의듣고 적어놓기! 20분쯤

		System.out.print("정수 > ");
		number1 = scanner.nextInt();
		
		System.out.print("정수 > ");
		number2 = scanner.nextInt();

//		예외 처리 방법 1) 조건문		
//		if(number2 == 0) {	// 예측가능한 예외 처리 구문
//			System.out.println("0으로는 나눌 수 없습니다.");
//			
//			scanner.close();
//			
//			return;	// 호출된 것을 메소드1쪽으로 돌리기 실행되지 않게
//		}
//		
//		result = number1 / number2;
//		
//		System.out.println("result : " + result);
//		
//		scanner.close();
		
//		예외 처리 방법 2) try catch문	
		try {
			result = number1 / number2;
			System.out.println("result : " + result);			
		
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} finally {
			scanner.close();	//finally는 무조건 수행이 되니까 scanner.close여기에 넣기
		}
		
	}
	
	
	public void method2() {					//221202 5교시
		// ArrayIndexOutOfBoundsException, NegativeArraySizeException 에러 	
		
		// 사용자가 입력 받은 값이 잘못된 에러가 나는 경우를 예측 후 처리
		int size = 0;
		int[] array = null;
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("배열의 길이 > ");
//		size = scanner.nextInt();

//		예외 처리 방법 1) 조건문	ArrayIndexOutOfBoundsException
//		if(size <= 0) {
//			System.out.println("양수를 입력해주세요.");
//			scanner.close();
//				
//			return;
//		}
//		
//		array = new int[size];
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//
//		scanner.close();
		
		
//		예외 처리 방법 2) try catch문	NegativeArraySizeException
//		try {		
//			array = new int[size];
//
//			for (int i = 0; i < array.length; i++) {
//				System.out.println(array[i]);
//			}
//		} catch (NegativeArraySizeException e) {
//			System.out.println("양수를 입력해주세요.");
//		} finally {
//			scanner.close();
//		}
		
		
		
//		예외 처리 방법 3)		1)2) + ArrayIndexOutOfBoundsException	221202 6교시 인강!!!!!
		try {		//예외가 날 것 같아서 확인하는 코드들 try 안에 삽입
			System.out.print("배열의 길이 > ");		//여기서 날 수 있는 에러 배열의 길이를 입력하라는 건데 정수값이 아니라 문자열을 넣는 등의 에러
			size = scanner.nextInt();	

			array = new int[size];

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력하셨거나 잘못된 인덱스에 접근하셨습니다.");
		} catch(Exception e) {	//모든 예외 잡는 exception
			System.out.println("오류가 발생했습니다. 관리자에게 문의해 주세요.");
		} finally {
			scanner.close();
		}

		
	}
}
