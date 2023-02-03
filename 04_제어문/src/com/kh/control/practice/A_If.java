package com.kh.control.practice;

import java.util.Scanner;

public class A_If {
		
		/*
		 * if문(method1에서 할 실습)
		 * 	 [표현법]
		 * 		if(조건식){
		 * 			..실행 코드..
		 * 		}
		 * 
		 *	  - 조건식의 경우에는 비교 연산자, 논리 연산자를 주로 사용한다.
		 *	  - 조건식의 결과가 true이면 중괄호({}) 블록을 실행한다.
		 *	  - 조건식의 결과가 false이면 중괄호({}) 블록을 실행하지 않는다. 
		 */
		public void method1() {
			// 입력받은 정수값이 홀수인지 짝수인지 판별하라
			int number = 0;		//메소드 안에 지역변수임 이거를 항상 초기화 하기 왜냐면 앞에 나온 거 때문에 오류 날 수 있어서 숫자값 = 0 하는 게 초기화 문자열은 = "" 빈문자 넣기
			Scanner scanner = new Scanner(System.in);	//사용자 값 가져오는 거 scanner crtrl space java util 임포트 구문 필요함 
			
			System.out.print("정수값 입력 > ");
			
			number = scanner.nextInt();
			
			if((number % 2) == 0) {
				System.out.printf("%d는 짝수이다.\n", number);
			}											//참이면 여기서 완료 거짓이면 밑으로
			if((number % 2) != 0) {
				System.out.printf("%d는 홀수이다.\n", number);
			}			
			scanner.close();
		}
		
		
		
		/*
		 *  if-else문(method2에서 할 실습
		 * 	 [표현법]
		 * 		if(조건식){
		 * 			..실행 코드..
		 * 		} else{
		 * 			..실행 코드..
		 * 		}
		 * 
		 *	  - 조건식의 결과가 true인 경우 if문 안의 코드를 실행한다.
		 *	  - 조건식의 결과가 false인 경우 else문 안의 코드를 실행한다.
		 */
		 public void method2() {			//메인 메소드에서 A_If 메소드2 실행시킬수있게 수정하는법 221121 2교시 10분
			int number = 0;			//메소드 안에 지역변수임 이거를 항상 초기화 하기! 숫자값 = 0 하는 게 초기화임 문자열은 = "" 빈 문자 넣기
			Scanner scanner = new Scanner(System.in);	//사용자 값 가져오는 거 scanner 치고 커서 crtrl space java util 임포트 구문 필요함 
				
			System.out.print("정수값 입력 > ");
			number = scanner.nextInt();

			if ((number % 2) == 0) {
				System.out.printf("%d는 짝수이다.\n", number);
			}else { 
				System.out.printf("%d는 홀수이다.\n", number);
			}	
						//if나 else에서 코드문이 한 줄이면 중괄호{}없어도 실행이 됨 그렇지만 굳이 하지는 말기 되도록 넣기 가독성 추후 수정 용이위해
//							if ((number % 2) == 0) 
//								System.out.printf("%d는 짝수이다.\n", number);
//						 	else 
//								System.out.printf("%d는 홀수이다.\n", number);

			
			
			scanner.close();
		 }
		

		 
		 public void method3() {
			 //사용자에게 이름을 받아서 본인 이름이 맞는지 확인하기
			 String name = "";							//사용자에게 입력받을 이름을 저장할 입력 변수
			 Scanner scanner = new Scanner(System.in);	//스캐너 만들기
			 
			 System.out.print("이름을 입력하세요. > ");
			 name = scanner.nextLine();					//이름 받아오기
			 
			 
//			 (중요 핵심!!) 문자열의 동등 비교시에는 String 클래스에서 제공하는 equals() 메소드를 이용해서 비교해야 한다.
			 		//아직 어렵다면 eqauls 뒤에서 또 배우는 거니까 문자열은 equals라고 알아둔다.
//			 System.out.println("이주희" == "이주희");					//true //같은 주소값에 저장됨
//			 System.out.println("이주희" == new String("이주희"));		//false //new라는 키워드를 쓰면 "다른" 메모리 주소값에 저장됨
//			 System.out.println(new String("이주희").equals("이주희"));	//true		//221121 2교시 30분~ 주소값을 비교하는게 아니라 실제 문자를 비교하는 것
			 
//			 if(name.equals("이주희")) {			//이줄 아랫줄 둘 다 가능
			 if("이주희".equals(name)){
				 System.out.println("본인이다.");
			 } else {
				 System.out.println("본인이 아니다.");
			 }
			 

			 
			 scanner.close();
		 }
		
		 
		 
