package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloBean {

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
		String str = null;
		System.out.println("UUUUUUUUUUUU"+name);
		System.out.println("@@@@@@@@@@"+password);
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
