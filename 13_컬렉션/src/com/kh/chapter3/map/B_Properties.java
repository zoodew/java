package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

// Java 13_컬렉션 5.Properties					221207 1교시
public class B_Properties {

	// Properties를 생성하고 저장, 출력 테스트			221207 1교시
	public void method1() {
		/*
		 * Properties
		 * 	- Map 계열이다.
		 * 	- Key, Value 세트로 저장된다.
		 * 	- Key, Value는 String으로 제한되어 있다.
		 */
		Properties prop = new Properties();
		
		// 순서 유지 X, 키값 중복 X
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Set", "TreeSet");	// 중복값 마지막 걸로 나옴
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);			// 순서 유지되지 않음
		System.out.println();
		
		// value값을 읽어오기
		System.out.println(prop.getProperty("Set"));	// TreeSet > Set에 해당하는 value값 가져옴
		System.out.println(prop.getProperty("Music"));	// Null	> 주어진 value가 없을 때 
		System.out.println(prop.getProperty("Music", "뉴진스"));	// 주어진 value가 없을 때 지정한 값("뉴진스") 출력해줌
		System.out.println();
		
			// 1교시 30분쯤!!!!!!! 강의!!!!!!!!!!!
		for(Entry<Object, Object> entry: prop.entrySet()) {
			System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());
		}
	}
	
	
	// Properties 파일 생성 및 저장					221207 1교시
	public void fileSave() {					
		Properties prop = new Properties();			// 1교시 40분쯤~~~~ 강의!!!!!!

		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
				
		try {							//	 r 저장할 파일.확장자	 		r 주석
//			prop.store(new FileOutputStream("test1.properties"), "Properties Test 1");
//			prop.store(new FileWriter("test2.properties"), "Properties Test 2");	//221207 2교시 처음~
			prop.storeToXML(new FileOutputStream("test3.xml"), "XML Test");			//221207 2교시 10분~
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// Properties 파일에서 데이터 읽기				221207 2교시
	public void fileRead() {
		Properties prop = new Properties();			// 2교시 15분쯤~~~ 강의!
		
		try {
//			prop.load(new FileInputStream("test1.Properties"));
//			prop.load(new FileReader("test2.properties"));
			prop.loadFromXML(new FileInputStream("test3.xml"));
			
			System.out.println(prop);
			System.out.println();
			
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}


}
