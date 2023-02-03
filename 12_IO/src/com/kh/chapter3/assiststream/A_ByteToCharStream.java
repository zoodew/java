package com.kh.chapter3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {
	//Java 12 _IO 6.1 문자 변환 보조 스트림				221205 3, 4교시
	public void input() {							//221205 3교시
		String value = null;
//		char[] array = new char[10];		221105 3교시
		
		// 아래와 같이 보조 스트림 여러 개를 사용하는 것도 가능하다.
				// r 221205 5교시
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("문자열 입력 > ");
			
//			isr.read(array);
			value = br.readLine();						//221205 5교시
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
//			System.out.println(Arrays.toString(array));		221205 3,4교시
	//위 아래 같은데 위보다 깔끔하게 정리해서 보여주는 법 아래
//			for (char c : array) {
//				System.out.print(c + " ");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
	
	
	public void output() {							//221205 4교시
		
		
		// 221205 5교시
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			bw.write("아직도 IO가 어려우신가요..?ㅠㅠ");
			bw.newLine();
			bw.write("앞으로 Oracle,JDBC, HTML, CSS, ... 남아있습니다..");
			bw.newLine();
			bw.write("힘내세요..^^");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		// 221205 4교시
//		try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//			osw.write("아직도 IO가 어려우신가요..?ㅠㅠ\n");
//			osw.write("앞으로 Oracle,JDBC, HTML, CSS, ... 남아있습니다..\n");
//			osw.write("힘내세요..^^");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
				
	}
}
