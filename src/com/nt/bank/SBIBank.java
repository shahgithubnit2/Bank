package com.nt.bank;

public class SBIBank {
	private double bal=10000;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SBIBank sbi=new SBIBank();
		 	
		 	System.out.println(sbi.withDraw(5000));
	}
	
	public double withDraw(int amt){
		bal=bal-amt;
		
		return amt;
	}
	

}
