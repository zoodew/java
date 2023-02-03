package com.kh.chapter3.map.vo;

public class Snack {				// 221206 7교시
	private String flavor;
	
	private int calorie;
	
	
	public Snack() {	//ctrl space 단축키
	}

	
	public Snack(String flavor, int i) {
		this.flavor = flavor;
		this.calorie = i;
	}

	
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calorie=" + calorie + "]";
	}
	
	
}
