package com.cluster;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean(name="hb")
@RequestScoped
public class HelloBean {

	private String name;
	private String password;
	private double salary;
	
	public double getSalary() {
		System.out.println("Inside getSalary....");
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Inside setSalary....");
		this.salary = salary;
	}

	public HelloBean()
	{
		System.out.println("Inside constructor....");
	}

	public String getName() {
		System.out.println("Inside getName....");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName....");
		this.name = name;
	}

	public String getPassword() {
		System.out.println("Inside getPassword....");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Inside setPassword....");
		this.password = password;
	}

	public String checkUser() {
		String str = null;
		if (name.equalsIgnoreCase("ravi")&& password.equalsIgnoreCase("cluster")) 
		{
			str = "success";
			return str;
		} 
		else 
		{
			str = "failure";
			return str;
		}
	}
}
