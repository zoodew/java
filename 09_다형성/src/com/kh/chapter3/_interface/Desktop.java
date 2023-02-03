package com.kh.chapter3._interface;


public class Desktop extends Product{		//221201 2교시
									
	//필드
	private boolean allInOne;	//일체 여부
	
	//기본생성자
	public Desktop() {
//		super();	//부모 인스턴스를 가르키는 참조값	 생략가능		//221128 5교시 5분~ 인강 꼭 듣기
		System.out.println();			//221128 5교시 어떤 순으로 코드가 실행되나 보려고 적은 코드 
	}
	
	
	/*
	 * 부모 클래스의 필드를 초기화할 수 있는 방법
	 * 
	 * 	* super : 부모 인스턴스의 주소를 담고 있다.
	 */
	
	//자식 클래스로 인스턴스를 생성하면 ~~~ 강의듣고 채우기		221128 5교시													//221128 5교시 13분~
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
//		super(brand, pCode, name, price);
		
//		// 1. super와 .(도트) 연산자로 부모의 필드에 직접 접근			//221128 5교시 25분
//		super.brand = brand;		
//		super.pCode = pCode;
//		super.name= name;
//		super.price = price;

//		// 2. 부모의 Setter 메소드를 호출해서 초기화					//221128 5교시
//		super.setBrand(brand);
//		this.setpCode(pCode);
//		setName(name);
//		setPrice(price);
		
		// 3. 부모 생성자 호출해서 초기화							//221128 5교시
		super(brand, pCode, name, price);
		
		this.allInOne = allInOne;
	}



	//게터세터 메소드
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
	//오버라이딩														221128 6교시
	@Override		//꼭 쓸 필요는 없는데 사용하면 오버라이딩을 해준다고 컴퓨터에게 얘기하는 거라서 컴퓨터가 오버라이딩이라고 생각하고서 오류를 잡아줌
	public String information() {	//부모클래스의 information과 선언부가 똑같음. 똑같이 하는 게 오버라이딩
		return super.information() + ", allInOne : " + allInOne;	//올인원 정보까지 한번에 출력하게 만드는 방법
	}
	
	@Override
	public void turnOn() {
		System.out.println("Desktop을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Desktop을 끕니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}			//product라는 부모 클래스를 상속 받아서 공통된 코든 다 빠졌기 때문에 코드가 매우 간략해짐
