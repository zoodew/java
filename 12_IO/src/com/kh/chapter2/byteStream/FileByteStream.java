package com.kh.chapter2.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStream {
	
	//Java 12 _IO 4.파일 관련 입출력 스트림 byte 기반 stream
	public void fileSave() {							//221205 1교시
		FileOutputStream fos = null;		//import & 초기화하기
		byte[] array = {99, 100, 101};					//221205 2교시
		try {
			
			fos = new FileOutputStream("a_byte.dat");
//			fos = new FileOutputStream("a_byte.dat", true); // 두번째  매개값에 ( ,true) 적으면 이어쓰기. 안 적으면 덮어쓰기 
			
			fos.write(97);	//문자 a 저장
			fos.write('b');	//문자 b 저장
			fos.write(10);	//줄바꿈 문자 저장
			fos.write(97);
			fos.write(10);
			fos.write(array);//cde(99 100 101아스키코드)					//221205 2교시
			fos.write(10);									//221205 2교시
			fos.write(array, 1, 2);//지정된 오프셋부터 갯수 [1]부터 두 개 d, e	//221205 2교시
			fos.write(10);
			fos.write('한');	// \나옴	//한글은 2byte로 표현 그래서 바이트 단위 스트림으로 보기에는 제한이 있음
//			fos.flush();		// flush 버퍼에 차 있는 데이터들을 한번 비워주는 역할을 함 여기선 close()썼기 때문에 굳이 안 써도 됨
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();		//fos = new FileOutputStream("a_byte.dat"); 예외처리
		} catch (IOException e) {
			e.printStackTrace();		//fos.write(97); 예외처리
		} finally {
			try {
				fos.close();	// for.close()가 위의 try 구문 마지막에 있으면 위의 fos = ~,  fos.write에서 오류나면close가 작동 안돼서finally에 따로 빼줌 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead() {							//221205 2교시
		FileInputStream fis = null;	//import해주고 초기화
		byte[] array = new byte[100];
		
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용한다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 */
//			System.out.print((char)fis.read());	//97이 나옴 제일 먼저 저장된 값이 97이라서.
//			System.out.print((char)fis.read());	// 25분쯤 강의듣기
//			System.out.print((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println(fis.read(array));//r 배열에 값을 담을 때 몇번 인덱스부터 몇개를 받을지 정하는 것도 가능
////			System.out.println(fis.read(array, 3, 3));	//배열에 저장된 데이터 개수	 a_byte.dat에
//			System.out.println(Arrays.toString(array));
//			System.out.println(fis.read());		//-1

			
			//반복문을 통해 모든 데이터를 리턴하는 방법
			int value = 0;
			
			while((value = fis.read()) != -1) {
				System.out.print((char) value);
			}
			System.out.println();

//			while(fis.read() != -1) {
//				System.out.print(fis.read());
//			}										//왜 이렇게 안 하나요? 2교시 40분쯤 강의 듣기!!!
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//예외가 발생하든 발생하지 않든 작동하는 구문 > 그래서 안에 또 예외처리해줘야함
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
