package com.kh.variable.practice;

public class B_casting {
	/*
	 * 형 변환
	 * 
	 * 	* 컴퓨터에서 값의 처리 규칙(형 변환에서 알아두면 좋은 개념)
	 * 	 1)	대입 연산자(=)를 사용할 때 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다.
	 * 	 2) 같은 자료형의 데이터 끼리 연산이 가능하다. (연산 결과도 같은 자료형으로 나온다.)
	 * 
	 * 	* 형 변환의 종류
	 * 	 1) 자동 형 변환(묵시적 형 변환)
	 * 		- '자동'으로 형 변환이 이루어지기 때문에 개발자가 형 변환을 시켜줄 필요가 없다
	 * 		- 데이터 '표현 범위'가 '작은' 자료형을 '큰' 자료형으로 변환한다. (작은 거 => 큰 거)
	 * 				바이트 크기를 크다 작다의 기준으로 보는 게 아니라 표현 범위를 기준으로 보는 것임
	 * 	 2) 강제 형 변환(명시적 형 변환)
	 * 		[표현법]
	 * 		  (자료형) 데이터;
	 * 
	 * 		- 범위가 '큰' 크기의 자료형의 데이터를 '작은' 크기의 자료형으로 변환하려고 할 때 사용한다. (큰 거 => 작은 거)
	 * 		- (자료형)을 형 변환 연산자라고 한다.
	 * 		- 강제 형 변환의 경우 데이터의 손실이 발생할 수 있다. 큰 걸 작은 거로 바꾸는 거니까
	 * 		
	 * 		
	 */
	
	public void autoCasting() {			//자동 형 변환 221118 1교시
		byte b = 10;
		short s = 12;
		int i = s;		//위는 short타입 그래서 아래 s도 short 아래 왼쪽은 int타입이라 다른데 대입이 됨 
						//short => int 자동 형 변환 된다.
		long l = i;		//int보다 long이 더 크기 때문에 	int > long 자동 형 변환 된다.
		double d = l;	//double(실수형)	long(정수형)이나[타입이 다름 상관 없음] double이 더 크기 때문에 자동 형 변환 된다.
		float f = 100000000000L; //long(정수형) float(실수형)보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능하다.

		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		
		
		double result = 12 + 3.3;	// 12.0 + 3.3 = 15.3  <int result = 12 + 3.3>?????
		//short result2 = b + s;		// byte short 중에는 short가 더 크니까 short으로 만들기 오잉 오류남 왜지?
				// byte, short 타입의 데이터는 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		long result3 = 30 + 30;		//30+30=60, 에러안남 60을 long타입으로 형 변환 후 대입 실제로는 60L이라는 값이 저장
		long result4 = 30 + 30l;	//30l+30l=60l 30을 30l로 변환해줌 결과값 60l을 result4에 대입
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		//캐릭터 
		//char ch = 'A'; 원래는 문자 작은 따옴표
		char ch = 65; // 가능! 실제로는 정수값이나 정수값에 대응하는 유니코드가 대입됨
		
		System.out.println(ch);
	
	}
	

	public void casting() {				//강제 형 변환 221118 2교시
		double d = 4.123345678904556675;
		float f = (float) d;
		//int i = f;  에러남
		int i = (int)f; //소수점 밑에 다 날아감 손실이 있어도 강제 현 변환을 함
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i); 
		
		// int sum = (int) (i + d);	// 4.0 + 4.123455667 = 8.12345677 먼저 (i+d)계산하고 int형으로 바꾼 것
		int sum = i + (int) d;		// 4 + 4 = 8
		
		System.out.println("sum : " + sum);
		
		// 데이터 손실 테스트
		int number = 290;
		// byte bNum = number;	//에러남 int가 더 커서
		byte bNum = (byte) number;
		
		System.out.println("number : " + number);
		System.out.println("bNum :" + bNum);
	}
		
	/*
	 * 실습문제 1.
	 * 영화관의 요금 표는 다음과 같습니다.
	 * 	- 성인 : 10000원
	 * 	- 청소년 : 7000원
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * 
	 * 예시)
	 * 성인 2명 : 20000원
	 * 청소년 3명 : 21000원
	 * 
	 * 총 금액 : 41000원
	 *   		
	 */
	public void practice1() {
		int a = 10000;
		int t = 7000;			//성인 영화표 청소년 영화표 요금 성인 인원수 청소년 인원수 네가지 변수 만들기
								//변수는 최대한 만들 수 있을 만큼 만들기 "계산식도 변수로 만들기" 선생님 표 참고하기
								//계산하는 애들도 변수로 처리하면 나중에 에러 났을 때나 수정 할 때 쉬움
		int result1 = a * 2;
		int result2 = t * 3;
		int result3 = (a *2) + (t * 3);
		
		System.out.println("성인 2명 : " + result1 + "원");
		System.out.println("청소년 3명 : " + result2 + "원");
		System.out.println();
		System.out.println("총 금액 : " + result3 + "원");
		System.out.println();
		// 다시 혼자 연습 해본 거
					/*
					 * int adultPrice = 10000;
					 * int teenPrice = 7000;
					 * int adultCount = 2;
					 * int teenCount = 3;
					 * int adultTotal = adultPrice + adultCount;
					 * int teenTotal = teenPrice + teenCount;
					 * int total = adultTotal + teenTotal;
					 
					 * syso 까지 해보기
					 *
					 */
	
	
	}
		
		
	
	/*
	 * 실습문제 2.
	 * 문인수는 국어 점수 60점 / 영어 점수 70점/ 수학 점수 66점을 받았다.
	 * 문인수의 총점과 평균을 출력하세요.
	 * 
	 * 예시)
	 * 국어 점수 : 60점
	 * 영어 점수 : 70점
	 * 수학 점수 : 66점
	 * 
	 * 총점 : 196점
	 * 평균 : 65.33점
	 */
	
	public void practice2() {
		int l = 60;					//이것도 직접 계산하지 말고 국어점수 영어점수 수학점수 변수도 만들고
									//수식계산 변수도 만들기 변수명 알아보기 쉽게 하기
		int e = 70;
		int m = 66;
		int result4 = l + e + m;
		// double result5 = result4 / 3; //이렇게 하면 정수형으로 떨어짐
						//위 수식 실수형으로 형변환
							//double result5 = result4 / 3.0;    // 196.0 / 3.0 = 65.33333333
							double result5 = (double) result4 / 3;
		
		System.out.println("국어 점수 : " + l + "점" );		//선생님 풀이 보기!!println으로 말고 f로도 해보기
		System.out.println("영어 점수 : " + e + "점" );
		System.out.println("수학 점수 : " + m + "점" );
		System.out.println();
		System.out.println("총점 : " + result4 + "점");
		System.out.println("평균 : " + result5 + "점");
	}
} 
