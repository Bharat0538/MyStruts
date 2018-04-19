
<%@ page language="java"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>


<html:html >
  <body>
  <table border="1" width="600" cellspacing="5">
  	
  		<tr><td height="10%" bgcolor="blue" colspan="3">
  			<tiles:insert attribute="header" /></td></tr>
  		<tr>
  			<td width="40%" bgcolor="white">
  			<tiles:insert attribute="navigation" /></td>
  			<td width="80%" bgcolor="red">
  			<tiles:insert attribute="body" /></td>
  		</tr>
  		<tr>
  		<td height="10%"   bgcolor="yellow" colspan="3">
  		<tiles:insert attribute="footer" /></td></tr>
  	
  </table>
  </body>
</html:html>
