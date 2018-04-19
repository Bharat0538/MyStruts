package com.cluster;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {
	
	private String name;
	private String password;
	
	@ManagedProperty(value="#{testBean}") // value attribute is mandatory 
	private TestBean test = null;
	
	public HelloBean() {
		System.out.println("Inside HelloBean constructor *******");
	}
	
	public TestBean getTest() {
		System.out.println("Inside HelloBean getTest() *******");
		return test;
	}

	public void setTest(TestBean test) {
		System.out.println("Inside HelloBean setTest() *******");
		this.test = test;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String checkUser()
	{
	System.out.println("Inside checkUser()******* of HelloBean");
	test.m1();
	String str = null;
	if((name.equalsIgnoreCase("ravi") && (password.equalsIgnoreCase("cluster"))))
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
