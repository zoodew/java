package com.kh.chapter1.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.chapter1.list.vo.Music;

public class A_ArrayList {
	// ArrayList를 생성하고 저장, 출력 테스트				221206 2교시
	public void method1() {		// r ArrayList 사이즈 지정 but, 큰 지장 없음 어차피 arraylist는 값이 추가되면 커짐
		List list = new ArrayList(20);

		// 인스턴스를 저장할 때는 add() 메소드를 사용한다.
		list.add("안녕하세요.");	// add ctrl space > 매개변수 데이터 타입이 object. object는 완전 상위타입 그래서 어떤 데이터 타입도 다 저장할 수 있다.
		list.add(LocalDateTime.now());
		list.add(3.14);	// auto boxing이 적용됨. 3.14는 기본타입의 데이터인데 클래스 타입인 object에 담기고 있음 어떻게? 오토박싱을 통해 강의!!!!!
		list.add(false);
		list.add('a');
		list.add(1);

		System.out.println(list);	// 가지고 있는 요소들의 toString값 보여줌 // [안녕하세요., 2022-12-06T10:29:29.928547100, 3.14, false, a, 1]
		// 13~18 주석달면 21행 출력 [] 이렇게 나옴
		// List list = null; 주석달고 10행도 변경하면 null 나옴 비교	!!!!!강의!!!!
		
		System.out.println("size : " + list.size());	// list의 길이
		System.out.println();

		
		//인덱스에 해당하는 인스턴스를 가져올 때는 get() 메소드를 사용한다.
		String str = (String) list.get(0);	// 2교시 강의!!!
		LocalDateTime now = (LocalDateTime) list.get(1);
		
//		System.out.println(str);
//		System.out.println(now);
		// 위의 코드 간단히 for문으로 만드는 법
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		// 향상된 for 문	32~33행 35~37행과 같음
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println();
		
		
		// list는 인스턴스의 중복 저장을 허용한다.
		list.add("안녕하세요");
		
		// null 저장을 허용한다.
		list.add(null);
		list.add(null);
		
		// 원하는 인덱스 위치에 인스턴스를 '추가'할 수 있다.
		list.add(2, 125000);	//2번 인덱스에 125000 값 넣고 2에 있던 값 3으로 3에 있던 값 4로 .....

		System.out.println(list);
		System.out.println();
		
		// 원하는 인덱스 위치에 인스턴스를 '변경'할 수 있다.
		list.set(2, false);

		System.out.println(list);
		System.out.println();
		
		// 저장된 인스턴스를 삭제할 때 remove() 메소드를 사용한다.		221206 3교시
		list.remove(2);
		list.remove("안녕하세요");		// 여러개의 같은 데이터가 있을 때 제일 끝에 것만 삭제됨
//		list.remove(3.14);		// 아래와 같음
		list.remove(new Double(3.14));
		list.remove(Integer.valueOf("1"));		
		list.remove("안녕하세요");		
//		list.get(9);	// 처음에 10개의 자리를 만들어 놓고 인스턴스 삭제 후 마지막 인덱스 값에 접근하려고 하면 에러남 
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println();
		
		// 저장된 인스턴스를 모두 삭제할 때는 clear() 메소드를 사용한다.	221206 3교시
		list.clear();		// 모든 요소(인스턴스)들 제거. 값은 삭제 방은 존재
		System.out.println(list);
		System.out.println(list.isEmpty());	// 인스턴트가 비어있냐 응 true 아니 false
		

		
	}

	
	// ArrayList에 문자열, 정수를 저장, 정렬 테스트			221206 3교시
	public void method2() {	
		/*									
		 * 컬렉션에서 제네릭스(<>)을 사용하는 이유
		 * 	- 명시된 타입의 인스턴스만 저장하도록 제한을 두기 위해서 사용한다.
		 * 	- 컬렉션에 저장된 인스턴스를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다.
		 * 
		 * 리스트의 정렬
		 * 	- String, Wrapper 인스턴스들의 경우엔 Comparable 인터페이스가 내부적으로 구현되어있어서	
		 * 	  Collections.sort() 메소드를 통해서 정렬이 가능하다.
		 * 	- 개발자가 작성하는 클래스의 인스턴스도 Collections.sort() 메소드를 통해서 정렬이 가능하게 하고 싶다면
		 * 	  Comparable 인터페이스를 구현하면 된다.	----> method3()에서 실습				
		 */
		ArrayList<String> list = new ArrayList<String>();
										//		ㄴ 뒤의 <>안은 생략 가능
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("grape");
//		list.add(1);				// 에러 남 데이터타입이 String으로 고정되어있어서 
//		list.add(LocalDateTime);	// 에러 남 
		
//		String banana = list.get(0);
//		String apple = list.get(1);
		
		list2.add(7);
		list2.add(1);
		list2.add(8);
		list2.add(10);
		list2.add(3);
		list2.add(2);
//		list2.add("2");				// 에러
//		list2.add(12.7);
//		list2.add('a');
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println();
		
		
		// 오름차순으로 리스트 정렬								221206 3교시
		// Comparable 인터페이스를 구현하고 있는 요소(인스턴스)를 가지고 있는 리스트를 인자로 전달한다.
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println();
		
		
		// 내림차순으로 리스트 정렬								221206 3교시
		// Collections.sort() 메소드를 통해서 오름차순으로 정렬 '후'에 reverse() 메소드를 호출하여 내림차순으로 정렬한다.
		Collections.reverse(list);
		Collections.reverse(list2);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println();		
	}
	
	
	// ArrayList에 Music 클래스의 인스턴스를 저장, 정렬 테스트	221206 4교시
	public void method3() {
		
		List<Music> list = new ArrayList<>();
				
		list.add(new Music("TOMBOY", "(G)I-DLE", 6));
		list.add(new Music("Nxde", "(G)I-DLE", 3));
		list.add(new Music("사건의 지평선", "윤하", 1));
		list.add(new Music("Cookie", "NewJeans", 4));
		list.add(new Music("After LIKE", "아이브", 5));
		list.add(new Music("바라보기", "엠씨더맥스", 2));
		
		for (Music music : list) {
			System.out.println(music);
		}
		
		System.out.println();
		
//		// 랭킹순으로 리스트를 정렬						221206 4교시
//		Collections.sort(list);
//		
//		for (Music music : list) {
//			System.out.println(music);
//		}
//		System.out.println();
		
		
		// 아티스트순으로 리스트를 정렬					221206 4교시 인강!
		Collections.sort(list, new ArtistAscending());
		
		for (Music music : list) {
			System.out.println(music);
		}
		System.out.println();
		
		
		// 타이틀순으로 리스트를 정렬					221206 5교시 인강!
//			// 익명 구현 객체(이름 없는 클래스)를 사용하는 방법
//		Collections.sort(list, new Comparator<Music>() {
//			@Override
//			public int compare(Music o1, Music o2) {
//				
//				return o1.getTitle().compareTo(o2.getTitle());
//			}
//		});
		
			// 람다식을 사용하는 방법 					추후에 강의
		Collections.sort(list, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
		
		for (Music music : list) {
			System.out.println(music);
		}
		System.out.println();
	
		
		
	}
}
