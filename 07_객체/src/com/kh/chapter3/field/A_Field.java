package com.kh.chapter3.field;

/*
 *  변수 구분						//221124 6교시
 * 
 *  1. 필드(멤버 변수, 인스턴스 변수)
 *	 - 클래스 영역에 선언하는 변수, 클래스 내에서 어디든지 사용이 가능하다.
 *	 - 필드는 접근 제한자를 사용할 수 있다. (public, protected, default, private)  
 *	 - 필드의 생성과 소멸
 *		생성 시점 : new 연산자를 통해서 인스턴스 생성 시 메모리(Heap)에 할당된다.
 *  	소멸 시점 : 인스턴스가 소멸 시 함께 소멸된다. garbage collector가 인스턴트 지울 때
 *
 *  2. 지역 변수
 *   - 클래스 영역 안의 특정한 구역({}, 중괄호 안)에 선언하는 변수, 해당 구역에서만 사용이 가능하다.
 *   	ex) 메소드, 제어문(if for 문)
 *   - 지역 변수는 접근 제한자를 사용할 수 없다.
 *   - 지역 변수의 생성과 소멸
 *   	생성 시점 : 특정한 구역({}) 실행 시 메모리(Stack)에 할당된다.
 *   	소멸 시점 : 특정한 구역({}) 종료 시 소멸된다. ex) 메소드 종료 시
 *   
 *   접근 제한 범위
 *   public	모든 곳 가능
 *   protected 동일 패키지 내, 상속 관계
 *   default 동일 패키지 내
 *   private 동일 클래스 내
 */
public class A_Field {				//221124 6교시

	// 필드 선언
	private int field;
	
	// 필드의 접근 제한자 테스트
	public String publicField = "public";
	
	protected String protectedField = "protected";
	
	String defaultField = "default";
	
	private String privateField = "private";
	
	
	
								//매개 변수도 일종의 지역 변수로 메소드 영역에서 사용이 가능하다.
	//메소드 선언			// 매개 변수(int number)가 있는 메소드. 이 매개 변수는 지역변수. 메소드가 선언되고 소멸될때까지 사용됨
	public void test(/*public 지역 변수라서 접근제한자 사용 불가*/int number) {
//		private int local;	//지역 변수에는 접근 제한자를 붙이지 않는다.
		int local = 5;
		
		/*
		 * 필드 출력
		 * 	- 필드는 클래스 전역(여기서는 A_Field 내)에서 사용이 가능하다. (생성자, 메소드 다 가능)
		 * 	- 미 초기화 시 JVM이 기본값으로 초기화한다. (정수 : 0, 실수 : 0.0, 문자 : \U0000, 논리값 : false, 참조값 :	null)
		 */
		System.out.println("필드 출력 : " + field);
		
		/*
		 * 지역 변수 출력
		 * 	- 지역 변수는 반드시 사용하기 전에 초기화해야 한다.
		 * 	- 미 초기화 시 에러가 발생한다.
		 */
		System.out.println("지역 변수 출력 : " + local);
		
		/*
		 * 매개 변수 출력
		 * 	- 매개 변수는 메소드 호출 시 반드시 값이 전달되어 오기 때문에 출력이 가능하다.
		 *  - 
		 */
		System.out.println("매개 변수 출력 : " + number);
		
		
		
	}
}
