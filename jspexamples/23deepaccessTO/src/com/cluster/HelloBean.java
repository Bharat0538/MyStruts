package com.cluster;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {

	private UserTO userTO;

	@PostConstruct
	public void init() {
		userTO = new UserTO(); // instantiate and initialize the TO
	}

	public UserTO getUserTO() {
		return userTO;
	}

	public void setUserTO(UserTO userTO) {
		this.userTO = userTO;
	}

	public String checkUser() {
		String str = null;
		if ((userTO.getName().equalsIgnoreCase("ravi") && (userTO.getPassword()
				.equalsIgnoreCase("cluster")))) {
			str = "success";
			return str;
		} else {
			str = "failure";
			return str;
		}
	}
}
