<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Salut</title>
</head>
<body>
	<form method="POST" enctype="multipart/form-data" action="display.do">
		<p>
			Charger le fichier XML :<br><br> 
			<input type="file"	name="file">
		</p>	
		<div>
			<input type="submit" value="Send"/>
		</div>
	</form>
</body>
</html>