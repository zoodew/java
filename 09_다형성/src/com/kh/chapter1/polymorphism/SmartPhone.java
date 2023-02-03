package com.kh.chapter1.polymorphism;

public class SmartPhone extends Product{//틀렸었음!!!	클래스 생성시에 상속 붙여줌 하위에 따로 또 만드는게 아니라		//221128 6교시
		private String mobileAgency;
		
		public SmartPhone() {
			
		}
		
		public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
			super(brand, pCode, name, price);
			
			this.mobileAgency = mobileAgency;
			
		}
		
		public String mobileAgency() {
			return mobileAgency;
		}

		public void setmobileAgency(String mobileAgency) {
			this.mobileAgency = mobileAgency;
		}
	
	public String information() {
		return super.information() + " mobileAgency : " + mobileAgency;
	}


}
