package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.SearchForm;

public class SearchAction extends Action 
{
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
		SearchForm searchform = (SearchForm) pForm;
		String strSid = searchform.getSid();

		String strName = "ravi";
		String strEmail = "ravi@gmail.com";
		String strPhone = "9999999999";

		if (strSid.equals("CLS-B15-9999")) {
			pRequest.setAttribute("a", strName);
			pRequest.setAttribute("b", strEmail);
			pRequest.setAttribute("c", strPhone);

			return pMapping.findForward("success");
		} else {
			String strMsg = "student not found";
			pRequest.setAttribute("MSG", strMsg);

			return pMapping.findForward("failure");

		}
	}
}
