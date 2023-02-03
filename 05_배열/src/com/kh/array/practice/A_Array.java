package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * 배열						221122 5교시!!!!!!!!!!꼭 듣기 인강 꼭꼭꼭!!!!
	 * 
	 * 1. 배열의 선언
	 *   [표현법]
	 *     - 자료형[] 배열명;			
	 *     - 자료형 배열명[];			// []배열이라는 의미를 지닌 대괄호
	 *     
	 * 2. 배열의 생성
	 *   [표현법]
	 *     배열명 = new 자료형[배열 크기];	// 배열 크기 = 실제 몇 개의 데이터를 저장할지
	 *     
	 * 3. 배열의 선언과 생성을 동시에 진행
	 *   [표현법]
	 *     자료형[] 배열명 = new 자료형[배열 크기];
	 *     자료형 배열명[] = new 자료형[배열 크기];
	 *     
	 * 4. 배열의 초기화
	 * 	 1) 배열 변수와 인덱스를 이용한 초기화		//할당한 공간의 값을 초기화
	 * 	   배열명[0] = 값;
	 * 	   배열명[1] = 값;
	 * 	   ...
	 * 
	 *   2) 선언과 동시에 배열 생성 후 초기화
	 *     자료형[] 배열명 = new 자료형[] {값, 값, 값, ...};
	 *     자료형 배열명[] = new 자료형[] {값, 값, 값, ...};
	 *     자료형[] 배열명 = {값, 값, 값, ...};					new 자료형[] 생략은 선언과 동시에 배열 생성 후 초기화인 경우에만 가능
	 *     자료형 배열명[] = {값, 값, 값, ...};
	 *     
	 *   3) 반복문을 이용한 초기화
	 *     뒤에서 이어서 할 것  
	 */

	
	
	// 배열을 사용하지 않을 때
	public void method1() {
		// 다량의 데이터를 기록하고자 할 때

//	// 배열을 사용하지 않을 때		(수업 예시)
//		
//		// 다섯 명의 학생들의 점수
//		int score1 = 90;
//		int score2 = 80;
//		int score3 = 88;
//		int score4 = 78;
//		int score5 = 97;
//			// 점수 출력
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//			// 합계
//		int sum = score1 + score2 + score3 + score4 + score5;
//
//		System.out.println("합계 : " + sum);
//		
			// 다섯 명이라 그나마 가능했지 500명 5000명이면 너무 복잡함 이럴 때 쓰는 게 배열
	

//	//배열을 사용할 때 		(수업 예시)	
//		
//		//다섯 명의 학생들의 점수
//		int[] score = {90, 80, 88, 78, 97};
//			// 점수 출력
//		for(int i = 0; i < score.length; i++) {				//score.length의 length = 배열 score의 자료 길이
//							// 인덱스는 0부터 시작하니까 <=가 아니라 <임 네개 = 0 1 2 3 4
//			System.out.println(score[i]);
//		}
//			//합계
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];	// sum = sum + score[i]
//		}
//		System.out.println("합계 : " + sum);
		
		
	// 배열을 사용 할 때		(내가 실습 한 것)
		
		//변수 선언 생성 초기화 출력
		
		int[] score;
		score = new int[] {90, 80, 88, 78, 97};
		//점수 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d", score[i]);	
		}
		
		System.out.println();
		
		//점수 합계 출력
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		
	}

	
	
	// 배열의 선언, 생성, 초기화
	public void method2() {
		// 변수 선언
		int number;		// 변수 선언을 하면 메모리(stack)에 정수형 데이터를 담을 수 있는 공간이 할당된다. 자료형의 크기에 맞는 공간. 정수형 int는 4byte
		
		// 배열 선언
		int[] iArray1;	// 메모리(stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)	// 얘랑 아래랑 둘이 같음 아무거나 써도 됨
		int iArray2[]; 	// 메모리(stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		double[] dArray1;	// 메모리(stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		double dArray2[];	// 메모리(stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)

		// 배열 생성
//		iArray1 = new int[];	// 배열의 크기를 지정(대괄호인덱스 안에 크기 지정)하지 않으면 에러가 발생한다.
		iArray1 = new int[5];	// new 쓰면 메모리(Heap)에 5개의 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.
		iArray2 = new int[10];	// 메모리(Heap)에 10개의 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.					
		dArray1 = new double[5]; //메모리(Heap)에 5개의 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다. 
		dArray2 = new double[10]; //메모리(Heap)에 10개의 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다. 
	
		
		System.out.println(iArray1);	//주소값이 나옴		[I@71dac704
		System.out.println(iArray2);
		System.out.println(dArray1);
		System.out.println(dArray2);
	
		/*
		 * 배열을 생성하고 초기화(데이터 값 넣어주는 과정)해주지 않아도 문제없이 출력이 된다.
		 * 배열은 따로 초기화하지 않는다면, JVM이 지정한 기본 값으로 배열이 초기화된다. 그래서 에러 없이 출력 됨
		 * (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리형 : false, 참조형 : null) //하다 보면 익숙해짐 막 억지로 외울 필요는 없음 눈에 바르기
		 */
//		System.out.println(number);
		
		
		for (int i = 0; i < iArray1.length; i++) {
			System.out.printf("iArray[%d] : %d\n", i, iArray1[i]);
		}
		for (int i = 0; i < dArray1.length; i++) {
			System.out.printf("dArray[%d] : %.1f\n", i, dArray1[i]);
		}
		
		// 배열을 초기화하는 for 문
		
		for(int i = 0; i < iArray2.length; i++) {
			iArray2[i]= i + 2;
		}
		
		for (int i = 0; i < dArray2.length; i++) {
			dArray2[i] = i + 1;
		}
		
		// 배열의 값을 출력하는 for 문
				
		for (int i = 0; i < iArray2.length; i++) {
			System.out.printf("iArray2[%d] : %d\n", i, iArray2[i]);
		}
		
		for (int i = 0; i < dArray2.length; i++) {
			System.out.printf("dArray2[%d] : %.1f\n", i, dArray2[i]);
		}
		
	}

	
	
	public void method3() {
		int iArray[] = new int[5];
		
		iArray[0] = 2;
		iArray[1] = 4;
		iArray[2] = 6;
		iArray[3] = 8;
		iArray[4] = 10;		// 실제로 힙 영역에 만들어지는 영역은 여기까지 new int['5']라서
//		iArray[5] = 12;		// 이 영역은 없는데 접근하려 했을 때 -> 에러 발생 

//		for (int i = 0; i <= iArray.length; i++) {		// <= 이면 에러 발생
		for (int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		System.out.println();
		System.out.println(iArray);
		System.out.println(iArray.length);
		/*
		 * 자바에서 해시 코드는 객체(클래스, 배열)를 '식별'하는 하나의 정수값을 말한다.
		 * (메소드를 재정의하지 않으면 기본적으로 객체의 주소값(10진수)을 리턴한다.)
		 * 해시코드라는 것 자체가 자바에서 객체들을 구별할 수 있는 십진수임.
		 * 그런데 기본적으로 실제 메모리에 할당된 주소값이 서로 다르기 때문에 주소값을 가지고 해시코드, 식별자로 쓰는 것
		 * 나중에 재정의로 바꿔줄 수 있음 그 전까지는 기본적으로 객체의 주소값을 가지고 해시코드로 사용하게 되어있음
		 */
		System.out.println(iArray.hashCode());	//1910163204//해시코드 찍으면 주소값 10진수로 표현 // 둘이 같은 값임 표현법이 다를 뿐
		System.out.println(iArray);				//I@71dac704//참조변수 찍으면 주소값 16진수로 표현
		
		// 배열에서 한 번 지정한 크기는 변경이 불가능하다.
		// 따라서 크기를 변경하려면 다시 배열 크기를 지정해서 새로 생성해야 한다.
		iArray = new int[6];
		
		iArray[0] = 2;
		iArray[1] = 4;
		iArray[2] = 6;
		iArray[3] = 8;
		iArray[4] = 10;
		iArray[5] = 12;
		
		for (int i = 0; i < iArray.length; i++) { 
			System.out.println(iArray[i]);

		System.out.println();
		System.out.println(iArray);				// 출력해보면 위의 기존 int[5]와는 주소값이 다름 ->
		System.out.println(iArray.length);			// -> 아예 배열을 새로 만들어서 사용
		System.out.println(iArray.hashCode());
		
		// 참조 변수는 힙 영역의 객체(클래스, 배열)을 참조하지 않는다는 뜻으로 null 값을 가질 수 있다.
//		iArray = null;		//참조하고 있던 걸 끊어주는 역할.		후에 아무것도 연결되지 않았다는 걸 알아차리면 가비지 컬렉터가 지워버림 
		
		// null 값을 가지고 있는 참조 변수를 사용하면 NullPointerException이 발생한다.
//		System.out.println(iArray);			//null 나옴 비어있는 게 아니라 'null'도 하나의 '값'임. 비어있다는 뜻의 값임.
//		System.out.println(iArray.length);		//아무것도 없는 애한테 너 길이가 뭐야 물어보니 에러뜸
//		System.out.println(iArray.hashCode());	//아무것도 안가리키고 있는데 너 주소가 뭐야 물어보니 에러뜸
		
		}
	} 


	
	// 배열의 선언, 생성, 초기화를 동시에 진행하기
	public void method4() {
		int[] iArray1 = new int[] {1, 2, 3, 4, 5};	// 값의 갯수만큼 자동으로 크기가 할당된다.
										// ㄴ 값의 목록을 나열할 때는 데이터 타입 맞춰서 해줘야 함. 정수형이면 정수값 실수형이면 실수값 문자형이면 문자값
//		int[] iArray2 = {8, 7, 6, 5, 4, 3, 2,};		// new 연산자를 사용하지 않아도 값의 갯수만큼 자동으로 크기가 할당된다.
					// ㄴ 위처럼 선언 생성 초기화를 동시에 할 때에는 new~[]을 생략할 수 있다
		int[] iArray2;					//	-	
//		iArray2 = {8, 7, 6, 5, 4, 3, 2}		-> 선언 생성 초기화가 나눠서 이루어 질 때에는 생략 불가능 하다
		iArray2 = new int[] {8, 7, 6, 5, 4, 3, 2};
		
		
		System.out.println(iArray1.length);
		System.out.println(iArray2.length);
		System.out.println(Arrays.toString(iArray1));
		System.out.println(Arrays.toString(iArray2));
		
	
		
		
		// 문자열 입력 받아서 그 값을 나열하는 법
		String[] fruitArray = new String[5];
		
		System.out.println(Arrays.toString(fruitArray));
			/*		참조변수 221122 7교시 16:30
			 * 기존의 문자열 변수를 만들면 그 변수 안에 문자열을 저장하는 게 아니라 문자열의 주소를 저장
			 * 문자열의 배열을 만들면 배열 요소 안에 바로 문자열이 들어가는 게 아니라 문자를 참조할 수 있는 참조변수가 들어감
			 * 		ㄴ 어딘가에 문자열이 저장이 되면 그 문자열을 참조할 수있는 주소값이 들어감
			 * 문자열 다섯 개를 참조할 수 있는 배열을 만든 것임 이 참조 변수가 비어있으면 안되니까 JVM이 null로 초기화를 해 준 것
			 * 
			 */
		
		Scanner scanner = new Scanner(System.in);		
		
		
		// 0번 인덱스부터 4번 인덱스까지 반복으로 사용자에게 문자열을 입력받아 해당 인덱스에 사용자가 입력한 값을 넣는다.
		for (int i = 0; i < fruitArray.length; i++) {
			System.out.print("과일 입력 > ");
			
			fruitArray[i] = scanner.nextLine();			// 값 초기화	//사용자가 입력한 문자열을 담아줌
		}
		
		System.out.println(Arrays.toString(fruitArray));		// 사용자가 입력한 값 넣은 배열 예쁘게 정리해서 보여줌
		
		scanner.close();
				
	}

	
	
	/*
	 * 실습 문제 1
	 * 사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고
	 * 생성된 배열의 크기만큼 반복문을 실행하여 랜덤값을(1 ~ 100) 배열의 저장하고 출력한다.
	 * 
	 * 예시)
	 * 정수값을 입력해 주세요. > 3
	 * 
	 * numbers[0] : 77
	 * numbers[1] : 88
	 * numbers[2] : 6
	 */
	public void practice1() {				
		
//		내가 푼 부분
		
		int num = 0;		// 변수 초기화
		int[] array = null;	// 배열 값 0으로
		
		Scanner scanner = new Scanner(System.in);		//배열 생성 사용자로부터 정보값 받아옴
		System.out.print("정수값을 입력해 주세요. > ");
		
		num = scanner.nextInt();
		
		array = new int[num];//배열 생성
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d} : %d\n", i, array[i]);
		}
		
		
		

