<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet"></link>
<link
	href="//oss.maxcdn.com/jquery.bootstrapvalidator/0.5.2/css/bootstrapValidator.min.css"
	rel="stylesheet"></link>

<script src="//oss.maxcdn.com/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script
	src="//oss.maxcdn.com/jquery.bootstrapvalidator/0.5.3/js/bootstrapValidator.min.js"></script>

<script type="text/javascript" src="validator.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="EliminarServlet" method="Post" class="form-horizontal mitad" id="EliminarServlet">
		<div class="form-group">
			<label class="col-lg-3 control-label">Ingrese Id</label>
			<div class="col-lg-3">
				<input type="text" class="form-control" name="id" required> <br>
			</div>
		</div>

		<input type="submit" value="Enviar">
	</form>
</body>
</html>