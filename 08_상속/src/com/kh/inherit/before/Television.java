package com.kh.inherit.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Television{
				//	cf) SmartPhone클래스(롬복 사용 클래스)랑 동일한 방법		221128 4교시
	private String brand;//브랜드
	
	private String pCode;//상품코드
	
	private String name;//상품명
	
	private int price;	//가격
	
	private int inch;	//인치
	
	
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", price : " + price +
				 ", name : " + name + ", inch : " + inch;
	}
	
}
