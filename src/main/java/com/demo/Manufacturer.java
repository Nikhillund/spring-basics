package com.demo;

public class Manufacturer {
	
	private int mid;
	private String mname;
	private Distributor distributor;
	
	public Manufacturer() {
		System.out.println("Manufacturer object is created.");
	}
	public Manufacturer(int mid, String mname, Distributor distributor) {
		
		this.mid = mid;
		this.mname = mname;
		this.distributor = distributor;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Distributor getDistributor() {
		return distributor;
	}
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	
	

}
