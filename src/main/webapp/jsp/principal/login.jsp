<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">

    <div class="login">

        <h1><s:text name="example.jsp.login.leyenda1"/></h1>
        <h4><s:text name="example.jsp.login.leyenda2"/></h4>

        <div class="row">

        <div class="col-md-4"></div>

        <div class="col-md-4 container-login">

            <img src="<s:url value="/img/login.png"/>"/>

			<form class="form-signin" action="<s:url value="j_spring_security_check"/>" method="POST">

                <label for="inputText" class="sr-only"><s:text name="example.jsp.login.usuario"/></label>
                    <input type="text" id="j_username" name="j_username" class="form-control" placeholder="<s:text name="example.jsp.login.usuario"/>" required="required" autofocus="autofocus">
                <label for="inputPassword" class="sr-only"><s:text name="example.jsp.login.contrasena"/></label>
                    <input type="password" id="j_password" name="j_password" class="form-control" placeholder="<s:text name="example.jsp.login.contrasena"/>" required="required">
            
                <button class="btn btn-lg btn-primary btn-block" type="submit"><s:text name="example.jsp.login.iniciarsesion"/></button>
            </form>


        </div>

        <div class="col-md-4"></div>
        
        </div>

        <h4><s:text name="example.jsp.login.leyenda3" /></h4>
    

    </div>
   
</div>