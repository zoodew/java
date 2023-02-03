package com.kh.inherit.before;

public class Desktop {						//221128 3교시
	//before 폴더는 상속 안 씀
	// before의 Desktop 직접 작성한 것	 cf) SmartPhone클래스, Television클래스(롬복사용) 
	
	//필드									221128 3교시
	private String brand;	//브랜드
	
	private String pCode;	//상품코드
	
	private String name;	//상품명
	
	private int price;		//가격
	
	private boolean allInOne;//일체여부
	
	
	//기본 생성자
	public Desktop() {
	}

						// r 만든 다섯 개의 필드에 초기값을 지정할 수 있는 매개변수가 생성됨
	//매개변수를 받는  생성자 	shit alt s -> generate constructor using field		221128 3교시
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}

	
	//게터세터 생성	shift alt s							221128 3교시
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	
			// r 문자열 리턴하게 만든 information 메소드
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", price : " + price +
				 ", name : " + name + ", allInOne : " + allInOne;
	}
}
