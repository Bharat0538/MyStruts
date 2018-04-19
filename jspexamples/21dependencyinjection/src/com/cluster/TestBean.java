package com.cluster;

import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class TestBean {

	public TestBean() {
		System.out.println("Inside TestBean constructor +++++++++");
	}

	public void m1() {
		System.out.println("Inside m1() of TestBean +++++++++");
	}
}
