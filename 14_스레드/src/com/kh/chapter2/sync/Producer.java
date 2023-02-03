package com.kh.chapter2.sync;

public class Producer extends Thread {	//221209 4교시
	private Storage storage;

	public Producer(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				storage.setData(i);
			
				Thread.sleep(500);	// 4교시 30분~ 밀리세컨드 기준 그래서 1000 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
