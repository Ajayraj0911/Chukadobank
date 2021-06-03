<%@page import="java.util.List"%>
<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<CustomerBean> transaction = (List) request.getAttribute("transactionList");
%>
	<table style="border: 10px;">
		<tr>
			<td>Date</td>
			<td>Amount</td>
			<td>Transaction Id</td>
		</tr>
		<%
			for (int i = 0; i < transaction.size(); i++) {
				CustomerBean CustomerBean = transaction.get(i);
			%>
			<tr>
				<td><%=CustomerBean.getDate() %></td>
				<td><%=CustomerBean.getAmount() %></td>
				<td><%=CustomerBean.getTid() %></td>

			</tr>
			<%
			}
			%>
	
	</table>
</body>
</html>