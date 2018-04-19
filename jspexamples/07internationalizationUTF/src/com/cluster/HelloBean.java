package com.cluster;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
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
	
	public void changeToEnglish(ActionEvent ae)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		UIViewRoot root = fc.getViewRoot();
		Locale loc = root.getLocale();
		System.out.println("Value of locale is.... " + loc);
		Locale eng = new Locale("en");
		fc.getViewRoot().setLocale(eng);
	}
	
	public void changeToKannada(ActionEvent ae)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		UIViewRoot root = fc.getViewRoot();
		Locale loc = root.getLocale();
		System.out.println("Value of locale is.... " + loc);
		Locale kan = new Locale("kn");
		fc.getViewRoot().setLocale(kan);
	}
	
	public void changeToHindi(ActionEvent ae)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		UIViewRoot root = fc.getViewRoot();
		Locale loc = root.getLocale();
		System.out.println("Value of locale is.... " + loc);
		Locale hin = new Locale("hi");
		fc.getViewRoot().setLocale(hin);
	}
	
	public void changeToTelugu(ActionEvent ae)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		UIViewRoot root = fc.getViewRoot();
		Locale loc = root.getLocale();
		System.out.println("Value of locale is.... " + loc);
		Locale tel = new Locale("te");
		fc.getViewRoot().setLocale(tel);
	}
	
	public String checkUser()
	{
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
