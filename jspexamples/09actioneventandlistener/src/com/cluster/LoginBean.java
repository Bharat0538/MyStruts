package com.cluster;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class LoginBean {

	private String name;
	private String password;

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
		return "success";
	}

	public void fun(ActionEvent ae) {
		System.out.println("Inside fun() Method******************");
		name = null;
		password = null;
	}
}
