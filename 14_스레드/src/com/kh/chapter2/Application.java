package com.kh.chapter2;

import com.kh.chapter2.sync.Consumer;
import com.kh.chapter2.sync.Producer;
import com.kh.chapter2.sync.Storage;

public class Application {

	public static void main(String[] args) {
								// 221209 4교시 25분~
		Storage storage = new Storage();					// 인스턴스
		Thread producer = new Producer(storage);			// 스레드
		Thread consumer = new Thread(new Consumer(storage));// 스레드

		producer.start();
		consumer.start();
		
		
	}

}
