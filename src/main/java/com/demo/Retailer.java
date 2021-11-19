package com.demo;

public class Retailer {
	
	private int rid;
	private String rname;
	
	public Retailer() {
		System.out.println("Retailer bean created.");
	}
	
	public Retailer(int rid, String rname) {
		
		this.rid = rid;
		this.rname = rname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}

	@Override
	public String toString() {
		return "Retailer [rid=" + rid + ", rname=" + rname + "]";
	}
	

}