		 /*
		  * if-else if-else문		조건이 여러 개 일 때
		  *   [표현법]
		  * 	if(조건식){				//참이면 실행코드 실행
		  * 		..실행 코드..
		  * 	} else if(조건식){				//if조건식이 거짓이면 else if로 내려와서 조건따짐 참이면 실행 거짓이면 다음 else if로
		  * 		..실행 코드..
		  * 	} else if(조건식){
		  * 		..실행 코드..
		  * 	} [else {				//위의 모든 조건을 만족하지 않고 내가 else구문을 작성해 뒀다면 else 실행코드가 실행됨
		  * 		..실행 코드..
		  * 	}]						//대괄호는 생략이 가능하다는 뜻!! 
		  *   - 같은 비교 대상으로 여러 개의 조건을 제시할 때 사용한다.
		  *   - 조건이 모두 false가 나오게 되면 else 구문을 실행한다.(else 구문은 필수가 아님 생략 가능)
		  */
		 public void method4() {
			 		
			 	   //변수명 한 번에 바꾸고 싶을 때 변수명에 커서 두고 alt+shift+r
			 char alphabet = '\u0000';		//변수 초기화. 유니코드 표에 0000이 빈 문자임 역슬래시u(16진수에 해당하는 유니코드) 뒤에 0000 
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.print("문자 입력 > ");
			 alphabet = scanner.nextLine().charAt(0);
			 
			 
			 if ((alphabet >= 'A') && (alphabet <= 'Z')) {			//대문자 조건식
				 System.out.printf("%c는(은) 알파벳 대문자이다.", alphabet);
			 } else if ((alphabet >= 'a') && (alphabet <= 'z')) {	//소문자 조건식
				 System.out.printf("%c는(은) 알파벳 소문자이다.", alphabet);
			 } else {									//알파벳 아님
				 System.out.printf("%c는(은) 알파벳이 아니다.", alphabet);
			 }
					 
			 
			 scanner.close();
			 
		 }
		 
		 
		 
		 
		 /*
		  * 실습 문제1						221121 3교시
		  * 
		  * 두 정수를 입력받고 + 또는 -를 입력받아서 계산을 출력하라
		  * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
		  * 
		  * 예시)
		  *   첫 번째 수 > 3
		  *   두 번째 수 > 4
		  *   연산자 입력(+ 또는 -) > +
		  *   
		  *   3 + 4 = 7
		  */
		 public void practice1() {
			 int num1 = 0;
			 int num2 = 0;
			 char operator = '\u0000';
			 Scanner scanner = new Scanner(System.in);
			 
			System.out.print("첫 번째 정수를 입력하세요.");
			num1 = scanner.nextInt();
			
			System.out.println("두 번째 정수를 입력하세요.");
			num2 = scanner.nextInt();
			
			scanner.nextLine();
			System.out.println("+, - 중 하나의 연산자를 선택하세요.");
			
			operator = scanner.nextLine().charAt(0);
			
			 System.out.println();
			 if((operator != '+') && (operator != '-')) {
				 System.out.print("잘못 입력했습니다.");
			 } else if(operator == '+') {
				 System.out.printf("%d %c %d = %d", num1, operator, num2, (num1+num2));
			 } else if(operator == '-') {
				 System.out.printf("%d %c %d = %d", num1, operator, num2, (num1-num2));
			 }
			 scanner.close();
		 }
		 
		 
		 /*
		  * 실습 문제 2
		  * 사용자에게 점수(0 ~ 100)를 입력받아서 점수별로 등급을 출력하라
		  *   - 90점 이상은 A 등급
		  *   - 90점 미만 80점 이상은 B 등급
		  *   - 80점 미만 70점 이상은 C 등급
		  *   - 70점 미만 60점 이상은 D 등급
		  *   - 60점 미만 F 등급
		  * 
		  *  예시)
		  *    점수 > 90
		  *    당신의 점수는 90점이고 등급은 A입니다.
		  */
		 public void practice2() {				//선생님 예시 코드 보기!!
			 int testScore = 0;
			 
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.print("점수를 입력하시오. > ");
			 
			 testScore = scanner.nextInt();
			 
			 if(testScore >= 90) {
				 System.out.printf("당신의 점수는 %d점이고 등급은 A입니다.",testScore);	 
			 } else if((testScore < 90) && (testScore >= 80)) {				//굳이 90보다 작다는 식 안 써도 됨 위에서 조건 체크 후 걸린 것들 이라서(쌤 예시 보기)
				 System.out.printf("당신의 점수는 %d점이고 등급은 B입니다.", testScore);
			 } else if((testScore < 80) && (testScore >= 70)) {
				 System.out.printf("당신의 점수는 %d점이고 등급은 C입니다.", testScore);
			 } else if((testScore < 70) && (testScore >= 60)) {
				 System.out.printf("당신의 점수는 %d점이고 등급은 D입니다.", testScore);
			 } else {
				System.out.printf("당신의 점수는 %d점이고 등급은 F입니다.", testScore); 
			 }
			 
			 scanner.close();
			 
		 }
		
			 
}
		 
		 

	