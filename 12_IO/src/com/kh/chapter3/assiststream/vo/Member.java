package com.kh.chapter3.assiststream.vo;

import java.io.Serializable;

//Java 12 _IO 6.4 객체 입출력 보조 스트림					221205 6교시
public class Member implements Serializable/*직렬화를 하겠다*/{
	// r모든 필드를 직렬화 해도 괜찮다는 뜻 > 클래스 member에 커서 두고 ctrl 1 add generate serialVersionID
	private static final long serialVersionUID = -2373099422823930486L;

	private String id;
	
	private String pwd;
	
	private String name;
	
	private String email;
	
	private int age;
	
	private char gender;
	
	private transient/*or static*/ double point;		//static이나 transient 적으면 직렬화 안 됨
	

	public Member() {	
	}

	public Member(String id, String pwd, String name, String email, int age, char gender, double point) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}

	@Override
	public String toString() {			// alt shift s toString 툴 쓰기!
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", point=" + point + "]";
	}
	

}
