package ch18.sec06.exam01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();		// 로컬컴퓨터에 있는 IP주소에 대한 정보를 가지고 있는 InetAddress 객체 얻기
			
			System.out.println("내 컴퓨터 IP주소 : " + local.getHostAddress());	// IP주소 출력	 객체.getHostAddress() 메소드 호출로 IP주소 얻을 수 있음
			
			
			// 도메인 이름으로 IP주소 검색해서 알아보는 법 
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
					// 배열을 얻기[] .getAllByName() 메소드를 통해 매개값으로 주어진 도메인 이름으로 DNS에서 검색해서 복수 개의 IP주소를 가져와 각각 InetAddress 객체로 만든 후 배열로 리턴
			//for 문을 이용해 InetAddress 하나씩 가져와 ip를 조사
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
			}

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
	}

}
