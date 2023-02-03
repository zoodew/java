package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

					//	r 제네릭스 타입의 클래스를 객체로 생성할 때 구체적인 타입으로 변경 모든 타입 가능
public class MyGenerics<T/*Type의 약자*/ extends Number> {						//221207 3교시
										// ㄴ 작성하면. Number는 int double byte long 등의 부모임 그래서 Number를 상속하고 있는 타입들로만 변경 가능 
	private final T[] values;			//					String은 불가 Application에서 주석 풀고열면서확인해보기 3교시 30분~

	public MyGenerics(T[] values) {
		this.values = values;
	}

	public void print() {	//요소들 하나씩 출력하는 메소드
		for (T t : values) {
			System.out.println(t);
		}
	}
	

	// 배열을 List로 반환											221207 3교시 25분~
	public List<T> toList(){
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);
		}
		return list;
	}
	
}
