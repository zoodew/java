package com.kh.chapter2.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter2.set.vo.Music;

//Java 13_컬렉션 3.3 TreeSet
public class B_TreeSet {			
	public void method1() {			//221206 6교시
		TreeSet<String> ts = new TreeSet<>();
		
		// 중복 제거, 인스턴스를 오름차순으로 정렬, null은 저장 안 됨
		ts.add("하하하");
//		ts.add(null);
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");
		ts.add("하하하");
	
		System.out.println(ts);
		System.out.println(ts.first());	// 가장 첫 번째 요소
		System.out.println(ts.last());	// 가장 마지막 요소
	}
	
	
	public void method2() {			//221206 7교시
//		Set<Music> set = new TreeSet<>();
//		Set<Music> set = new TreeSet<>(new Comparator<Music>() {
//			@Override
//			public int compare(Music o1, Music o2) {
//				return o1.getTitle().compareTo(o2.getTitle());
//			}
//		});
				// 위에랑 같은 거 람다식으로 표현한 거 나중에 배울 거니까 그냥 이런 게 있다 보기
		Set<Music> set = new TreeSet<>((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
		
		set.add(new Music("TOMBOY", "(G)I-DLE", 6));
		set.add(new Music("TOMBOY", "(G)I-DLE", 6));
		set.add(new Music("Nxde", "(G)I-DLE", 3));
		set.add(new Music("사건의 지평선", "윤하", 1));
		set.add(new Music("바라보기", "MC THE MAX", 1));
		set.add(new Music("Cookie", "NewJeans", 4));
		set.add(new Music("Cookie", "NewJeans", 4));
		
		for (Music music : set) {
			System.out.println(music);
		}
	}
}
