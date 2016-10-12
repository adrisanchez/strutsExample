<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- CABECERA WEB-->
<nav class="navbar navbar-default">
	<div class="container">

       <div class="row">
     		<div class="col-lg-8 col-md-6 col-sm-6 col-xs-12 navbar-header">
   			</div> 

            <ul class="col-lg-3 col-md-4 col-sm-4 col-xs-10 nombre">
            </ul>

            <div class="col-lg-1 col-md-2 col-sm-2 col-xs-2"><a href="<s:url value="/j_spring_security_logout"/>">
            	<div class="glyphicon glyphicon-remove-circle icon-white"></div></a>
            </div>
            
    	</div>
  	</div>
</nav>
<!-- FIN CABECERA WEB-->