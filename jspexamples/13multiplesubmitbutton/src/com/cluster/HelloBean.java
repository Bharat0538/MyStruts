package com.cluster;

import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean {
	
	private int num1;
	private int num2;
	private int result;
	  
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String addition() {
		 result = num1 + num2;
		return "second";
		  }
	
	public String multiplication() {
		 result = num1 * num2;
		  return "second";
	  }
	
	public String substraction() {
		 result = num1 - num2;
		  return "second";
	  }

	public String division() {
		result = num1 / num2;
		  return "second";
	  }
}
