<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trnsaction History</title>
<style>
input[type=button], input[type=submit], input[type=reset] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

</style>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div align="center"><h4>
	<form action="TransactionController">
		From: <input type="date" name="from">&nbsp;&nbsp;&nbsp;
		To: <input type="date" name="to"><br><br></h4>
		<input type="submit" value="View Transaction">	
	
	</form></div>
	<br>
	<%@ include file="ViewTransactionTable.jsp" %>
</body>
</html>