package com.kh.dimension.practice;

import java.util.Arrays;

public class DimensionalArray {
	/*
	 * 2차원 배열
	 * 
	 * 1. 2차원 배열의 선언
	 * 	 [표현법]
	 * 		자료형[][] 배열명;		cf)1차원 배열은 행 하나가 쭉 인덱스가 [] 하나
	 * 		자료형 배열명[][];
	 *		자료형[] 배열명[]; 	
	 *
	 * 2. 2차원 배열의 생성
	 * 	 [표현법]
	 * 		배열명 = new 자료형[행 크기][열 크기];
	 * 
	 * 3. 2차원 배열의 선언과 생성을 동시에 진행
	 *	 [표현법]
	 * 		자료형[][] 배열명; = new 자료형[행 크기][열 크기];
	 * 		자료형 배열명[][]; = new 자료형[행 크기][열 크기];
	 *		자료형[] 배열명[]; = new 자료형[행 크기][열 크기];
	 *
	 * 4. 2차원 배열의 초기화
	 *	1) 배열 변수와 인덱스를 이용한 초기화
	 *	 배열명[0][0] = 값;
	 *	 배열명[0][1] = 값;
	 *	 배열명[1][0] = 값;
	 *	 ...					//이런 식으로 직접 지정해서 직접 입력
	 *
	 *	2) 중첩 반복문을 이용한 초기화
	 *	 밖에 있는 반복문이 행 안에 있는 반복문이 열
	 *
	 *	3) 선언과 동시에 초기화							// 배열 안의 요소로 또 다른 배열을 갖는 것. 안중괄호 행 한줄 채움
	 * 		자료형[][] 배열명; = new 자료형[행 크기][열 크기] {{값, 값, ..}, {값, 값, ..}, {값, 값, ..}, ...}
	 * 		자료형 배열명[][]; = new 자료형[][] {{값, 값, ..}, {값, 값, ..}, {값, 값, ..}, ...}
	 * 		자료형[][] 배열명; = {{값, 값, ..}, {값, 값, ..}, {값, 값, ..}, ...}
	 * 		자료형 배열명[][]; = {{값, 값, ..}, {값, 값, ..}, {값, 값, ..}, ...}
	 */
	
	
	
	// 2차원 배열의 선언, 생성, 초기화
	public void method1() {
		
		// 2차원 배열의 선언
		int[][] iArray;	// 메모리(Stack)에 정수형 2차원 배열의 주소를 보관할 공간이 할당된다. (참조변수)
		
		// 2차원 배열의 선언과 동시에 생성 초기화
		int iArray2[][] = new int[][] {{15, 14, 13, 12, 11},{10, 9, 8, 7, 6},{5, 4, 3, 2, 1}};
//		int iArray2[][] = {{15, 14, 13, 12, 11},{10, 9, 8, 7, 6},{5, 4, 3, 2, 1}};
//						  ㄴnew int[][] 생략 가능.	선언과 동시에 생성 초기화 하는 경우에만 생략 가능! 따로 나눠서 하는 경우 불가
		
		// 2차원 배열의 생성
		iArray = new int[3][5];	//[행] [열]	// 메모리(Heap)에 총 15개의 정수형 데이터를 저장할 수 있는 2차원 배열 생성
		
		
		/*
		 * 2차원 배열의 초기화
		 * (초기화 예시)
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 * 
		 * 바깥쪽 for 문 -> 행의 갯수만큼 반복해서 처리
		 * 안쪽 for 문 -> 열의 갯수만큼 반복해서 처리
		 */
		
			// 행의 길이 출력
		System.out.println(iArray.length);		//참조변수의 길이 = 행의 길이
		
			// 각 행별 열의 길이 출력
		System.out.println(iArray[0].length);	//0번 행의 열의 길이 5
		System.out.println(iArray[1].length);	//1번 행의 열의 길이 5
		System.out.println(iArray[2].length);	//2번 행의 열의 길이 5
		
		// 반복문을 통한 값의 초기화
		
		int value = 1;	// 초기화 하면 들어갈 값
		
		for (int i = 0; i < iArray.length; i++) {			//i는 0 1 2 세 번 반복
			for (int j = 0; j < iArray[i].length; j++) {	//j는 0 1 2 3 네 번 반복
				iArray[i][j] = value++;			//5교시 15분 논리 설명 인강 이해
			}
		}
		
		
		// 값을 출력
		for (int i = 0; i < iArray.length; i++) {		//행 길이 iArray
			for (int j = 0; j < iArray[i].length; j++) {//열 길이 iArray[i]
				System.out.printf("%2d ", iArray[i][j]);
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		// 생성과 동시에 초기화된 2차원 배열의 출력
		for (int i = 0; i < iArray2.length; i++) {
			for (int j = 0; j < iArray2[i].length; j++) {
				System.out.printf("%2d ", iArray2[i][j]);
			}
			
			System.out.println();
		}
		
		
	}

	
	
	// 문자형 2차원 배열의 선언, 생성, 초기화
	public void method2() {
		// 2차원 배열 선언 및 생성 (문자열)
//		String[][] array = new String[3][3];

		// 2차원 배열의 선언 생성, 초기화를 동시에 진행
//		String[][] array = new String[][] {
//			{"Java", "Oracle", "HTML"},							//배열 안의 배열 보기 좋게 정리한 것
//			{"CSS", "JS", "jQuery"},
//			{"JSP", "Spring", "Docker"}
//		};

		String[][] array = {							// 위와 동일. 생성 생략한 것
			{"Java", "Oracle", "HTML"},							
			{"CSS", "JS", "jQuery"},
			{"JSP", "Spring", "Docker"}
		};
		
		/*
		 * 2차원 배열의 초기화 (문자열)
		 * 예시)
		 * Java	Oracle	HTML
		 * CSS	JS		jQuery
		 * JSP	Spring	Docker
		 */
//		// index로 직접 넣어서 초기화
//		array[0][0] = "Java";
//		array[0][1] = "Oracle";
//		array[0][2] = "HTML";
//		
//		array[1][0] = "CSS";
//		array[1][1] = "JS";
//		array[1][2] = "jQuery";
//		
//		array[2][0] = "JSP";
//		array[2][1] = "Spring";
//		array[2][2] = "Docker";
		
		
		//반복문을 사용한 2차원 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int  j = 0; j < array[i].length; j++) {
				System.out.printf("%s\t", array[i][j]);
			}
			
			System.out.println();
		}
		
			
	}
	
	
	
	// 가변 배열											221123 6교시 다시 듣기 이해 0
	public void method3() {
		
	// 가변 배열의 선언, 생성, 초기화
		
		// 가변 배열의 선언, 생성
//		int[][] arr1 = new int[3][];		//행의 길이는 지정 안 해주면 에러 발생. 열의 길이는 지정 안 해줘도 지장 없음
		
		// 가변 배열의 선언, 생성, 초기화 동시에
//		int[][] arr1 = new int[][] {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
		int[][] arr1 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};		// 생성 생략 가능
		
		// 각 행에 다른 1차원 배열을 참조할 수 있도록 생성
		arr1[0] = new int[2];	// 0행은 2열
		arr1[1]	= new int[3];	// 1행은 3열
		arr1[2]	= new int[5];	// 2행은 5열
		
		// 가변 배열의 출력				// 왜 0 나오나요? 초기화를 안 해서 기본값이 나옴. 기본값 = 0
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {	//첫번째 행은 길이 2, 두번째 행은 길이 3, 세번째 행은 길이 5 나올것
				System.out.printf("%2d ", arr1[i][j]);
			}
			
			System.out.println();
		}
	
	}
	
	

	
}
