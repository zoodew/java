package com.kh.chapter4;

import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {
//		String[] array = {"문인수", "이정준", "이정환", "정주리", "김세희"};				//221207 3교시 처음~
//		Integer[] array = {11, 22, 33, 44, 55};	// 에러 발생 MyGenerics<String> 클래스의 필드들이 String타입이 아니라서! 이럴 때 사용하는게 제네릭스 <T>로 바꿔줌  
		Double[] array = {11.1, 22.2, 33.3, 44.4, 55.5};
		
//		MyGenerics<String> generics = new MyGenerics<>(array);					
//		MyGenerics<Integer> generics = new MyGenerics<>(array);
		MyGenerics<Double> generics = new MyGenerics<>(array);
				//	ㄴ 이렇게 써주면 생성시점에 데이터 타입 고정 지정 (생략도 가능 생략하면 알아서 T를 위 초기화 {} 값에 따라 변환시켜줌)
		generics.print();

//		List<String> list = generics.toList();
//		List<Integer> list = generics.toList();
		List<Double> list = generics.toList();
		
		System.out.println(list);
	}

}