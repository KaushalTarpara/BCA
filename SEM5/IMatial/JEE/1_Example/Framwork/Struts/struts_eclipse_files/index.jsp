<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<s:form action="product">
	<s:label>Struts Demo</s:label>
	<s:textfield name="id" label="Product Id"></s:textfield>
	<s:textfield name="name" label="Product Name"></s:textfield>
	<s:textfield name="price" label="Product Price"></s:textfield>
	<s:submit value="save">	</s:submit>	
</s:form>