package com.kh.chapter2._class;

/*
 * 클래스에서 사용 가능한 접근 제한자
 * 	1. public
 *	  - public으로 선언된 클래스를 아무런 제약없이 사용할 수 있다.
 *
 * 	2. default
 *	  - 클래스를 선언할 때 접근 제한자를 생략했다면 default 접근 제한을 갖는다.
 *	  - 동일한 패키지에는 아무런 제약없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다. 
 *  
 * 
 * 클래스의 구조
 * 	 [표현법]
 * 
 * 		[접근 제한자] [예약어] class 클래스명 {
 * 		  1. 필드 정의
 * 		   [접근 제한자] [예약어] 자료형 필드명 [= 초기값] ;
 * 		   ...	//필드의 갯수 제한이 없음 ... 무한
 * 
 * 		  2. 생성자 정의 (필드를 초기화하거나, 객체를 사용할 준비를 한다.)
 * 			[접근 제한자] 클래스명([매개변수, ...]){
 * 				... 실행 코드 ...
 * 			}
 * 			...	//생성자도 여러 개 정의할 수 있음
 * 
 * 		  3. 메소드 정의
 * 		    [접근 제한자] [예약어] 반환형 메소드명([매개변수...]){
 * 			  ...
 * 
 * 			  [return] 	[반환값];
 * 			}
 * 			...   
 * 		}
 */
public class Person {						//221124 5교시
	// 1. 필드 정의
	private String name;
	
	private int age;
	
	private Phone phone;	// 1* 클래스(person) 안에 다른 클래스(phone) 접근 시키기 가능
	
	// 2. 생성자 정의
	public Person() {
	
	}				// ctrl spcae > constructor 생성자 정의 단축키
	

	public Phone getPhone() {
		return phone;
	}


	
	// 3. 메소드 정의
	
	// alt shift s 게터세터 생성 단축키
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String brand, String name, String color) {
		this.phone = new Phone();
		
		this.phone.setBrand(brand);
		this.phone.setName(name);
		this.phone.setColor(color);
	}
	
	public void whoAreYou() {
		System.out.printf("안녕하세요. 저는 %s입니다. 나이는 %d세 입니다.\n", name, age);
		System.out.printf("저는 %s의 %s를 가지고 있습니다.\n", phone.getBrand(), phone.getName());
	}																// this 써도 되는데 굳이 같은 데니까 안 써도 됨
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
