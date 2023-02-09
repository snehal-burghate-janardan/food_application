<%@page import="java.util.ArrayList"%>
<%@page import="com.ty.foodie_application_jsp.dao.ItemsDao"%>
<%@page import="java.util.List"%>
<%@page import="com.ty.foodie_application_jsp.dto.Items"%>
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
	List<Items> list = (List) request.getAttribute("list");
	%>

<%if(list!=null) {%>
	<table border="2px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Offer</th>
			<th>Quantity</th>
			
		</tr>

		<%
		for (Items items : list) {
		%>
		<tr>
			<td><%=items.getId()%></td>
			<td><%=items.getName()%></td>
			<td><%=items.getDescription()%></td>
			<td><%=items.getPrice()%></td>
			<td><%=items.getOffer()%></td>
			<td><%=items.getQuantity()  %></td>
			
		</tr>



		<%
		}
		%>
	</table>
	<%} %>

	<br>
	<a href="displaymenulist.jsp" style="margin: 15px" ><button>Add More Items</button></a><br>
	
	<br>
	<a href="customerdetails.jsp" style="margin: 15px" ><button>Place Order</button></a><br>
	
	
	
</body>
</html>