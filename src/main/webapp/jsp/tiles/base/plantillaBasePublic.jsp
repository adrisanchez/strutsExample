<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html class="no-js" lang="ES">
	
	<head>
		<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><s:text name="example.jsp.general.titulo"/></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="apple-touch-icon" href="<s:url value="/img/apple-touch-icon.png"/>">
		<link href="<s:url value="/css/normalize.css"/>" rel="stylesheet" type="text/css">
		<link href="<s:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
		<link rel= "stylesheet"  href= "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" >
		<link href="<s:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
		<link href="<s:url value="/css/forms.css"/>" rel="stylesheet" type="text/css">
		<link href='http://fonts.googleapis.com/css?family=Roboto:500,100,300,700,400' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
		<script type="text/javascript" src="<s:url value="/js/vendor/modernizr-2.8.3.min.js"/>"></script>
		<link rel="shortcut icon" href="<s:url value="/img/favicon.ico"/>" type="image/x-icon" />
		
		<script src="<s:url value="/js/vendor/jquery-1.11.2.js"/>"></script>
		<script src="<s:url value="/js/plugins.js"/>"></script>
		<script src="<s:url value="/js/main.js"/>"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="<s:url value="/js/jquery.jmesa.js"/>"></script>
        <script type="text/javascript" src="<s:url value="/js/jmesa.js"/>"></script>
        <script type="text/javascript" src="<s:url value="/js/general.js"/>"></script>
		
	</head>
	<body>
	
		<tiles:insertAttribute name="cabeceraPublic"/>
		
		<jsp:include page="/jsp/tiles/base/status.jsp"/>
		<tiles:insertAttribute name="contenido"/>
		
		<tiles:insertAttribute name="footer"/>
		
	</body>
</html>