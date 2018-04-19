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

	@ManagedProperty("#{userTO}")
	UserTO user;

	public UserTO getUser() {
		return user;
	}

	public void setUser(UserTO user) {
		this.user = user;
	}

	public String checkUser() {
		String str = null;
		if ((user.getName().equalsIgnoreCase("ravi") && (user.getPassword()
				.equalsIgnoreCase("cluster")))) {
			str = "success";
			return str;
		} else {
			str = "failure";
			return str;

		}
	}
}
