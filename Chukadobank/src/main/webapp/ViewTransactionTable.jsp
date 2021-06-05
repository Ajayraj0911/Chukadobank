<%@page import="java.util.List"%>
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
	List<CustomerBean> transaction = (List) session.getAttribute("transactionList");
%>
	
	<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Date</th>
      <th scope="col">Transaction ID</th>
      <th scope="col">Amount</th>
      
    </tr>
  </thead>
  <tbody>
   
		<%
			for (int i = 0; i < transaction.size(); i++) {
				CustomerBean CustomerBean = transaction.get(i);
			%>
			<tr>
				<td><%=CustomerBean.getDate() %></td>
				<td><%=CustomerBean.getTid() %></td>
				<th scope="row"><%=CustomerBean.getAmount() %></th>

			</tr>
			<%
			}
			%>
  </tbody>
</table>
	</table>
</body>
</html>