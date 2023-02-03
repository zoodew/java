package com.kh.chapter3._interface;

public class SmartPhone extends Product{//221201 2교시
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
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}


}
