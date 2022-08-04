<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cake Of The Day</title>
<style type="text/css">
.bake{
text-align: center;
}
h1{
text-align: center;
}
</style>

</head>
<body class="bake">

<h1>Cake Of The Day Menu</h1>

	<form action="save.do" method="post">
		Item Name <input type="text" name="itemName"> <br> <br>
		Item Price <input type="number" name="itemPrice"> <br> <br>
		Item Quantity <input type="number" name="itemQty"> <br> <br>
		Vendor <input type="text" name="vendor"> <br> <br>
		Veg <input type="checkbox" name="veg"> <br> <br>
		<input type="submit">
	</form>

</body>
</html>