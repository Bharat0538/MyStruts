package com.cluster;

import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {

	private int userId;
	private String name;
	private PhoneTO phoneTO;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PhoneTO getPhoneTO() {
		return phoneTO;
	}

	public void setPhoneTO(PhoneTO phoneTO) {
		this.phoneTO = phoneTO;
	}

	public String display() {
		return "second";
	}
}
