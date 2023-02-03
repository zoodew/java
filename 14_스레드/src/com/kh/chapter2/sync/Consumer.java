package com.kh.chapter2.sync;

public class Consumer implements Runnable {	//221209 4교시

	private Storage storage;
	
	public Consumer(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {							//4교시 35분~
				storage.getData();

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
