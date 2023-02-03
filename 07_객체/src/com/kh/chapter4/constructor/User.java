package com.kh.chapter4.constructor;

/*
 * 생성자						//221124 7교시
 * 	- 생성자는 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 * 	- 생성자 작성시 주의사항
 *  	- 생성자 이름은 반드시 클래스 이름과 동일해야 한다.
 *  	- 반환형이 존재하지 않는다.
 *  	- 매개 변수가 있는 생성자를 작성하게 되면 기본 생성자를 자동으로 만들어주지 않는다.
 */
public class User {
	private String id;
	
	private String password;
	
	private String name;
	
	private int age;
	
	private char gender;
	
	/*
	 * 기본 생성자
	 * 	- 객체 생성만을 목적으로 사용된다. 
	 * 	- 기본 생성자를 생략하는 경우, 자동으로 만들어줬기 떄문에 항상 객체 생성이 가능했다. 1* 주석 풀고묶고
	 */
	
	public User() {
		System.out.println("기본 생성자 호출");
	}
	
	/*
	 * 매개 변수가 있는 생성자 [(아이디, 패스워드, 이름)을 받도록 만들 것임]
	 * 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 필드를 초기화하는 목적으로 사용된다.
	 */
			//위의 user 생성자와 이름 똑같아서 에러가 남 이럴 때 오버로딩!! 매개변수가 다르거나 갯수가 다르거나 해야 함 
	public User(String id, String password, String name) {
		this.id = id;					//초기화
		this.password = password;
		this.name = name;
			// 나머지 필드(age, gender)는 JVM이 초기값을 설정해준다. 기본값
	}
	
	/*
	 * 매개변수가 있는 생성자 (아아디, 패스워드, 이름, 나이, 성별)
	 */
	// alt shift s > generate constructor using field	생성자 단축키
	public User(String id, String password, String name, int age, char gender) {
//		this.id = id;
//		this.password = password;
//		this.name = name;
		this(id, password, name);
					// ㄴ 똑같은 묶음으로(가짓수, 들어가 있는 타입) 묶인 게 미리 만들어져있어야함 그래야 받아올 수 있음
					//   생성자 안에서 다른 생성자를 호출하려면 반드시 최상단에 위치해야 함
					//	 생성자를 호출하는 부분은 반드시 생성자 호출에서만 써야하지 일반 메소드에서 호출하려하면 에러 발생한다
		this.age = age;
		this.gender = gender;
	}
	
	
//1*	public User(String name) {
//		
//	}
	
	//값 넣어주려고 세터 사용
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	public String information() {
//		System.out.println("this : " + this);		//this 실습 221124 8교시
		
		return id + ", " + password + ", " + name + ", " + age + ", " + gender;
	}


	
}
