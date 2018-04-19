package com.cluster;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@ManagedBean
public class HelloBean  {

	private static Map<String, Object> countries;

	public HelloBean() {
		System.out.println("Inside TestBean constructor +++++++++");
	}

	static {
		System.out.println("Inside static block++++++++++");
		countries = new LinkedHashMap<String, Object>();
		countries.put("English", Locale.ENGLISH); // label, value
		countries.put("Chinese", Locale.SIMPLIFIED_CHINESE);
		countries.put("Kannada", new Locale("kn", "IN"));
		countries.put("Hindi", new Locale("hi", "IN"));
	}

	
	public  Map<String, Object> getCountries() {
		return countries;
	}
	
	public String fun() {
		return "second";
	}

	public void changeCountryLocale(ValueChangeEvent vc) {

		System.out.println("Inside changeCountryLocale() +++++++++");

		String localeCode = vc.getNewValue().toString();
		
		// iterate and set the selected locale into the ViewRoot
		Collection col  = countries.values();
		for (Object obj : col) 
		{
				if (obj.toString().equals(localeCode)) 
				{
					FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)obj);
				}
		}
		
	}
}
