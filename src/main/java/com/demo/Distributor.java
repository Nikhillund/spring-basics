package com.demo;

public class Distributor {
	
	private int did;
	private String dname;
	private Retailer retailer;
	

	public Distributor() {
		System.out.println("Distributor object is created.");
	}
	
	public Distributor(int did, String dname, Retailer retailer) {
		
		this.did = did;
		this.dname = dname;
		this.retailer = retailer;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	@Override
	public String toString() {
		return "Distributor [did=" + did + ", dname=" + dname + ", retailer=" + retailer + "]";
	}
	

}
