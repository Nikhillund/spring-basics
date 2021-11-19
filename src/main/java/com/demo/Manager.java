package com.demo;

public class Manager {

	private int mgrid;
	private String mgrname;
	private Employee  emp; // this is the dependency that Manager depends on
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(int mgrid, String mgrname, Employee emp) {
		super();
		this.mgrid = mgrid;
		this.mgrname = mgrname;
		this.emp = emp;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}
