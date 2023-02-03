package com.kh.network.receiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver implements Runnable {				//221209 5교시 20분~

	private Socket client;
		
	public Receiver(Socket client) {
	this.client = client;
	}

	@Override
	public void run() {									//221209 5교시 20분~
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
			//5. 연결된 클라이언트와 입출력 스트림 생성한다.			클라이언트랑 문자로 주고받을거라서 input output으로 
			//6. 보조 스트림을 통해 스트림의 성능을 개선한다.
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream(), true);		//221207 5교시 25분쯤 강의듣기!!!!
				
			//7. 스트림을 통해 데이터를 읽고 쓴다.
			while(true) {	//221207 6교시 끝쪽 강의!!! 무한반복만들기 추가!!!! 클라이언트가 exit시키면 그때 종료될수있게
				String message = br.readLine();	// ??readLine이? 클라이언트로부터 입력이 있을 때까지 블로킹된다. 입력 전에 아무 것도 안 함
				
				if(message == null || message.equals("exit")) {
					System.out.println("클라이언트 접속 종료");
					
					break;
				}
				
				System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
				
				pw.println("메시지 받기 성공!!");
//				pw.flush(); //221207 6교시 20분쯤 강의 듣기!!!!!! 하나 빼먹어서 추가 함
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8. 통신을 종료한다. 	221209 5교시 35분~
			try {
				pw.close();
				br.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
