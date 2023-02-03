package com.kh.chapter2._class;

// 접근 지향자 생략 시 default 접근 제한이 적용된다. 	221124 5교시 20분~ phone 클래스 생성 보기
class Phone {
	
	private String name;
	
	private String color;
	
	private String brand;
	
	public Phone(){				// 생성자
	}					

	
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
