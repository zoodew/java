package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C_ArraySort {

	//정수형 배열 정렬
	public void method1() {
		
		int[] array = {2, 7, 5, 1, 3};
		
		System.out.println(array.hashCode());
		System.out.println(Arrays.toString(array));		//Arrays.toString 문자열 예쁘게 출력해주는 [,,,,,....]
		
		// 1. 오름차순으로 정렬
		Arrays.sort(array);			// 오름차순 정렬 arrays.sort()
		System.out.println(array.hashCode());			//정렬 전의 해시코드랑 동일
		System.out.println(Arrays.toString(array));		// ㄴ 원본에 있는 배열 자체는 안 바뀜 요소 자체를 정렬해 주는 것
		
		
		// 2. 내림차순으로 정렬
			// arrays.sort로는 내림차순 불가능 오름차순만 있음
		//	방법1) 원본 배열을 오름차순으로 정렬한 다음 for 문을 사용하여 값을 반대로 새로운 배열에 대입한다.
		int[] copy = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			copy[4 - i] = array[i];			// i가 0일 때는 4번 인덱스, i가 1일 때는 3번 인덱스, i가 2일 때는 2번 인덱스...
		}
		
		System.out.println(Arrays.toString(copy));
		
		//	방법2) 일단은 참고만 편법 1)만 익혀도 충분함 이런 작성법도 있다 참고만! 객체등 여러가지 배우고 봐야 이해 감
		Integer i = new Integer(3);

		Integer[] integerArray = {2, 7, 5, 1, 3};
		
		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerArray));
		
	}
	
	
	
	//문자형 배열 정렬				221123 4교시
	public void method2() {
		String[] array = {"메론", "Orange", "Apeach", "banana", "apple", "레몬"};
		
		System.out.println(Arrays.toString(array));
		
		
		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
				//	[Apeach, Orange, apple, banana, 레몬, 메론]
				//	대문자 > 소문자 > 가나다 사전순
		
		// 내림차순 정렬
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
				// 문자형 배열 정렬은 정수형 정렬과 다르게 내림차순이 가능함
	}

	
	
	/*
	 * <조별 과제>
	 * 	정렬 알고리즘 정리
	 * 	
	 * 	1. 개별로 정렬 알고리즘을 하나씩 선택해서 정리해 주세요.(구글링) 코드짜고 개념 정리하고 그림 그리고... 분석
	 * 	
	 * 	2. 시간 복잡도 공간 복잡도를 정리해 주세요.
	 * 			시간 복잡도는 알고리즘 처리하는데 시간이 얼마나 걸리나 공간 복잡도는 얼마나 메모리를 잡아먹나..
	 *
	 *  3. 반드시 정리된 내용은 조원들끼리 공유 및 코드 리뷰를 진행해 주세요.
	 *  
	 *  4. 12/03(토)까지 내용을 정리 후 메일로 보내주세요.
	 */
	
	
	
	
	public void sum() {							//221129 1차 시험 출력용 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

		



}
