package com.kh.inherit.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// 롬복 라이브러리는 사용하려면 프로젝트(ex. 08_상속)별로 등록해야 함 (등록221128 3교시 30분 강의)


@Getter						//ctrl space 하면 import lombok.~ 나옴		2211283교시
@Setter
@NoArgsConstructor	//기본생성자
@AllArgsConstructor	//매개변수 다 넣은 생성자
public class SmartPhone {
	//SmartPhone클래스는 롬복 라이브러리 사용해서 만든것 	cf) Desktop클래스(직접) Television클래스			221128 3교시
			
	//필드
	private String brand;	//브랜드
	
	private String pCode;	//상품코드
	
	private String name;	//상품명
	
	private int price;		//가격
	
	private String mobileAgency;	//통신사
	
	
	//information										221128 3교시
			//string문자열 리턴하게 만든 information 메소드
	public String information() {
		return "brand : " + brand + ", pCode : " + pCode + ", price : " + price +
				 ", name : " + name + ", mobileAgency : " + mobileAgency;
	}
}