//		선생님 예시 코드
		
//		int size = 0;
//		int[] numbers = null;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수값을 입력해 주세요. > ");
//		size = scanner.nextInt();
//		
//		numbers = new int[size];
//		
//		for (int i = 0; i < numbers.length; i++) {				//값을 대입하는 반복문
//			numbers[i] = (int) (Math.random() * 100 +1);
//		}
//		
//		for (int i = 0; i < numbers.length; i++) {				//값을 출력하는 반복문
//			System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
//		}
		scanner.close();
		
	}
	

	

		
			
	
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자에게 3명의 키를 입력받아 배열에 저장하고 
	 * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
	 * 
	 * 예시)
	 * 키 입력 > 180.0
	 * 키 입력 > 177.3
	 * 키 입력 > 168.2
	 * 
	 * 총합 : 525.5
	 * 평균 : 175.2
	 * 
	 */
	public void practice2() {
		double sum = 0.0;
		double avg = 0;			//0.0 안 해도 상관없음 형변환 됨
		double[] array = new double[3];
		
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) { 		//입력 받을 때 쓰는 반복문
			System.out.print("키 입력 > ");
			array[i] = scanner.nextDouble();
			
		}
		
		
		for (int i = 0; i < array.length; i++) { 		//합계 구할 때 쓰는 반복문
			sum += array[i];	// sum = sum + array[i];
		}
		
		avg = sum / array.length;
		
		System.out.println();
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.1f", avg);
		
		scanner.close();
		
		
	}
	
}

