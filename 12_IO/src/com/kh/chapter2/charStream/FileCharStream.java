package com.kh.chapter2.charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {
	//Java 12 _IO 4.파일 관련 입출력 스트림 char 기반 stream
	public void fileSave() {						//221205 2교시
		
		/*
		 * try-with-resource 문을 통해서 사용한 리소스를 자동으로 close() 시킨다.
		 */
			// r fileByteStream처럼 복잡하게 try catch finally 복잡하게 쓰기 싫으니까 간단하게 쓸 수 있는 방법
		try (FileWriter fw = new FileWriter("b_char.txt")) {	// 이렇게 선언해주면 try문 안에서만 작동하고 알아서 종료됨
		
			fw.write("IO 재미있으신가요?......ㅋㅋㅋㅋ\n");	
			fw.write("아닌가요..?ㅠㅠ", 1, 2);
			fw.write('\n');	//줄바꿈
			fw.write('A');
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});	//배열값 !!!!!!!!3교시 15분 강의
			fw.write('\n');
			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'}, 1, 3);
						
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {						//221205 3교시
		
		try (FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
			
			while((value = fr.read()) != -1) {
				System.out.print((char) value);	//value 값이 정수형이라 char로 변환 3교시 25분쯤
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
