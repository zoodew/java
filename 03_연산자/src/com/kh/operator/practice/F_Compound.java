package com.kh.operator.practice;

public class F_Compound {
	
	public void method1() {
		int number = 12;
		String str = "Hello";
		
		number += 3;		// number + 3을 해서 그 결과를 다시 왼쪽 변수(number)에 대입 12+3
		System.out.println(number);

		number -= 5;		//	number - 5를 해서 그 결과를 다시 왼쪽 변수에 대입  15-5(위에서 number 15 됐으니)
		System.out.println(number);
		
		number *= 6;			// number = number * 6;
		System.out.println(number);
		
		number /= 3;	// number = number / 3;
		System.out.println(number);
		
		number %= 3;	//	number = number % 3;
		System.out.println(number);
	
		str += "World!"; // str = str + "World!';		//문자열도 복합 대입 연산 가능 숫자랑 똑같은 공식으로
		System.out.println(str);
		
	}

}
