package com.kh.chapter2;

import com.kh.chapter2._class.Person;
//import com.kh.chapter2._class.Phone;		//Phone은 디폴트임 그래서 패키지가 달라서 Phone이라는 클래스를 접근이 불가능함

public class Application {

	public static void main(String[] args) {
		Person ismoon = new Person();
		
//		//Phone 클래스는 접근 제한이 default 클래스로 패키지 외부에서 접근이 불가능하다. 그래서 인스턴스 생성이 불가능
//		Phone phone = new Phone();
			//Phone 클래스랑 동일한 패키지에 있는 클래스에서만 만들 수 있음 ex) person 1*
		
		ismoon.setName("문인수");			// 세터 써서 값 가져와서 초기화
		//참조변수(ismoon)쓰고 점 찍으면 참조변수로 접근이 허용된 멤버(메소드, 필드,,)들을 보여줌. 생성자는 불가
		ismoon.setAge(17);
		
		ismoon.setPhone("애플", "아이폰12미니", "화이트");

		ismoon.whoAreYou();				// 출력
		
	}

}
