package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {						//221202 7교시
	// 12 IO 3.3 File
	public void method1() {					//221202 7교시		강의꼬오오옥 듣기 완료!!!!!
		try {
			// 경로를 지정하지 않으면 현재 프로젝트 폴더(12_IO)에 파일이 생성된다.	//221202 7교시
			File file = new File("test.txt");	// 메모리상에만 존재하는 인스턴스. 힙영역에 존재 파일이 진짜 있는 게 아님
		
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대 경로 : " + file.getAbsolutePath());	// 파일이 실제 있는 전체 경로
			System.out.println("상대 경로 : " + file.getPath());			// 현재 프로젝트를 기준으로 어디에 있는지 보여줌 
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 존재 여부 :" + file.exists());			//실제 물리적인 위치에 파일이 존재하느냐
			System.out.println();
			
			file.createNewFile();	// 파일을 실제로 만들려면 이 메소드(.createNewFile) 호출해야 함
			
			// 존재하는 경로까지 지정해주면 해당 위치에 파일을 생성한다.				//221202 7교시
			// 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			File file2 = new File("D:/test2.txt");	
//			File file2 = new File("D:/temp/test2.txt");	// 에러(27행의 폴더 만드는 명령어가 사전에 없을 때) > 지정된 경로를 찾을 수 없습니다. 지정한 경로에 폴더가 없으면 에러남
			
//			file2.mkdirs();		// make directory(폴더) 폴더 만드는 명령어. 25행의 test2까지 폴더로 인식
			file2.createNewFile();	// 진짜 들어가서 봐보기

			
			// 폴더를 만들고 파일 생성하기							221202 8교시
//			File tempDir = new File("d:/temp");
			File tempDir = new File("d:/temp/test");			// 폴더 생성 따로 해주고서 38행 주석 이어서
			
//			tempDir.mkdir();	// 하나의 폴더를 생성할 때 32행과. 33행이랑 쓰면 temp만 생성됨
			tempDir.mkdirs();	// 여러개의 폴더를 생성할 때 33행과.
			
			File file3 = new File("d:/temp/test/test3.txt");	// 파일 만든다.
			
			file3.createNewFile();
			
			System.out.println("파일명 : " + file3.getName());
			System.out.println("절대 경로 : " + file3.getAbsolutePath());	// 파일이 실제 있는 전체 경로
			System.out.println("상대 경로 : " + file3.getPath());			// 현재 프로젝트를 기준으로 어디에 있는지 보여줌
			System.out.println("파일 용량 : " + file3.length());
			System.out.println("파일 존재 여부 :" + file3.exists());	//실제 물리적인 위치에 파일이 존재하느냐
			System.out.println("파일 여부 : " + file3.isFile());		//파일인지 디렉토리인지 구분해주는 메소드
			System.out.println("디렉토리 여부 : " + file3.isDirectory());		//파일인지 디렉토리인지 구분해주는 메소드

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
}
