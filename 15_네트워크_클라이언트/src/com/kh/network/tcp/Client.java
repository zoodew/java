package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


/*										221207 5교시 45분
 * 클라이언트용 TCP 소켓 프로그래밍 순서
 *	1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
 * 	2. 서버와 연결된 입출력 스트림을 생성한다.
 * 	3. 보조 스트림을 통해 스트림의 성능을 개선한다.
 * 	4. 스트림을 통해 데이터를 읽고 쓴다.
 * 	5. 통신을 종료한다.
 */
public class Client {		
	
	public void clientStart() {			//221207 5교시	// 여기까지 후 syso(serverIP)후 ip주소 출력해서 내 컴퓨터랑 같은지 비교 config /all
		//클라이언트용 TCP 소켓 프로그래밍 순서
			//1. 서버의 IP 주소와 포트 번호로 클라이언트용 소켓 객체를 생성한다.
			int port = 30021;
			String serverIP = null;
			Socket socket = null;
			BufferedReader br = null;
			PrintWriter pw = null;
			Scanner scanner = null;
			String message = null;
			
			try {						//221207 6교시
//				serverIP = InetAddress.getLocalHost().getHostAddress(); //'현재' PC의 IP 주소를 가져온다.	
				serverIP = "192.168.20.34"; //'현재' PC의 IP 주소를 가져온다.	
				socket = new Socket(serverIP, port);	//서버와 연결이 실패한다면 null을 반환한다.
				
				if(socket != null) {
					//2. 서버와 연결된 입출력 스트림을 생성한다.
					//3. 보조 스트림을 통해 스트림의 성능을 개선한다.
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					pw = new PrintWriter(socket.getOutputStream(), true);
																	// ㄴ true 넣으면 autoFlush 들어감 밑의 pw.flush 뺄 수 있음
					//4. 스트림을 통해 데이터를 읽고 쓴다.
					scanner = new Scanner(System.in);
					
					while(true) {	// 221207 7교시 처음~ 반복걸고 중단시키기 만드는 법
						System.out.print("서버에 보낼 내용 > ");
						message = scanner.nextLine();
						
						pw.println(message);
//						pw.flush();	//221207 6교시 20분쯤~ 빼먹은거 추가
										//	r or
						if (message == null || message.equals("exit")) {
							System.out.println("접속 종료...");
							
							break;
						}
						System.out.println("받은 메시지 : " + br.readLine());
					}
				}
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				//	5. 통신을 종료한다.
				//		생성된 역순으로 종료시킴
				try {
					scanner.close();
					pw.close();
					br.close();
					socket.close();					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

}

	// 출력 순서 15네트워크서버application에서 출력 한번, 15네트워크클라이언트 application에서 출력 한번,
	// 출력창의 모니터아이콘 눌러서 클라이언트 연결 됨... 확인
	// 사용자 입력 후 엔터

