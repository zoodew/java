package com.kh.exception.practice;

import java.io.IOException;

//		Java 11 예외처리 2.1 CheckedException		221202 6교시
public class D_CheckedException {

	/*											221202 6교시
	 * CheckedException
	 * 	- 컴파일 시 예외 처리 코드가 있는지 검사하는 예외를 말한다.
	 *  - Exception 클래스를 상속하고 있는 예외들을 CheckedException이라 한다.
	 *  - 조건문이나 소스코드 수정으로는 해결되지 않는다. 따라서 예외 처리가 되어있지 않으면 컴파일 에러를 발생시킨다.
	 */
	public void method1() throws IOException {		//221202 6교시   모냐이게!!!!! 다시보기!!
		method2();
		
	}
	
	public void method2() {							//221202 6교시	
	
		
		throw new NullPointerException();
//		throw new IOException();
		
	}

}

