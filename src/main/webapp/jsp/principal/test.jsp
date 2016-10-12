<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>

	<head>
		<sx:head parseContent="true" debug="false" />
	</head>
	
	<body>
		<s:if
			test="(firstObject.sObject.property == 1)"><%-- && 
		(peticion.tEstadoPeticion.codEstadoPeticion == 56 || peticion.tEstadoPeticion.codEstadoPeticion == 57) &&
		(estadoDominio == 5 || activoManual == 1)"> --%>
			All it's ok
			<s:label name="propertyFunction" />
			<s:label name="firstObject.sObject.property" />
		</s:if>
		<s:else>
			Something wrong
			<s:label name="propertyFunction" />
		</s:else>
	</body>
	
</html>