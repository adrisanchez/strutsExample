<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
	<sx:head parseContent="true" debug="false" />
</head>

<body>
	<s:form action="test" id="test">
		<s:submit value="send" cssClass="btn btn-lg btn-primary but"/>
	</s:form>
</body>

