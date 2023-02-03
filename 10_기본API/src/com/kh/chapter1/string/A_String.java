package com.kh.chapter1.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class A_String {
	// Java 10_기본 API 3. String 클래스
	public void method1() {	//221201 4교시	
	// Object에서 제공하고 있는 것을 가지고 String 클래스에서 재정의하는 거
		
		
		// 문자열 리터럴 new 연산자로 생성된 문자열 비교				221201 4교시
		System.out.println("===문자열 리터럴 new 연산자로 생성된 문자열 비교===");
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2);	//true	String 영역의 상수풀 가져온것 실제 메모리에 저장된 주소값이 동일
		System.out.println(str1 == str4);	//false	상수풀에 저장된 문자열과 new연산자로 만들어서 heap메모리에 주소값 생성된 문자열 비교
		System.out.println(str3 == str4);	//false
		
		System.out.println();
		
											// r 데이터가 같으면 같은 해시코드를 출력하도록 오버라이딩
		// toString() 메소드는 String클래스에서 오버라이딩 되어있다.	221201 4교시 강의 꼭 보기!!!!!!!!!
		System.out.println("===toString() 메소드===");
		System.out.println(str1.toString());//객체를 표현할 수 있는 문자열을 출력해주는 메소드 Object클래스에 있음
		System.out.println(str2);			// ㄴ 6행에서 데이터 값이 나오라고 재정의 되어있음
		System.out.println(str3);											
		System.out.println(str4);	
		
		System.out.println();
		
		
		// hashCode() 메소드는 String 클래스에 오버라이딩 되어있다.		인스턴스를 식별할 수 있는 정수값		221201 4교시
		System.out.println("===hashCode() 메소드===");
		System.out.println(str1.hashCode());	// 인스턴스의 주소값을 리턴하게 되어있음 
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));	// 실제 주소값
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println();
		
		
		// equals() 메소드
		System.out.println("===equals() 메소드===");
		System.out.println(str1.equals(str2));	//
		System.out.println(str1.equals(str4));
		System.out.println(str3.equals(str4));
		
	}
	
	
	
	public void method2() {	//221201 4교시 5교시
	// String 클래스에서 제공하는 메소드 사용
		
		String str = "Hello World!";
		
		// 1. charAt(int) 메소드는 전달받은 index 위치의 문자만 추출해서 리턴한다.
		System.out.println("=====charAt(int) 메소드=====");
		
		char ch = str.charAt(3);	// ()메소드 호출할 때 필요한 매개변수
		System.out.println("ch : " + ch);	//3번 인덱스에 있는 문자 나옴 'l'
		
		System.out.println();
		
		
		// 2. concat(String) 메소드는 전달받은 문자열(!x10)과 원본 문자열(헬로월드!)을 하나로 합친 새로운 문자열을 생성해서 리턴한다.
		System.out.println("=====concat(String) 메소드=====");
		
		String str2 = str.concat("!!!!!!!!!!");
		String str3 = str + "!!!!!!!!!!";
		System.out.println("srt : " + str);		// Hello World!
		System.out.println("srt2 : " + str2);	// Hello World!!!!!!!!!!!	//concat은 하나의 문자열만 전달받아 연결 가능
		System.out.println("srt3 : " + str3 + "@!!");	// Hello World!!!!!!!!!!!@!!	//연산자 여러 개 써서 계속 더할 수 있음
		
		System.out.println();
		
		
		// 3. substring(int) 메소드는 매개값으로 전달된 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴한다.
		//	  substring(int beginIndex, int endIndex) 메소드는 문자열의 beginIndex 위치에서
		//	  										  endIndex - 1까지의 새로운 문자열을 새로 생성해서 리턴한다.
		System.out.println("=====substring(int) 메소드=====");
		
		String str4 = str.substring(6);	// 매개값으로 전달된 값으로 지정한 인덱스에서부터 끝까지의 문자열을 리턴
		String str5 = str.substring(2, 6);	//2번 인덱스부터 5번 인덱스까지  str.substring ctrl space하면 설명 나옴
		
		System.out.println("str : " + str);		// Hello World!
		System.out.println("str4 : " + str4);	// World!
		System.out.println("str5 : " + str5);	// llo	//o다음 띄어쓰기까지 포함된 것
		
		System.out.println();
		
		
		// 4. indexOf(String) 메소드 전달받은 문자열의 시작 인덱스를 리턴한다.
		//					  주어진 문자열이 포함되어 있지 않으면 -1을 리턴
		//	  indexOf(char) 메소드는 전달받은 문자의 시작 인덱스를 리턴한다.
		//					주어진 문자열이 포함되어 있지 않으면 -1을 리턴
		
		System.out.println("=====indexOf() 메소드=====");
//		int index = str.indexOf("World");
//		int index = str.indexOf("test");	//주석 풀면서 위의 syso와 출력되는 값 비교
//		int index = str.lastIndexOf("World");	// 오른쪽에서 왼쪽으로 찾아가는
		int index = str.indexOf("World", 7);	// 지정한 숫자의 인덱스부터 주어진 문자열의 시작인덱스를 찾아 그 자리값을 리턴
												// ㄴ문자열이 포함되어있지 않으면 -1
		System.out.println("index : " + index);		
		System.out.println();
		
//		index = str.indexOf('o');
//		index = str.indexOf('o', 6);
		index = str.lastIndexOf('o');
		
		System.out.println("index : " + index);
		
		System.out.println();
		
		
		// 5. replace(char oldChar, char newChar) 메소드는 문자열에서 oldChar를 newChar 문자로 변경된 새로운 문자열을 생성해서 리턴한다.
		
		System.out.println("=====replace() 메소드=====");
		String str6 = str.replace('l', 'c');
		
		System.out.println("str : " + str);		//원본값에는 변화가 없음
		System.out.println("str6 : " + str6);
		System.out.println();
		
		System.out.println();
		
		
		// 6. toUpperCase(), toLowerCase() 메소드는 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성해서 리턴한다.
		System.out.println("=====toUpperCase(), toLowerCase()=====");
		String str7 = str.toUpperCase();
		String str8 = str.toLowerCase();
				
		System.out.println("str : " + str);		//원본값에는 변화가 없음
		System.out.println("str7 : " + str7);
		System.out.println("str8 : " + str8);
		
		System.out.println();
		
		
		// 7. trim() 메소드는 문자열의 앞 뒤 공백을 제거한 새로운 문자열을 생성해서 리턴한다.
		System.out.println("=====trim() 메소드=====");
		str = " JAVA ";
//		str = " J A V A ";	//주석 걸고 풀고 비교해보기! 문자 사이 공백은 제거하지 않고 문자열의 앞 뒤 공백만을 제거한다.
		String str9 = str.trim();
		
		System.out.println("str  : " + str);		//원본값에는 변화가 없음
		System.out.println("str9 : " + str9);

		System.out.println();
		
		
		// 8. toCharArray() 메소드는 문자열의 문자들을 배열에 담아서 리턴한다.
		System.out.println("=====toCharArray() 메소드=====");
		str = "Hello";
		char[] array = str.toCharArray();
		
		System.out.println("str : " + str);
		System.out.println("array : " + Arrays.toString(array));

		System.out.println();
		
		
		// 9. valueOf( ... )	정적(static) 메소드는 매개값으로 입력받은 값들을 문자열로 변경해서 리턴한다.
		System.out.println("======valueOf() 메소드=====");
		String str10 = String.valueOf(false);
		String str11 = String.valueOf(array);
//		String str11 = String.valueOf(array, 1, 3);	//1번 인덱스에서부터 3개
		String str12 = String.valueOf(3.141592F);
		
		System.out.println("str10 : " + str10);
		System.out.println("str11 : " + str11);
		System.out.println("str12 : " + str12);
		
		System.out.println();
				
	}
	
	
	
	// Java 10_기본 API 4. StringTokenizer 클래스
	public void method3() {	//221201 6교시
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		System.out.println("str : " + str);
		System.out.println();
		
		// 1. String 클래스의 split 메소드를 이용하는 방법
		//	  split(String) 메소드는 입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴한다.
		System.out.println("=====String 클래스의 split 메소드를 이용하는 방법=====");
		String[] array = str.split(",");	//	콤마(,)가 입력받은 구분자
		
		System.out.println("array.length : " + array.length);	// 6
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		
		
		// 2. StringTokenizer 인스턴스를 이용하는 방법							//강의보기!!!!!!!!!!!!
		//	  countTokens()		: 남아있는 토큰의 수를 리턴한다.
		//	  hasMoreTokens()	: 남아있는 토큰이 있는지 확인한다.
		//	  nextToken()		: 토큰을 하나씩 꺼내온다.
		System.out.println("=====StringTokenizer 인스턴스를 이용하는 방법=====");
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("st.countTokens() : " + st.countTokens()); //하나의 문자열을 구분자로 분리해서 그 개수를 출력
		
		// while 문을 통한 출력 방법
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		
		// for 문을 통한 출력 방법
		int length = st.countTokens();
		
		for(int i = 0; i < length; i++) {
			System.out.println(st.nextToken());
		}
	
		
		
	}
	
	
	
}
