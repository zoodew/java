package com.kh.inherit.after;
	//after폴더는 '상속' 사용해서 만든 것
/*
 * 상속											221128 4교시 25분~
 * 	 [표현법]
 * 	   [접근제한자] class 자식클래스명 extends 부모클래스명{
 *		...
 * 	   }
 */

						/*product가 같은 패키지라 import필요없는데 다른 패키지면 import 필요*/
public class Desktop extends Product{
	
	//필드
		//상속을 해서 부모에 있는 필드들 포함이 되어있다고 생각하면 됨 *부모클래스의 private멤버는 직접 상속은 불가 게터세터써야함
	private boolean allInOne;	//일체 여부
	
	//기본생성자
	public Desktop() {
//		super();	//부모 인스턴스를 가르키는 참조값	 생략가능		//221128 5교시 5분~ 인강 꼭 듣기
		System.out.println("Desktop() - 호출");			//221128 5교시 어떤 순으로 코드가 실행되나 보려고 적은 코드 
	}	// ㄴsyso 쓴 이유 Product의 기본 생성자가 호출되었다는 걸 표시하려고 5교시 1분 50초
				// 08상속 4 자식객체생성 설명 Application 가서 호출 해보면 16행 자식클래스의 인스턴스를 가지고 호출했음에도
				// Product() Desktop()순으로 호출되는 걸 볼 수 있음 >> @자식클래스 인스턴스를 만들어도 부모클래스의 인스턴스를 먼저 생성함
				//											 부모 Product가 생성되면서 Product의 필드 생성되고 그 다음에 Desktop의 필드가 생성
	/*
	 * 부모 클래스의 필드를 초기화할 수 있는 방법
	 * 
	 *  super : 부모 인스턴스의 주소를 담고 있다.
	 *  일반 메소드에서는 쓸 수 없고 생성자에서만 접근이 가능
	 *  항상 맨 위에서 작성되어야함 > 자식클래스 생성자 호출되기 전에 부모클래스가 먼저 호출되어야하기 때문에
	 *  생략가능 생략되어도 있는것처럼 동작
	 */
	
	//자식 클래스로 인스턴스를 생성하면 ~~~ 강의듣고 채우기		221128 5교시													//221128 5교시 13분~
	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
//		super(brand, pCode, name, price);
		
//		// 1. super와 .(도트) 연산자로 부모의 필드에 직접 접근			//221128 5교시 25분
//		super.brand = brand;		
//		super.pCode = pCode;
//		super.name= name;
//		super.price = price;

//		// 2. 부모의 Setter 메소드를 호출해서 초기화					//221128 5교시
//		super.setBrand(brand);
//		this.setpCode(pCode);
//		setName(name);
//		setPrice(price);
		
		// 3. 부모 생성자 호출해서 초기화							//221128 5교시
		super(brand, pCode, name, price);
		
		this.allInOne = allInOne;
	}



	//게터세터 메소드			221128 4교시 올인원필드에 대한 게터세터
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
	//오버라이딩														221128 6교시
	@Override		//꼭 쓸 필요는 없는데 사용하면 오버라이딩을 해준다고 컴퓨터에게 얘기하는 거라서 컴퓨터가 오버라이딩이라고 생각하고서 오류를 잡아줌
	public String information() {	//부모클래스의 information과 선언부가 똑같음. 똑같이 하는 게 오버라이딩
		return super.information() + ", allInOne : " + allInOne;	//올인원 정보까지 한번에 출력하게 만드는 방법
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}			//product라는 부모 클래스를 상속 받아서 공통된 코든 다 빠졌기 때문에 코드가 매우 간략해짐
