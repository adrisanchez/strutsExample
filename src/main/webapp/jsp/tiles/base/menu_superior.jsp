<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<nav class="navbar navbar-default menu-superior">
	<div class="container">
		
		<!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	        </button>
	    	<a class="navbar-brand" href="<s:url value='inicio.action'/>"><s:text name="example.jsp.login.leyenda1"/></a>
	     </div>
	</div>
</nav>