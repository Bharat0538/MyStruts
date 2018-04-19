package com.cluster;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {
	private String name;
	private String email;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String display()
	{
		FacesContext fc = FacesContext.getCurrentInstance();

		// setting attributes in different servlet scopes
		HttpServletRequest req = (HttpServletRequest) fc.getExternalContext().getRequest();
		req.setAttribute("NAME", name);

		HttpSession ses = (HttpSession) fc.getExternalContext().getSession(true);
		ses.setAttribute("EMAIL", email);

		ServletContext ctx = (ServletContext) fc.getExternalContext().getContext();
		ctx.setAttribute("PHONE", phone);
		
		return "second";
	}
	

}
