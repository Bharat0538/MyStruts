package com.cluster;

import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {

	@ManagedProperty("#{msg}")
	private ResourceBundle rb;

	private String name;
	private String password;

	public ResourceBundle getRb() {
		return rb;
	}

	public void setRb(ResourceBundle rb) {
		this.rb = rb;
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
		if ((name.equalsIgnoreCase(rb.getString("USERNAME")) && (password
				.equalsIgnoreCase(rb.getString("USERPWD"))))) {
			str = "success";
			return str;
		} else {
			str = "failure";
			return str;

		}
	}
}
