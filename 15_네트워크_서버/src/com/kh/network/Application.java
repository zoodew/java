package com.kh.network;

import com.kh.network.tcp.Server;

public class Application {

	public static void main(String[] args) {
		new Server().serverStart();
	}

}

// 221207 7교시 5 6 7교시 제대로 출력되는지 보기위해 작동시키고 확인하는 법 인강으로 보기 5분~
// 1. 서버 application에서 실행
// 2. 클라이언트 application에서 실행
// 3. 클라이언트에 값 넣어보고 서버랑 클라이언트 오고가면서 잘작동되나 보기
// 4. exit 값 넣어서 잘 종료되나 보고 종료 후에 server 어떻게 변했나 보기(클라이언트 접속 종료 클라이언트 대기중 등등)
// 5. 그 후에 또 클라이언트에 재실행하고 잘 되나 보고 값 넣고 어떻게 동작되나 보기