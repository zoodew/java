//package com.kh.firtst; 지우면 안 됨 에러 남
package com.kh.first;

import com.kh.first.practice.ValuePrinter;

// 클래스 명은(밑에 public class 클래스 명) 클래스 파일명과 동일해야 한다.
// 클래스 안에는 여러 개의 메소드를 가질 수 있고 메소드 안에 소스코드를 작성한다.
public class Application {
	/*
	 * 주석(Comment)
	 * 	- 소스 코드와 무관하고 코드로 인식되지 않는다.
	 * 	- 주로 코드에 대한 설명을 작성할 때 사용한다.
	 */
	
//	 한 줄 주석
//	 추가로 주석 작성
	
//	main 메소드(아래 public static void main)는 어플리케이션 실행시키면 제일 먼저 실행되는 프로그램의 시작점으로 java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드이다.{}이 사이
	public static void main(String[] args) {
//	(221117 5교시 필수로 한번 보기 이해하기) 
//		1) 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
//		  [표현법]
//			클래스명 사용할이름 = new 클래스명();
		
//		방법 1) import 문을 사용하지 않고 클래스 생성
//		com.kh.first.practice.ValuePrinter printer = new com.kh.first.practice.ValuePrinter();

//		방법 2) import 문을 사용하여 클래스 생성 위의 com.kh.first.practice 너무 길어서 이걸 간단하게 생성할수있게 만든 방법
//				4번열 import구문 자동으로 만들기 사용하지 않으면 지우기도 가능 컨트롤 시프트 영어o 단축키 > 사용법이 있다 가볍게만 익히고 그냥 방법1로 하기
		ValuePrinter printer = new ValuePrinter();
		
		
//		2) 생성한 클래스로 메소드 실행(호출)
//		  [표현법]
//			사용할이름.실행할메소드명();
		printer.print();
	}

}
