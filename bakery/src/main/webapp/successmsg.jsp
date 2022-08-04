<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.success{
text-align: center;
}
h1{
text-align: center;
}
</style>
</head>
<body class="success">

	<h1>${msg}</h1>
	Item Name: ${data.itemName} 
	<br> <br>
	Item Price:${data.itemPrice} 
	<br> <br>
	Item Qty:${data.itemQty} 
	<br> <br>
	Vendor:${data.vendor} 
	<br> <br>
	veg:${data.veg }
	<br> <br>
	Total Price:${data.itemPrice*data.itemQty}

</body>
</html>