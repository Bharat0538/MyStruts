package com.cluster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean  {

	private int userId;
	private String name;
	private String password;
	private Date dob;
	private String email;
	private String phone;
	private double salary;
	private boolean rememberMe; 
	private List<String> technologies; 
	private String[] languages; 
	private String coffee; 
	private String gender;  
	private String address;
	private long zipcode;
	
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}


	private static List<Object> technologyDisplay;
	
	static
	{
		technologyDisplay = new ArrayList<Object>();
		technologyDisplay.add("Servlet");
		technologyDisplay.add("JSP");
		technologyDisplay.add("JSF");
		technologyDisplay.add("Hibernate");
		technologyDisplay.add("Spring");
	}

	public List<Object> getTechnologyDisplay() {

		return technologyDisplay;
	}

	private static Map<String, Object> languageDisplay;

	static {
		languageDisplay = new LinkedHashMap<String, Object>();
		languageDisplay.put("Kannada", "kannada"); // label, value
		languageDisplay.put("English", "english");
		languageDisplay.put("Hindi", "hindi");
		languageDisplay.put("Telugu", "telugu");
		languageDisplay.put("Tamil", "tamil");
	}

	public Map<String, Object> getLanguageDisplay() {
		return languageDisplay;
	}

	public String getLanguageDisplayInString() {
		return Arrays.toString(languages);
	}


	private static Map<String, Object> coffeeDisplay;
	static {
		coffeeDisplay = new LinkedHashMap<String, Object>();
		coffeeDisplay.put("Coffee - Cream Latte", "Cream Latte"); // label, value
		coffeeDisplay.put("Coffee - Extreme Mocha", "Extreme Mocha");
		coffeeDisplay.put("Coffee - Buena Vista", "Buena Vista");
	}

	public Map<String, Object> getCoffeeDisplay() {
		return coffeeDisplay;
	}
	
	public String display() {
		return "second";
	}

}
