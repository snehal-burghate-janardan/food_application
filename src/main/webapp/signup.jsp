<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="signup" method="post">
<fieldset style="width:23%">
<legend>***Sign Up***</legend>
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name" placeholder="enter your name"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email" placeholder="Enter your email"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" placeholder="Enter your password"></td>
</tr>
<tr>
<td>Phone:</td>
<td><input type="tel" name="phone" placeholder="Enter your Phone"></td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address" placeholder="enter your address"></td>
</tr>
<tr>
<td>Role: </td> <td><select name="role">

<option value="select">Select</option>

<option value="Staff">Staff</option>

<option value="Manager">Manager</option>

<option value="Customer">Customer</option>

</select></td>
</tr>
<tr>
<td><input type="submit" value="Signup"></td>
</tr>

</table>
</fieldset>
</form>

</body>
</html>