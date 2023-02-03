package com.kh.dimension.practice;

public class DimensionPractice {
	
	
	//실습문제1
	public void practice1() {
	/*
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
	 * 	1) 1 ~ 16까지 값을 차례대로 저장하세요.
	 * 	2) 저장된 값들을 차례대로 출력하세요.
	 * 	ex)
	 * 	1	2	3	4
	 * 	5	6	7	8
	 * 	9	10	11	12
	 * 	13	14	15	16
	 */
	
		
	//2차원 배열 선언, 생성, 초기화
	
//		//직접 값을 입력	
	int[][] arr1;
	arr1 = new int[4][4];
	
//	arr1 = new int[][] {
//		{1,2,3,4},
//		{5,6,7,8},
//		{9,10,11,12},
//		{13,14,15,16}
//		};
	
		//반복문을 통해
		
	int value = 1;
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			arr1[i][j] = value++;
		}
	}
		
	//2차원 배열 출력
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			System.out.printf("%2d ", arr1[i][j]);
		}
		
		System.out.println();
	}
	
	
	
	}
	







}
