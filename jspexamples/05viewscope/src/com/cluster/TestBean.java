package com.cluster;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
@ViewScoped
public class TestBean {

	private ArrayList<String> employees;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getEmployees() {
		return employees;
	}
	
	@PostConstruct
	public void create() {
		System.out.println("Inside @PostConstruct ++++++++++++");
		employees = new ArrayList<String>();
		employees.add("AAA");
		employees.add("BBB");
		employees.add("CCC");
		employees.add("DDD");
		employees.add("EEE");
		employees.add("FFF");
		employees.add("GGG");
		employees.add("HHH");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Inside @PreDestroy ++++++++++++");
	}

	public String deleteEmployee() {
		System.out.println("Value getting deleted is ++++++++++++" + name);
		employees.remove(name);
		return null;
	}
}
