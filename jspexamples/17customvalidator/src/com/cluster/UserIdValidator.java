package com.cluster;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@FacesValidator(value = "uidValidator")
public class UserIdValidator implements Validator {

	@Override
	public void validate(FacesContext fc, UIComponent uic, Object obj)
			throws ValidatorException {

		System.out.println("inside userid  validator");

		String strId = (String) obj;
		
		
		if (!strId.startsWith("CLS-"))
		{
		FacesMessage fm = 	new FacesMessage();
		// this error message is displayed in the view
		fm.setDetail("USER ID SHOULD BE IN THE FORMAT CLS-1234"); 
		fm.setSeverity(FacesMessage.SEVERITY_ERROR);
		throw new ValidatorException(fm);
		}
	}
}
