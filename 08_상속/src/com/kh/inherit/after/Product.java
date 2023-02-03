package com.kh.inherit.after;

public class Product {							//221128 4교시
	// Desktop SmartPhone Television 세 개의 클래스가 가지고 있는 공통적인 요소들만 추출해서 부모 클래스로 만들기
		/*lombok 안 쓰고 직접 작성하기*/
	
	//필드
	protected String brand;		//브랜드
	protected String pCode;		//상품번호
	protected String name;		//상품명
	protected int price;		//가격
	
	//기본생성자
	public Product() {
		System.out.println("Product() - 호출");		//221128 5교시
	}		// ㄴsyso 쓴 이유 Product의 기본 생성자가 호출되었다는 걸 표시하려고 5교시 1분 50초
 
	//매개변수를 받는 생성자
	public Product(String brand, String pCode, String name, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}

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
	
	
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ","
				+ " price : " + price + ", name : " + name;
	}
	
}
