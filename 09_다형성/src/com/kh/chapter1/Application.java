package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;


public class Application {

	public static void main(String[] args) {				//221130 2교시
		/*대입연산자 왼쪽과 오른쪽 데이터 타입이 같아야 한다. ex int a = 1; String b = "히히";
		 * 	double a = 1; >> 데이터 타입이 다른데 왜 에러 안 나지? 자동형변환이 일어나서!
		 */
		
		// 1. 부모 타입의 참조변수로 부모 인스턴스를 다루는 경우
		Product product = new Product();
		
		// 1 결과 product 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(product.information());
		
		
		// 2. 자식 타입의 참조변수로 자식 인스턴스를 다루는 경우
		Desktop desktop = new Desktop();
		
		// 2 결과 desktop 참조변수로 Product, Desktop 클래스의 멤버에 접근 가능
		System.out.println(desktop.information());
		System.out.println(desktop.isAllInOne());
		
		
		// 3. 부모 타입의 참조변수로 자식 인스턴스를 다루는 경우				//여기부터 다형성
		Product smartPhone = /*(Product)*/ new SmartPhone();	//업 캐스팅
		
		// 3 결과 smartPhone의 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(smartPhone.information());
		// 하지만 SmartPhone 클래스의 멤버에 접근하고 싶으면 형 변환을 해야 한다.
		System.out.println(((SmartPhone)smartPhone).mobileAgency());	//다운 캐스팅
		
		
		// 4. 배열과 다형성										//221130 2, 3교시(그림으로 설명)
		// 다형성을 적용하기 전에는 Desktop, SmartPhone 인스턴스를 배열로 다뤄야 하는 경우 각각의 배열을 만들어야 한다.
		Desktop[] array1 = new Desktop[2];
		
		array1[0] = new Desktop();
		array1[1] = new Desktop();
		
		SmartPhone[] array2 = {new SmartPhone(), new SmartPhone()};
		
		
		System.out.println();
		
		//다형성을 적용하면 부모 클래스의 배열변수로 다양한 인스턴스들을 가리킬 수 있다.
		Product[] array3 = new Product[4];
		
		array3[0] = new Desktop("애플", "a1111", "맥 24인치", 1500000, true);
		array3[1] = new Desktop("삼성", "s3333", "매직스테이션", 2000000, false);
		array3[2] = new SmartPhone("애플", "a2222", "아이폰12 미니", 900000, "KT");
		array3[3] = new SmartPhone("애플", "a2222", "아이폰12 미니", 900000, "KT");
//		array3[3] = new Television();		원래 이 윗줄 식 강의는 텔레비전인데 내가 안 채워서 일단은 스마트폰으로
		
		for(int i = 0 ; i < array3.length ; i++) {
			System.out.println(array3[i].information());	//하나의 코드인데 실행내용이 다름 다형성 사용 이유
		}
		
		for (int i = 0; i < array3.length; i++) {
			if( array3[i] instanceof Desktop) {
				Desktop d = (Desktop)array3[i];
				
				System.out.println(d.isAllInOne());
				//System.out.println(((Desktop)array3[i]).isAllInOne());
			} else if( array3[i] instanceof SmartPhone) {
				SmartPhone s = (SmartPhone)array3[i];
				
				System.out.println(s.mobileAgency());
//			} else {
//				System.out.println(((Television)array3[i]).getInch());
			}
		}
		
		System.out.println();
		
		// 위의 for문 향상된 for문으로 써보기
		for (Product p : array3) {
			if (p instanceof Desktop) {
				System.out.println(((Desktop)p).isAllInOne());
			} else if(p instanceof SmartPhone) {
				System.out.println(((SmartPhone)p).mobileAgency());
//			} else {
//				System.out.println(((television)p).getInch());
			}
		}
		
		
		System.out.println();
		
		//매개변수의 다형성								221130 4교시
		productInfo(new Desktop());
		productInfo(new SmartPhone());
//		productInfo(new Television());		//텔레비전 메소드 다 채우면 텔레비전 관련 주석 다 풀어보기
	}
	
//	public static void productInfo(Desktop desktop) {
//		System.out.println(desktop.information());
//	}
//	
//	public static void productInfo(SmartPhone smartPhone) {
//		System.out.println(smartphone.information());
//	}
//
////	public static void productInfo(Television television) {
////		System.out.println(television.information());
////	}
//	
	
	public static void productInfo(Product product) {
		System.out.println(product.information());
	}				//다형성을 사용하면 일일히 하나하나 다 쓰지 않아도 매우 간단하게 작성할 수 있다
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
