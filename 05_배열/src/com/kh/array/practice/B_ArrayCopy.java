package com.kh.array.practice;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열의 복사
	 * 
	 * 	1. 얕은 복사
	 *  - 배열의 주소만 복사한다.
	 * 
	 * 
	 *  2. 깊은 복사
	 * 	- 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사한다.
	 * 
	 */
	
	
	//얕은 복사
	public void method1() {
		
		//@복사의 개념 이해하기 변수로
//		int num1 = 10;
//		int num2 = num1;
//		
//		System.out.println(num1);		//10
//		System.out.println(num2);		//10
//		
//		num1 = 20;
//		System.out.println(num1);		//20		주소만 복사
//		System.out.println(num2);		//10
		
		
		// 얕은 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin;
		
		System.out.println(Arrays.toString(origin));	// 1, 2, 3, 4, 5	//
		System.out.println(Arrays.toString(copy));		// 1, 2, 3, 4, 5
		
		copy[2] = 30;
		
		System.out.println(Arrays.toString(origin));	// 1, 2, 30, 4, 5
		System.out.println(Arrays.toString(copy));		// 1, 2, 30, 4, 5
		
		
		System.out.println();
		System.out.println(origin);						// 
		System.out.println(copy);						// 
		System.out.println(origin.hashCode());			// 
		System.out.println(copy.hashCode());			// 

	}
	
	
	
	/*
	 * 1. for 문을 이용한 깊은 복사
	 */
	public void method2() {
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];		//꼭 카피 당할 배열의 값 갯수랑 똑같이 할 필요는 없음 더 크게 더 작게도 가능
		
		// 반복문을 통해서 origin에 있는 값들을 copy에 대입한다.
		for (int i = 0; i < origin.length; i++) {	 
			copy[i] = origin[i];
		}
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {	 
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력
		for (int i = 0; i < copy.length; i++) {			// 앞에 다섯 개의 인덱스는 origin이랑 똑같게 나오는데 뒤는 0 0 0 0 0
			System.out.print(copy[i] + " ");					// ㄴ 오리진이 5개의 인덱스만 가져서 뒤는 null값이 나오는 것
		}
		
		
	// 깊은 복사가 됐는지 확인
		
		copy[2] = 30;			// copy의 2번인덱스 값 30으로 바꾸기
		System.out.println();
		
		// 원본 배열 출력
		for (int i = 0; i < origin.length; i++) {	 
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		// 복사본 배열 출력
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
					// 원본은 1 2 '3' 4 5로 나왔고 복사본은 1 2 '30' 4 5 0 0 0 0 0 으로 바뀜
						// ㄴ 따로따로 분리 됨 -> 깊은 복사가 됐다는 뜻
		
		
		System.out.println();
		System.out.println();
		System.out.println(origin);		//출력해서 참조변수의 주소값과 해시코드의 주소값이 다른지 확인
		System.out.println(copy);				// ㄴ 별도로 존재한다는 뜻 깊은복사라는 뜻
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		
	}



	/*
	 * 2. System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사
	 * 	 [표현법]
	 * 		System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시작 위치, 복사할 길이);
	 */
	public void method3() {
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];
												//origin.length를 2로 바꿔보기 //원본의 시작위치에서 몇개를 복사할지
		System.arraycopy(origin, 3, copy, 0, 2);
							//   ㄴ원본 인덱스/ㄴ 0을 1 2로 바꿔보기 //원본 배열에서 복사를 시작하는 인덱스
								//ㄴ몇번부터 복사할지

		// 원본 배열 출력	(04제어문 3.2향상된 for문		 ctrl space의 for each)
								// origin 배열 1,2,3,4,5 값을 가짐
		for(int value : origin) {	//배열(origin) 요소의 갯수만큼 반복 시행, 요소에 담겨있는 값을 꺼내서 변수에 넣고 실행코드 요소 갯수만큼 반복실행
			System.out.print(value + " ");		// ㄴ요소의 갯수만큼 반복 시행되면 종료됨 처음부터 끝까지 요소에 다 접근할 때 향상된 for문 유용
		}															// 모든 요소가 아니라 몇 가지 지정해서 접근할 때 일반 for문 유용
		
		System.out.println();
		
		// 복사본 배열 출력
		for (int value : copy) {
			System.out.print(value + " ");
		}
	
//	깊은 복사가 됐는지 확인
		
		copy[2] = 77;			// copy의 2번인덱스 값 77로 바꾸기
		System.out.println();
		
		// 원본 배열 출력	
		for(int value : origin) {	
			System.out.print(value + " ");		
		}															

		System.out.println();

		// 복사본 배열 출력
		for (int value : copy) {
			System.out.print(value + " ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println(origin);		//출력해서 참조변수의 주소값과 해시코드의 주소값이 다른지 확인
		System.out.println(copy);				// ㄴ 별도로 존재한다는 뜻 깊은복사라는 뜻
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}

	
	
	/*
	 * 3. Arrays 클래스에서 제공하는 copy0f() 메소드를 이용한 깊은 복사					//221123 3교시
	 * 	 [표현법]
	 * 		Arrays.copy0f(원본 배열, 복사본 배열 길이);
	 */
	public void method4() {					
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = null;		//참조변수라 null값 가질 수 있음 아직 배열을 만든게 아니라 null값으로 초기화한것
		
		copy = Arrays.copyOf(origin, 10);
									//ㄴ 숫자 바꾸면서 어떻게 바뀌는지 보기 3 5 20...
		// 원본 배열 출력
		for(int value : origin) {	
			System.out.print(value + " ");		
		}															

		System.out.println();

		// 복사본 배열 출력
		for (int value : copy) {
			System.out.print(value + " ");
		}

		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println(origin);		//출력해서 참조변수의 주소값과 해시코드의 주소값이 다른지 확인
		System.out.println(copy);				// ㄴ 별도로 존재한다는 뜻 깊은복사라는 뜻
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
	
	
	
	/*
	 * 4. 배열의 clone() 메소드를 이용하는 방법
	 * 
	 */
	public void method5() {
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = null;
		
		copy = origin.clone();		// .clone()	->  현재 배열이랑 길이나 복사할 인덱스들도 '똑같이' 생긴 배열을 하나 더 만들고 copy 배열과 연결함

		// 원본 배열 출력
		for(int value : origin) {	
			System.out.print(value + " ");		
		}															

		System.out.println();

		// 복사본 배열 출력
		for (int value : copy) {
			System.out.print(value + " ");
		}

		System.out.println();
		
	
		copy[2] = 70;		//copy의 2번 인덱스 70으로 변경
	
		// 원본 배열 출력
		for(int value : origin) {	
			System.out.print(value + " ");	
		}															

		System.out.println();

		// 복사본 배열 출력
		for (int value : copy) {
				System.out.print(value + " ");
		}
		
		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println(origin);		//출력해서 참조변수의 주소값과 해시코드의 주소값이 다른지 확인
		System.out.println(copy);				// ㄴ 별도로 존재한다는 뜻 깊은복사라는 뜻
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());

	}
}
