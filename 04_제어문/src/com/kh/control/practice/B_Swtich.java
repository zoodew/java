package com.kh.control.practice;

import java.util.Scanner;

public class B_Swtich {
	/*
	 * switch문
	 *   [표현법]
	 *   	switch(결과값) {//정수, 문자, 문자열
	 *   		case 값1:		//값1의 값이 (결과값과 같으면 실행 코드 실행. 같지 않으면 그다음 case절로)
	 *   			.. 실행 코드 ..
	 *   			break;			//break 반드시 있어야 함 그래야 빠져나갈 수 있음 break가 없으면 계속 break 만날 때까지 조건식 실행됨
	 *   		case 값2:
	 *   			.. 실행 코드 ..
	 *   			break;
	 *   		...				//case절 갯수 무제한
	 *  		[default :		//if문의 else와 같음 조건에 만족되는 값이 없으면 실행
	 *  			.. 실행 코드 ..
	 *  		]				//생략 가능 []
	 *   	}
	 *   
	 *   - switch 문은 if 문과 마찬가지로 조건문이다.
	 *   - switch 문은 조건식의 결과값에 따라 실행문이 선택된다.
	 *   - if 문과 다르게 실행 코드를 수행하고 자동으로 빠져나가지 못한다. (break가 필요하다.)
	 */

	
	
	/*
	 * switch 실습
	 * 사용자로부터 과일 이름을 입력받는다.
	 * 입력한 과일의 값을 출력한다. 단, 지정한 과일이 없으면 "판매하지 않는 과일입니다." 출력.
	 * 
	 */
	public void method1() {
		String fruit = "";
		int price = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과일 이름 > ");
		
		fruit = scanner.nextLine();			//프룻츠 변수에 스캐너 쩜 넥스트 라인 담음
		
		
		switch(fruit) {						//(입력한 값)
			case "포도":						//입력한 값이 포도이면
				price = 4500;				//가격에 4500넣고
				//break;						//빠져나가겠다		//포도값을 입력하는 상황에서 break를 안 걸면 작동은 되는데 4500원으로 찍히는 게 아니라 그 밑의 break까지 내려가서 9000찍힘
			case "망고":						//입력값이 포도가 아니면 여기로 내려옴 다시 망고이면
				price = 9000;				//9000 넣고
				break;						//빠져나옴
			case "수박":
				price = 20000;
				break;
			default :
				System.out.println("판매하지 않는 과일입니다.");
				
				//break;	//default의 break는 생략해도 가능함 어차피 마지막 식이라서
				return;		//현재 메소드를 종료해버리는 키워드 4교시 31분!
							//return 키워드 이후의 코드는 수행하지 않고 실행 흐름을 메소드를 호출한 쪽(ex여기에선 application)으로 돌려준다
							//사용자 입력값에 복숭아를 넣었을 때 판매하지 않는 과일입니다. 뜨고 그 이후에 %s의 가격은 ~~입니다 이게 나오지 않게 하기 위해
									//여기서 중지 시키는 방법
		}
		
		System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);

		scanner.close();
	}

	
	
	/*
	 * break 생략 기능 사용해서 만드는 실습예제
	 * 
	 * 1~12월까지 입력받아서 해당하는 달의 마지막 날짜를 출력한다.
	 * 
	 * 31일까지 존재하는 월 : 1, 3, 5, 7, 8, 10, 12
	 * 30일까지 존재하는 월 : 4, 6, 9, 11
	 * 28일까지 존재하는 월 : 2
	 */
	public void method2() {
		int month = 0;	//사용자가 입력하는 월정보가 들어갈 변수 초기화
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력하세요. > ");
		month = scanner.nextInt();		//사용자가 입력한 값을 우리가 정한 변수에 담기
		
		if(!(month >= 1 && month <= 12)){		//!(~~~) -> ~~가 아니라면 이라는 뜻임
			System.out.println("1월 ~ 12월까지 입력하셔야 합니다.");
			scanner.close();
			
			return;								//현재 메소드를 종료해버리는 키워드
												//return 키워드 이후의 코드는 수행하지 않고 실행 흐름을 메소드를 호출한 쪽(ex여기에선 application)으로 돌려준다//
		}
		
		
		switch(month) {		// 여러 case가 처리해야 하는 내용이 같을 때 사용하는 법
		case 1:					//1 선택 후 break가 없어서 쭉 내려감
		case 3:	
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
	
			System.out.println("입력하신 월은 31일까지 입니다.");
			break;			//break를 만나야 밖으로 빠져나가기 때문에 case1부터 case 12까지 선택 후 syso 처리함
		
		case 4:				// 그 후 다시 case 4부터 11까지 쭉 break없이 이어감
		case 6:
		case 9:
		case 11:
			System.out.println("입력하신 월은 30일까지 입니다.");
			break;
			
		case 2:
			System.out.println("입력하신 월은 28일까지 입니다.");
			break;			
		}
		
		
		scanner.close();
	}
	
	
	
	/*
	 * 실습 문제
	 * 
	 * 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력받아서 계산을 출력하라
	 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력
	 * 
	 * 예시)
	 * 	첫 번째 수 > 3
	 * 	두 번째 수 > 4
	 * 	연산자 입력(+, -, *, /) > a
	 *  
	 *  연산자를 잘못 입력하셨습니다.
	 */
	
	public void practice() {			// 221121 5교시 실습문제
		int num1 = 3;
		int num2 = 4;
		int result = 0; 	//결과값 받을 변수
		char operator = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 수");
		num2 = scanner.nextInt();
		
		// system out 전에 그 밑에 거 한번 더 적어주기
		scanner.nextLine();
		
		System.out.print("연산자 입력(+, -, *, /) > ");
		
		operator = scanner.nextLine().charAt(0);
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			result = num1 / num2;
			break;
			
		
		default : 
			System.out.println("연산자를 잘못 입력하셨습니다.");
		
			
		
		}
		
		scanner.close();
		
		System.out.printf("%d %c %d = %d", num1, operator, num2, result);
		
		
	}
	
	
	
	
}
