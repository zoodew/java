package com.kh.inherit.override;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data	// Getter Setter toString EqualsAndHashCode 다 퉁쳐서 표현하는 어노테이션
@NoArgsConstructor
@AllArgsConstructor

public class Book /*extends Object > 모든 클래스들은 Object 클래스를 상속 받음 '기본'*/{
												//221128 7교시
	private String title;
	private String author;
	private int price;
	
	
	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(author, price, title);
//	}


	

	/*
	 * 1. Object 클래스의 'toString() 메소드' 오버라이딩			221128 7교시
	 * 	- toString() 메소드는 객체의 문자열 정보(= 객체 하나를 문자열로 표현한 값)를 리턴한다.
	 * 	- 기본적으로 Object 클래스에서는 "클래스명@16진수해시코드"를 리턴하는데 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있다.
	 * 	- print 메소드의 경우 기본적으로 객체의 참조값을 넘겨주면 내부적으로 참조값.toString() 메소드를 호출해서 리턴되는 값을 출력한다.
	 */
//	@Override				첫번째 방법
//	public String toString() {		// alt shift s 단축키		toString
//		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
//	}
	
	
//	두 번째 방법 @toString 어노테이션 으로도 만들 수 있음 맨 위에 @모음에 거기에 작성하면 알아서 만들어 줌
	
	
	
	
	/*
	 * 2. Object 클래스의 'equals() 메소드' 오버라이딩				221128 7교시
	 * 	- 매개값으로 전달받은 객체와 현재 객체가 동일한 객체라면 true를 리턴하고 그렇지 않으면 false를 리턴한다.
	 *  - 기본적으로 Object 클래스에서는 '주소값'을 비교하는데 자식 클래스에서 객체들이 가지고 있는 필드의 값들을 비교하도록 재정의 할 수 있다. 
	 */
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;			//강의 듣고 설명 듣기
//		Book target = (Book) obj;		//(Book) 형변환 연산자 object타입을 Book 타입으로
//		
//		if(this.title.equals(target.title) && this.author.equals(target.author) && this.price == target.price) {
//			result = true;
//		}							//221128 8교시
//		
//		return result;
//	}
	
//	@Override			// alt shift s 해시코드 앤 이퀄스 툴로 만드는 법
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
//	}
//	
	
// @EqualsAndHashCode로도 작성 가능
	
	
	
	
	/*
	 * 3. Object 클래스의 'hashCode() 메소드' 오버라이딩						221128 8교시
	 *  - 객체의 해시코드란 객체를 식별할 수 있는 하나의 정수값을 의미한다.
	 *  - 기본적으로 Object 클래스의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 만들어주기 때문에 객체마다 다른 값을 가지고 있다.
	 */
//	@Override
//	public int hashCode() {
//		int result = 0;
//		
//		result = (this.title + this.author + this.price).hashCode();
//		
//		return result;
//	}
//	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(author, price, title);
//	}
	

// lombok으로도 가능
	
}
