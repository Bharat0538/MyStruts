package com.cluster;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
@RequestScoped
//@SessionScoped
//@ApplicationScoped
//@NoneScoped
public class HelloBean {

	private String name;
	private String password;

	static {
		System.out.println("Inside HelloBean static block ++++++");
	}

	{
		System.out.println("Inside HelloBean instance block ++++++");
	}

	public HelloBean() {
		System.out.println("Inside HelloBean constructor ++++++");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Inside HelloBean @PostConstruct method ++++++");
	}

	@PreDestroy
	public void myClear() {
		System.out.println("Inside HelloBean @PreDestroy method ++++++");
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
