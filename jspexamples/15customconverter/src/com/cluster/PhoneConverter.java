package com.cluster;

import java.util.StringTokenizer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

//@FacesConverter(value="com.cluster.PhoneConverter")
@FacesConverter(value = "phConverter")
public class PhoneConverter implements Converter {
	
	// this method is invoked during the APPLY REQUEST VALUES PHASE
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		System.out.println("Inside getAsObject() +++++++++++++++++");

		if (value == null || (value.trim().length() == 0)) {
			return value;
		}

		else {
			PhoneTO pto = new PhoneTO();
			boolean conversionError = false;

			int hyphenCount = 0;
			StringTokenizer st = new StringTokenizer(value, "-");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				try {
					if (hyphenCount == 0)
						pto.setCountryCode(Integer.parseInt(token));
					if (hyphenCount == 1)
						pto.setAreaCode(Integer.parseInt(token));
					if (hyphenCount == 2)
						pto.setPhoneNumber(Long.parseLong(token));
					hyphenCount++;
				} catch (Exception exception) {
					conversionError = true;
				}
			}

			if (conversionError || (hyphenCount != 3)) {
				throw new ConverterException();
			}

			return pto;
		}
	}

	// this method is invoked during the RENDER RESPONSE PHASE
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		
		System.out.println("Inside getAsString() +++++++++++++++++");

		String strPhone = "";

		if (value instanceof PhoneTO) {
			PhoneTO phone = (PhoneTO) value;

			StringBuilder phoneNumberAsString = new StringBuilder();
			phoneNumberAsString.append(phone.getCountryCode() + "-");
			phoneNumberAsString.append(phone.getAreaCode() + "-");
			phoneNumberAsString.append(phone.getPhoneNumber());
			strPhone = phoneNumberAsString.toString();
			return strPhone;
		}

		else {
			return strPhone;
		}

	}
}