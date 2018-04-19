package com.cluster;
import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class TestBean  {

	public String fun() {
		System.out.println("Inside fun() ++++++++");
		return "second";
	}
}
