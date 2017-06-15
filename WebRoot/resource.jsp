<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:directive.page import="org.springframework.web.context.support.ServletContextResource"/>
<jsp:directive.page import="org.springframework.core.io.Resource"/>
<jsp:directive.page import="org.springframework.web.util.WebUtils"/>
<%
	Resource res3 = new ServletContextResource(application,"/WEB-INF/classes/conf/file1.txt");
	out.print(res3.getFilename() + "<br>");
	out.print(WebUtils.getTempDir(application).getAbsolutePath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'resource.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	This is my JSP page.
	<br>
</body>
</html>
