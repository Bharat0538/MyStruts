package com.cluster;

import java.util.ArrayList;
import java.util.Arrays;
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
public class HelloBean {

	private int userId;
	private String name;
	private boolean rememberMe; // will store true value if check box is selected 
	private List<String> technologies; // will store multiple values which was selected in check box 
	private String[] languages; // will store multiple values which was selected in check box 
	private String coffee; // will store selected single value from drop down 
	private String gender; // will store value from selected radio button
	private String address; // will store text entered in text area box

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

	
	private static List<Object> technologyDisplay;

	static 
	{
		technologyDisplay = new ArrayList<Object>();
		technologyDisplay.add("Servlet");
		technologyDisplay.add("JSP");
		technologyDisplay.add("JSF");
		technologyDisplay.add("Hibernate");
		technologyDisplay.add("Spring");
		technologyDisplay.add("JDBC");
	}

	// multiple check boxes will be displayed with values which are stored in List (in first.xhtml)
	public List<Object> getTechnologyDisplay() {
		return technologyDisplay;
	}


	private static Map<String, Object> languageDisplay;

	static {
		languageDisplay = new LinkedHashMap<String, Object>();
		languageDisplay.put("Kannada", "kannada"); // key, value
		languageDisplay.put("English", "english");
		languageDisplay.put("Hindi", "hindi");
		languageDisplay.put("Telugu", "telugu");
		languageDisplay.put("Tamil", "tamil");
		languageDisplay.put("Marathi", "marathi");
	}

	// multiple check boxes will be displayed with languages which are stored in Map (in first.xhtml)
	public Map<String, Object> getLanguageDisplay() {
		return languageDisplay;
	}

	// will be used for displaying selected languages which is stored in array (in second.xhtml)
	public String getLanguagesInString() {
		return Arrays.toString(languages);
	}
	
	
	private static Map<String, Object> coffeeDisplay;
	static {
		coffeeDisplay = new LinkedHashMap<String, Object>();
		coffeeDisplay.put("Coffee - Cream Latte", "Cream Latte"); // key, value
		coffeeDisplay.put("Coffee - Extreme Mocha", "Extreme Mocha");
		coffeeDisplay.put("Coffee - Buena Vista", "Buena Vista");
		coffeeDisplay.put("Coffee - Espresso", "Espresso");
	}

	// drop down will be displayed with coffee items which are stored in Map (in first.xhtml)
	public Map<String, Object> getCoffeeDisplay() {
		return coffeeDisplay;
	}

	public String display() {
		return "second";
	}

}
