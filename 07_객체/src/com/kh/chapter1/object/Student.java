package com.kh.chapter1.object;

public class Student {				//221124 1교시 2교시 강의 듣고 정리
	// 필드(속성) (= 멤버변수, 프로퍼티)
	//	캡슐화를 적용시키기 위해 접근 제한자(public - 모두가 다 볼 수 있음)를 private로 변경한다.
	//	private로 변경하면 동일한 클래스 안에서만 직접 접근할 수 있음
	private int sNum;	//학번
	
	private String name; //이름
	
	private int age;		//나이
	
	private int math;	//수학점수
	
	private int eng;		//영어점수

	
	// 메소드 (객체의 기능)
	public int sum(){
		return math + eng;
	}
	
	public double avg() {
		return (math + eng) / 2.0;
	}
	
	
	/*
	 * 1. Getter 메소드		(출력)
	 * 	- 메소드를 통해서 필드값을 가공한 후 외부로 전달하는 역할을 한다.
	 * 	- 외부에서 접근이 가능해야 하기 때문에 접근 제한자는 public으로 사용해야 한다.
	 * 			접근 제한자를 private로 만들어서 외부에서 못 보는 것들 외부에서 볼 수 있도록 간접접근 가능하게 해주는 메소드라서
	 * 	- 메소드의 이름은 getXXX와 같이 붙여주게 된다.
	 * 	- 필드의 타입이 boolean일 경우에는 get으로 시작하지 않고 is로 시작하는 것이 관례이다.
	 * 
	 * 2. Setter 메소드		(초기화)
	 * 	- 메소드를 통해서 유효한 값만 필드의 데이터로 저장하는 역할을 한다.
	 * 	- 외부에서 접근이 가능해야 하기 때문에 접근 제한자는 public으로 사용해야 한다.
	 *	- 메소드의 이름은 setXXX와 같이 붙여주게 된다.
	 */
	public String getName() {
		return name;		// name = 프라이빗 필드
	}
//						string name 매개변수	
	public void setName(String name) {
		// this : 객체 자신을 가리킨다.
		this.name = name;
	}
	
//	 alt + shift + s -> getter setter 만드는 단축키. generate getter setter
	
	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = (age >= 1) ? age : 1;
			// application의 *1
			// 삼항 연산자 사용 age가 1보다 크거나 같으면 age 거짓이면 1 항 두개. 대응 연산자까지 세 개
	}
	
	public void setMath(int math) {
			// application의 *2
			// if else문 사용 0보다 작으면 0 100보다 크면 100 그 사이면 제대로 된 점수
		if(math >= 0 ) {
			if(math > 100) {
				this.math = 100;
			}else {
				this.math = math;
			}
		}else {
			this.math = 0;
		}		
		
	}
	
	public int getMath() {
		return math;
	}
	
	public void setEng(int eng) {
		if(eng >= 0 ) {
			if(eng > 100) {
				this.eng = 100;
			}else {
				this.eng = eng;
			}
		}else {
			this.eng = 0;
		}
	}

	public int getEng() {
		return eng;
	}
	
	
	
	// 학생의 정보를 출력하는 메소드를 만들어주세요.			112224 3교시 45분
	public void information() {
		System.out.printf("%s님의 나이는 %d, 수학 점수는 %d, 영어 점수는 %d, 총점은 %d, 평균은 %.2f 입니다.\n",
//			this.getName(), this.getAge(), this.getMath(), this.getEng(), this.sum(), this.avg());
//					// 같은 메소드 안에 있으니 this로 불러옴 
			name, age, math, eng, sum(), avg());
					// this 쓸 필요도 없이 같은 클래스 내에 있으니 그냥 불러옴		
	}

}










