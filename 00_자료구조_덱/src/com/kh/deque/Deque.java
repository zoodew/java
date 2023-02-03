package com.kh.deque;

import java.util.ArrayDeque;

public class Deque {

// 자료구조 - 덱(Deque)

/*
 * 1. 정의
 * 	- 덱(Deque)이란 Double-Ended Queue의 줄임말이다.
 * 		즉, 큐의 양쪽으로 데이터의 삽입과 삭제를 수행할 수 있는 자료구조.
 * 		cf) 큐는 선입선출(First In First Out) 구조
 * 
 * 
 * 2. 특징
 * 	- java.util 패키지에 소속되어 있고 Null요소는 사용을 하지 못 한다.
 * 	- 크기가 가변적이다. (선언 후에 변경할 수 있다.)
 * 	- 여러 개의 메모리 단위로 데이터를 저장한다. vector는 메모리를 재할당하고 모든 요소를 복사하여야 하는데, deque는 새로운 메모리 단위를 할당하여 요소를 추가한다.
 * 	  또 데이터 요소를 저장하는 여러 개의 메모리 단위를 갖는다.
 * 	- 중간 요소가 삽입, 삭제될 떄 요소들을 앞/뒤로 밀 수 있으므로 vector보다는 좋은 성능을 가진다.
 * 	  그러나 앞/뒤에서의 삽입/삭제 성능은 좋지만 중간에서의 삽입/삭제 성능은 좋지 않다.
 * 	- 연속적인 메모리를 기반으로 하는 '시퀀스 컨테이너'이다. 따라서, 임의 접근 반복자를 제공한다.
 *
 * 
 * 3. 장점
 * 	- 데이터의 삽입과 삭제가 빠르다
 * 	- 크기가 가변적이다
 * 	- 앞/뒤에서 데이터를 삽입/삭제할 수 있다.
 * 	- index로 임의 원소 접근이 가능하다.
 * 	- 새로운 원소 삽입 시에 메모리를 재할당하고 복사하지 않고 새로운 단위의 메모리 블록을 할당하여 삽입한다
 *
 *
 * 4. 단점
 * 	- 덱 중간에서의 삽십과 삭제가 어렵다.
 * 	- 구현이 어렵다.
 * 
 * 5. 덱 구현
 *	- 자바에서의 덱은 인터페이스로 구현되었다.
 *	  덱 자료구조의 여러 연산들을 정의한 Deque 인터페이스가 있고 이를 구현한 ArrayDeque, LinkedBlockingDeque, ConcurrentLinkedDeque, LinkedList 등의 클래스가 있다.
 *
 */
	
	
	public static void main(String[] args) {
		
		// 덱 선언
		
		ArrayDeque<Integer> d = new ArrayDeque<Integer>();	
		System.out.println(d);
		
		
		/* 
		 * 덱 데이터 추가
		 * 	덱 데이터를 추가하는 메소드는 addFirst(), offerFirst(), addLast(),  add(), offerLast(), offer() 등이 있다.
		 * 
		 *  - add 와 offer의 차이
		 *  	add 메소드   : 용량을 초과하는 경우 illegalStateException 예외가 발생
		 *  	offer 메소드 : 용량을 초과하는 경우 false를 반환
		 */
		System.out.println();
		System.out.println("==========덱 데이터 추가 메소드=========");
		
		System.out.println("1) 앞쪽으로 데이터 추가");

		d.addFirst(6);						// addFirst()	: 덱의 앞쪽에 데이터 삽입
		System.out.println(d);
		
		d.offerFirst(5);					// offerFirst()	: 덱의 앞쪽에 데이터 삽입
		System.out.println(d);
		
		d.push(4);							// push()		: addFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
		System.out.println(d);

		d.addFirst(3);
		System.out.println(d);

		d.addFirst(2);
		System.out.println(d);

		d.addFirst(1);
		System.out.println(d);

		System.out.println();
		System.out.println("2) 뒤쪽으로 데이터 추가");

		d.addLast(7);						// addLast()	: 덱의 뒤쪽에 데이터 삽입
		System.out.println(d);
		
		d.add(8);							// add()		: addLast()와 동일
		System.out.println(d);
		
		d.offerLast(9);						// offerLast()	: 덱의 뒤쪽에 데이터 삽입
		System.out.println(d);
		

		/*
		 * 덱 데이터 삭제
		 * 	덱 데이터를 삭제하는 메소드는 removeFirst(), pollFirst(), remove(), poll(), removeLast(), pollLast() 등이 있다.
		 * 
		 * 	- remove와 poll의 차이
		 * 		remove 메소드	: 덱이 비어있는데 삭제하면 NoSuchElementException 예외가 발생
		 * 		poll 메소드	: 덱이 비어있는데 삭제하면 null을 반환
		 */
		System.out.println();
		System.out.println("==========덱 데이터 삭제 메소드=========");

		System.out.println("1) 앞쪽에서 데이터 삭제");		
		
		d.removeFirst();					// removeFirtst()	: 덱의 앞쪽에서 데이터 하나를 뽑아서 제거 후 해당 데이터를 반환
		System.out.println(d);
		
		d.pollFirst();						// pollFirst()		: 덱의 앞쪽에서 데이터 하나를 뽑아서 제거 후 해당 데이터를 반환
		System.out.println(d);
		
		d.remove();							// remove()			: removeFirtst()와 동일
		System.out.println(d);
		
		d.poll();							// poll()			: pollFirst()와 동일
		System.out.println(d);

		
		System.out.println("2) 뒤쪽에서 데이터 삭제");
		d.removeLast();						// removeLast()		: 덱의 마지막쪽에서 데이터 하나를 뽑아서 제거 후 해당 데이터 반환
		System.out.println(d);
		
		d.pollLast();						// pollLast()		: 덱의 마지막쪽에서 데이터 하나를 뽑아서 제거 후 해당 데이터 반환
		System.out.println(d);
		
				
		/*
		 * 덱 데이터 가져오기(읽기)
		 * 	덱 데이터 가져오는 메소드 getFirst(), peekFirst(), peek(0, getLast(), peekLast(), ...
		 *  
		 * 	- get과 peek의 차이
		 * 		get 메소드	: 해당 값을 반환하고 실패 시 NoSuchElementException 예외 발생
		 * 		peek 메소드	: 해당 값을 반환하고 실패 시 null을 반환
		 */
		System.out.println();
		System.out.println("==========덱 데이터 가져오기(읽기) 메소드=========");

		System.out.println(d);
		
		System.out.println("1) 앞쪽에서 데이터 가져오기");		
		
		System.out.println(d.getFirst());	// getFirst()		: 덱의 앞쪽 데이터 하나를 제거하지 않은채 반환
		
		System.out.println(d.peekFirst());	// peekFirst()		: 덱의 앞쪽 데이터 하나를 제거하지 않은채 반환
		
		System.out.println(d.peek());		// peek()			: peekFirst()와 동일

		System.out.println("2) 뒤쪽에서 데이터 가져오기");
		
		System.out.println(d.getLast());	// getLast()		: 덱의 뒤쪽 데이터 하나를 제거하지 않은채 반환
		
		System.out.println(d.peekLast());	// peekLast()		: 덱의 뒤쪽 데이터 하나를 제거하지 않은채 반환	
		
		
		System.out.println();
		System.out.println("==========기타 메소드=========");
		System.out.println(d.size());		// size()			: 덱의 크기
		
	}
		
 
		      

		
}
