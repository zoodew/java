package com.kh.chapter1.string;

public class B_StringBuilder {
	// Java 10_기본 API 5.StringBuffer, StringBuilder 클래스
	public void method1() {			//221201 6교시
		// StringBuilder 클래스의 기본 생성자를 통해서 인스턴스를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
		StringBuilder sb1 = new StringBuilder();
		// StringBuilder 클래스의 생성자에 정수값을 전달해주면 해당 크기만큼의 버퍼가 생성된다.
		StringBuilder sb2 = new StringBuilder(30);
		// StringBuilder 클래스의 생성자에 문자열을 전달해주면 문자열 크기 + 16만큼의 버퍼가 생성된다.
		StringBuilder sb3 = new StringBuilder("Hello");
		
		System.out.println("sb1의 문자열 길이 : " + sb1.length());	//0		.length 문자열의 길이
		System.out.println("sb1의 버퍼의 크기 : " + sb1.capacity());//16	.capacity 버퍼의 길이
		System.out.println("sb2의 문자열 길이 : " + sb2.length());	//0		
		System.out.println("sb2의 버퍼의 크기 : " + sb2.capacity());//30
		System.out.println("sb3의 문자열 길이 : " + sb3.length());	//5
		System.out.println("sb4의 버퍼의 크기 : " + sb3.capacity());//21
	}
	
	
	
	public void method2() {			//221201 7교시
		String str = "안녕하세요.";
//		StringBuilder sb = "안녕하세요.";	//에러발생이유 대입연산자를 기준으로 양 옆의 데이터 타입이 다름
		StringBuilder sb = new StringBuilder("안녕하세요."); // ㄴ new연산자 써주기
		
		System.out.println("str : " + str);	//원본 문자열을 변경한 게 아니라 원본 문자열에 추가를 한 것
		System.out.println("sb : " + sb);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb));
		System.out.println();
		
		
		// 1. append(String) 메소드는 기존 문자열 뒤에 문자열을 추가한다.
		System.out.println("=====append(String) 메소드=====");
		str += "저는 문인수입니다.";			
		sb.append("저는 문인수입니다.");
		
		System.out.println("str : " + str);
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb));
		System.out.println();
		
		sb.append("여러분 힘내세요^^");
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println();
					//버퍼의 크기가 중가했다는 걸 위주로 보기.	생성된 버퍼의 크기보다 문자열이 길어지면 버퍼의 크기가 증가함
		
		
		// 2. insert(int offset, String str) 메소드는 문자열의 offset 위치부터 전달받은 문자열을 추가한다.
		System.out.println("=====insert(int offset, String str 메소드=====");
		sb.insert(1, "ㅋㅋㅋㅋ");	// (시작 위치, 넣을 문자열) 1번인덱스에 ㅋㅋㅋㅋ를 넣어라
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println();
		
		
		// 3. delete(int start, int end) 메소드는 start에서 end - 1까지의 인덱스에 해당하는 문자열을 삭제한다.
		System.out.println("=====delete(int start, int end 메소드=====");
		sb.delete(1, 5);	// 1에서부터 4번(5-1) 인덱스까지를 지워줌
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println();
		
		
		// 4. reverse() 메소드는 문자열의 순서를 역으로 바꾼다.
		System.out.println("=====reverse() 메소드=====");
		sb.reverse();
		System.out.println("sb : " + sb);
		System.out.println("sb의 문자열 길이 : " + sb.length());
		System.out.println("sb의 버퍼의 크기 : " + sb.capacity());
		System.out.println(System.identityHashCode(sb));		//주소값은 다 동일
		System.out.println();
		
		
		// 5. 메소드 체이닝
		System.out.println("=====메소드 체이닝=====");
		StringBuilder sb2 = new StringBuilder("Java Program");
		
		sb2.append("API").delete(4, 11).reverse();	// 메소드 수행하면 자기자신의 주소값 반환함 그럼 . 찍어서 자기자신을 멤버에 접근시킬 수 있음
		
		System.out.println("sb2 : " + sb2);
	
		
	}

	
}

