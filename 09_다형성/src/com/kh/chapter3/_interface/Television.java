package com.kh.chapter3._interface;

public class Television extends Product{
	
	private int inch;
	
	public Television(String brand, String pCode, String name, int price, int inch) {
		
	}
	
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
}
