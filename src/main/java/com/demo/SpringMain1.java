package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMain1 {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("ems-config.xml");
	
	Manager m = (Manager) ctx.getBean("m1");
	System.out.println(m.getMgrid() +" " + m.getMgrname() + m.getEmp().getEmpid()+" "+ m.getEmp().getEmpname());
	
	Distributor dis = (Distributor) ctx.getBean("dis");
	
	Manufacturer man = (Manufacturer) ctx.getBean("man");
	
	System.out.println(dis.getDid() +" id of distrib "+dis.getDname()+"has retailer"+dis.getRetailer()+" "+man.getMid()+" id of manufacturer "+man.getMname()+"has distributor "+man.getDistributor());

}
}

