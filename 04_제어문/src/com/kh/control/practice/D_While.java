package com.kh.control.practice;

import java.util.Scanner;

public class D_While {
	/*
	 * while [표현법]
	 * 
	 * [초기식](생략 가능)
	 * 
	 * while(조건식){ ..(반복 실행할)실행 코드..
	 * 
	 * [증감식, 분기문] //반복문을 빠져나갈 수 있는 구문임. 필수는 아닌데 없으면 무한히 돌아감 }
	 */

	public void method1() {

		// 1부터 랜덤값(1 ~ 10)까지의 합계 221122 1교시 처음
		int sum = 0; // 1부터 랜덤값까지
		int random = (int) (Math.random() * 10 + 1); // 랜덤값 가져올 수식 221122 1교시 22분 c포문의 메소드 3 참고
														// 랜덤값 가져올
		int i = 0; // 제어 할 변수가 필요하면 반드시 while 밖에 둬야 함

		while (i <= random) {
			sum += i; // 여기까지만 쓰면 빠져나가지 못하고 무한루프에 걸림 sum은 0이라 무한대 밑에 조건식을 붙여줌

			i++; // 증감식 -> 무한루프에서 빠져나올 수 있도록
		}

		System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
	}

	/*
	 * 사용자에게 계속 문자열을 입력 받고 그 문자열을 출력한다.(무한으로) 단, "exit" 문자열을 사용자가'입력'하면 프로그램을 종료한다.
	 */
	public void method2() {
		String str = "";
		Scanner scanner = new Scanner(System.in);
//		
//		while(true){ //계속 입력 받아서 출력될수있게 while쓰고 조건에 true써줌
//			System.out.print("문자열을 입력해 주세요. > ");	//사용자에게 문자열 입력올 때까지 대기
//			str = scanner.nextLine();					//사용자에게 입력받고
//
//			System.out.println(str);					//출력하고
//																//위 아래 식 계속 반복임			
//			
//			if(str.equals("exit")) {				//문자열 동등 연산은 변수 == "문자열" 안 쓰고  str.equals("문자열") 이렇게써 줌
//				System.out.println("프로그램을 종료합니다");
//				scanner.close();
//				
//				break;			//cast 외 while에서도 break가 빠져나가게 해주는 역할

		// 위의 방법도 아래 방법도 맞음 다양한 경우의 수 존재
		// 여러 방법으로 해보기 최대한 간결하고 짧게 효율적으로 만들어 보기

		while (!str.equals("exit")) {
			System.out.print("문자열을 입력해 주세요. > ");
			str = scanner.nextLine();

			System.out.println(str);

		}

		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

	/*
	 * 실습 문제 1
	 * 
	 * 사용자가 입력한 단을 출력하시오.
	 * 
	 * 
	 */
	public void practice() { // 221122 2교시
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("단 수(2 ~ 9)를 입력해 주세요. > ");
		num = scanner.nextInt();

		if (num >= 2 && num < 10) {
			int i = 1;

			while (i <= 9) {
				System.out.printf("d% X %d = %d\n", num, i, (num * i));

				i++;
			}
		}

		scanner.close();
	}

	/*
	 * do-while 문 //221122 2교시 10분~ [표현법]
	 * 
	 * [초기식] //반복문을 제어할
	 * 
	 * do{ .. 실행 코드 ..
	 * 
	 * [증감식, 분기문] } while(조건식); //반드시 세미콜론 붙이기
	 */
	public void method3() {
		// 조건에 상관없이 무조건 한 번은 출력이 되는지 확인
		int number = 1;

		while (number == 0) { // 조건 거짓 number는 1이라서 -> 실행 안 됨
			System.out.println("while문 실행");
		}

		do {
			System.out.println("do-while문 실행");
		} while (number == 0); //// 조건 거짓 number는 1이라서 -> 실행 됨
								// 조건이 거짓이라도 한 번은 실행이 됨
	}

	/*
	 * 221122 2교시 20분~ 예시)
	 * 
	 * ============ 메뉴 =========== 1. C_For 클래스의 method1() 실행 2. C_For 클래스의
	 * method2() 실행 3. C_For 클래스의 method3() 실행 Q(q). 프로그램 종료
	 * ============================ > q
	 * 
	 * 프로그램이 종료됩니다.
	 */
	public void method4() {
		char menu = '\u0000'; // 2교시 25분~ 설명!!!!!!!!!! 왜 int는 따로 안 만드는지
		Scanner scanner = new Scanner(System.in);
		C_For example = new C_For();
		
//		while(true) {	...	}		//무한반복 식
//		for(;;) {	...	}			//무한반복 식

		do {
			System.out.println("============ 메뉴 ===========");
			System.out.println("1. C_For 클래스의 method1() 실행");
			System.out.println("2. C_For 클래스의 method2() 실행");
			System.out.println("3. C_For 클래스의 method3() 실행");
			System.out.println("Q(q). 프로그램 종료");
			System.out.println("============================");
			System.out.print("> ");

			menu = scanner.nextLine().charAt(0);		//char 문자타입 next만 엔터빼고, nextLine 그대로 ???

			switch (menu) {
				case '1':								//위 문자 타입이라 숫자인데도 '1'이렇게 씀
					example.method1();
					
					break;
				case '2':
					example.method2();

					break;
				case '3':
					example.method3();

					break;
				case 'Q':
				case 'q': 		// 대소문자 같은 동작 해서 Q에 break 따로 걸 필요 없음
					System.out.println("프로그램이 종료됩니다.");
					
					scanner.close();
					
					return;		// 종료시키기	break 걸면 다시 돌아가서 반복됨 2교시 42분~

				default:
					System.out.println("메뉴를 잘못 입력했습니다.");
			}
		} while (true);

	}
}
