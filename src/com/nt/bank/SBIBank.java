package com.nt.bank;

public class SBIBank {
	private double bal=10000;
	private String name;

	
	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double withDraw(int amt){
		bal=bal-amt;
		
		return amt;
	}
	

}
