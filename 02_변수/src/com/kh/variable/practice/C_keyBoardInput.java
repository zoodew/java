package com.kh.variable.practice;		//221118 4교시 사용자가 입력한 값을 변수에 담아서 출력하는 방법

import java.util.Scanner;

public class C_keyBoardInput {
	
	/*
	 * Scanner 클래스     221118 4교시
	 * 	- 사용자로부터 입력되는(컴퓨터 기준 외부에서 받아온것) 정수, 실수, 문자열을 처리하는 클래스이다.(이정도로만 가볍게 이해하기 뒤에서 배움)
	 * 
	 */

	public void input() {
		
		String name = "";
		int age = 0;
		float height = 0;		//0.0f
		char gender = '\u0000'; //빈문자로 하고 싶으면 => \u0000 유니코드임   남 여 한글자로 받으려고 캐릭터(char)로 받음
		Scanner scanner = new Scanner(System.in);
		
		
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (공백 포함)
		 * scanner.nextInt() : 사용자가 입력한 정수를 입력받을 때 사용한다.
		 * scanner.nextDounble() : 사용자가 입력한 실수를 입력받을 때 사용한다.
		 * ...그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXX()로 입력받으면 된다. next 뒤에 커서두고 ctrl space로 확인
		 */
		
		System.out.print("당신의 이름은 무엇입니까? > ");			//여기까지만 미리 뜸
		
		//사용자로부터 입력이 완료되면 해당 값을 변수에 대입한다.
		name = scanner.nextLine();			// 외부에서 자료 받아오는 식!! //이름을 추가해주고 엔터까지 눌러주면
		
		// System.out.println(name.charAt(2)); 			//받아온 정보에서 0 1 2 순으로 하나씩 받아오는 식
		
		System.out.print("당신의 나이는 몇 살입니까? > ");
		age = scanner.nextInt();
		
		System.out.print("당신의 키는 몇입니까?(소수점 첫째 자리까지 입력하세요.) > ");
		height = scanner.nextFloat();
		
		
		scanner.nextLine();
		
		System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
		String line = scanner.nextLine();			//nextChar이 없음 대신 모든 걸 다 가져오는 nextLine으로 받아오고
		gender = line.charAt(0);			
		
		
		
		
		// 출력 System.out.println("당신의 이름은 " + name + "입니다.");	//그 이후에 이게 다시 나옴
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다", name, age, height, gender);
				//이름은 아무거나 받아도 가능한데 나이는 정수만 가능 int로 받아와서 키는 정수만 입력해도 형변환되어서 160.0이렇게 들어감
		
		scanner.close();		//scanner 노란줄뜨는거 close 메소드 쳐줘야 사라짐 마무리 지어주기
		
	}
}
