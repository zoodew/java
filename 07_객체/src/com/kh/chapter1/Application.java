package com.kh.chapter1;

import com.kh.chapter1.object.Student;

public class Application {
	
	/*
	 * 추상화와 캡슐화
	 * 
	 * 1. 추상화
	 * 	- 프로그램에서 사용할 객체들이 가진 공통적인 특성들을 파악하고 불필요한 특성들을 제거하는 과정을 말한다.
	 * 	- 최종적으로 선정된 속성들을 가지고 어떠한 자료형으로, 어떠한 변수명으로 사용할지 정리해서 코드로 작성한다.
	 * 
	 * 2. 캡슐화
	 * 	- 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법을 말한다.
	 * 	- 객체의 데이터에 직접 접근을 막고, 데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공한다.
	 */
	public static void main(String[] args) {
		//	문인수 학생 객체 만들기
		int sNum = 1001;		// 학번 변수
		String name = "문인수";	// 이름 변수
		int age = 18;			// 나이 변수
		int math = 90;			// 수학점수 변수
		int eng = 70;			// 영어점수 변수
		
		int sum = math + eng;
		double avg = sum / 2.0;
		
		//	홍길동 학생 객체 만들기
		int sNum2 = 1002;
		String name2 = "홍길동";
		int age2 = 30;
		int math2 = 90;
		int eng2 = 60;
		int sum2 = math2 + eng2;
		double avg2 = sum2 / 2.0;
		
		
//		// Student 클래스를 new 연산자를 통해서 Heap 영역에 인스턴스로 생성한다.
//		Student moon = new Student();
//		Student hong = new Student();	//2교시 15분 듣기
		
//		// 필드에 직접 접근해서 값을 초기화
//		moon.sNum = 1001;				//Student의 접근제한자 public일 때는 에러 없는데 private로 바꾸면 에러 남 접근이 불가능해서
//		moon.name = "문인수";
//		moon.age = 20;
//		moon.math = 90;
//		moon.eng = 70;
//		
//		hong.sNum = 1002;		//필드를 초기화 하지 않으면 기본값이 들어감 배열에서 했던 것처럼 주석 풀고 열고 출력해보면서 차이 봐보기
//		hong.name = "홍길동";
//		hong.age = 30;
//		hong.math = 90;
//		hong.eng = 60;
//		ㄴ hong. moon. 참조변수
		
//		// 필드에 직접 접근해서 값을 출력
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
//				moon.name, moon.math, moon.eng, moon.sum(), moon.avg());
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
//				hong.name, hong.math, hong.eng, hong.sum(), hong.avg());
////																	ㄴmoon hong만 바꿔주면 됨
//		
//		System.out.println(moon);	//com.kh.chapter1.object.Student@71dac704
//		System.out.println(hong);	//			여기까지 클래스명			/
//			//ㄴ 클래스 heap영역에 들어있는 거니까 import 써서 가져오기
		
		
		
		Student moon = new Student();				//객체 생성 : 클래스명 변수명 = new 클래스명
//						"문인수" - 호출할 때 매개값
		Student hong = new Student();
		
		moon.setsNum(1001);
		moon.setName("문인수");
		moon.setAge(-20);		//	*1 나이는 음수 값이 없음 음수가 안 나오게 만드는 기능   Student 클래스로!
		moon.setMath(120);		//  *2 점수는 0 ~ 100점임 그 밖의 점수가 안 나오게 만드는 기능   Student 클래스로!
		moon.setEng(-50);
		
		hong.setsNum(1002);
		hong.setName("홍길동");
		hong.setMath(80);
		hong.setEng(75);

		hong.information();
		moon.information();
		

//		System.out.println(moon.getName());		//세터 초기화 전 -> 값이 null
//
//		moon.setName("문인수");
////		ㄴ moon. 찍고 보면 name math 이런 것들 하나도 안 보임 프라이빗이라. 그래서 set get 써줌
//
//		System.out.println(moon.getName());		//세터 초기화 후
//		
//		
		System.out.printf("%s님의 나이는 %d, 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
				moon.getName(), moon.getAge(), moon.getMath(), moon.getEng(), moon.sum(), moon.avg());
		System.out.printf("%s님의 나이는 %d 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
				hong.getName(), hong.getAge(), hong.getMath(), hong.getEng(), hong.sum(), hong.avg());
									
		
		
		
		
		
		}

}
