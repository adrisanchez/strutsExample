<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome</title>
</head>
 
<body>
    <h2>Usuario: <s:property value="username" /></h2>
    <s:actionerror />
	<s:form action="consulta.action" method="post">
	    <s:submit method="Consulta tabla" key="label.consulta" align="center" />
	</s:form>
</body>
</html>