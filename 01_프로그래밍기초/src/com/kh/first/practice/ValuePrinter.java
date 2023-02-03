// 밸류프린터는 2.2 출력메소드 실습용임
package com.kh.first.practice;

public class ValuePrinter {
	public void print() {
//		System.out은 ~~~
//		print();은 ~~~~ 원하는 값을 괄호 안에 써주기
		
//		1. 숫자 출력
		System.out.println(123); //정수값을 출력
		System.out.print(3.14); //실수값을 출력    print는 줄바꿈없이 이어서 출력 그래서 print로 실행 1233.14 이렇게 나옴 println 줄바꿈 기능 있음
		System.out.println();
		
//		2. 연산 결과 출력
		System.out.println(40+125);	//165		12열 없는 상태로 출력 3.14165나옴 3.14시소를 println으로 바꾸거나 println();를 밑에 넣어줌(12열)
		System.out.println(1.23-0.12); //1.11(X) ==> 실수값 연산은 오차가 생길 수 있다. 어느정도의 오차가 생기더라도 감수하고 사용함 왜냐면 많은 범위의 값을 표현 가능해서
		
//		3. 문자 출력
		System.out.println('a');	//자바에서 '하나'의 문자를 출력 할 때 '작은' 따옴표 써 줌 작은 따옴표 안에는 하나의 문자
		System.out.println('b');
//		왜 아래 99 나오지? 문자와 숫자를 연산하면 '문자'의 코드값(문자는 코드가 있음)과 숫자의 연산 결과를 출력한다. (b=98) 그래서 98+1=99
		System.out.println('b' + 1);
		System.out.println((char)('b' + 1));	//char 형변환 연산자  왜 c? >> 찾아서 적어놓기 몰라몰라! 뒤에서 다룰거야 그래도 찾아보기
		
//		4. 문자열 출력
		System.out.println("안녕하세요.");	//문자 '여러개'를 출력하고 싶을 땐 '큰' 따옴표
		System.out.println("반갑습니다.");
		
//		5.문자'열'과 그 외의 값들의 덧셈연산
		System.out.println("반갑습니다." + 123);		//한쪽이 문자열이면 나머지도 문자열의 형태로 바꿔줌 123이 "123"이 되는 것
		System.out.println(123 + "반갑습니다.");
		System.out.println("반갑습니다." + "네~~~");	//문자열 여러개를 하나의 문자열로 만들어줌
		System.out.println("123" + 456); 			//숫자 123 456의 합이 아니라 문자열 "123"과 "456"의 합 그래서 123456이 나옴
		System.out.println("반갑습니다." + 40 + 125); 	// 반갑습니다가 문자열이니까 40도 125도 문자열이 됨 연산은 왼>오 순이라서
		System.out.println("반갑습니다." + (40 + 125));//()먼저 계산하라는 뜻 40+125더하고 165 반갑습니다 + "165" 합
		
		
//		6. printf() 메소드	
//		printf의 f = fomat (6교시 강의)	printf(서식 지정자, 매개값) 지정된 서식에 매개값으로 전달되는 값을 넣어주는 거
//			1) %d 서식 지정자		정수형
		  System.out.printf("%d", 10);
		  System.out.println();
		  System.out.printf("%d + %d = %d", 10, 20, 30); //지정된 서식에 차례대로 매개값 넣어줌 앞부터 10 20 30 넣음
		  		//System.out.println(10 + " + " + 20 + " + " + 30); //위와 같은 식 나옴 ""안에 띄어쓰기 하면 그거까지 문자열로 나타냄
		  System.out.printf("%5d\n", 10);		//   \n = 줄바꿈, %5d =  5칸 띄고 오른쪽정렬
			//System.out.printf("%d + %d = %d\n", 10, 20); // 에러남 왜냐면 서식에는 %가 세갠데 매개값은 10 20 두개 뿐 (서식 지정자에 해당하는 값들이 모두 존재해야 한다.)
		
//			2) %f 서식 지정자		실수
		  System.out.printf("%f\t%f\n", 3.14, 3.1415927);	//  \t = 탭 , 실수값은 기본으로는 소수점 여섯째자리까지만 표기됨 그걸 넘어서면 반올림해서 표기
		  System.out.printf("%.2f\t%.3f\n", 3.14, 3.1415927);	//  소수점 둘째짜리까지만 원한다 f앞에 .2표기 셋째짜리까지 f앞에 .3표기
		  
//			3) %c, $s 서식 지정자 		문자와 문자열
		  System.out.printf("%c %s\n", 'A', "Hello");
		  System.out.printf("%c %s\n", 'A', "\"Hello\"");	// 따옴표를 문자로써 출력하고 싶을 때 따옴표 앞에 역슬래시 써주기 \'
		  System.out.printf("\'%c\' %s\n", 'A', "\"Hello\"");	// 따옴표를 문자로써 출력하고 싶을 때 따옴표 앞에 역슬래시 써주기 \"
		  	    
// 		복사 원하는 열 선택하고 컨트롤 알트 위쪽 화살표 아래쪽 화살표 위로 복사 아래로 복사
		
	}
}
