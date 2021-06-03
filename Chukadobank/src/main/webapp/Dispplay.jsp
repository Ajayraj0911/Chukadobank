<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%  
	CustomerBean customerBean = (CustomerBean) session.getAttribute("customerBean"); %>
	
	<%=customerBean.getBalance() %>
	
</body>
</html>