<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Youpi \o/</title>
</head>
<body>
	${concessionnaire.raisonSociale}
	<br>
	${concessionnaire.adresse}
	<br>
	${concessionnaire.mail}
	<br>
	${concessionnaire.siren}
	<br>
	${concessionnaire.type}
	<br>
	<c:forEach var="vehicule" items="${vehicules}">
		<br>
		Véhicule :
		<br>
		${vehicule.marque}
		<br>
		${vehicule.modele}
		<br>
		${vehicule.couleur}
		<br>
		${vehicule.nbPortes}
		<br>
		${vehicule.nbPlaces}
		<br>
		${vehicule.options}
		<br>
		${vehicule.motorisation}
		<br>
		${vehicule.emissionCO2}
		<br>
		${vehicule.imageURL}
		<br>
		${vehicule.prix}
		<br>
		${vehicule.immatriculation}
		<br>
	</c:forEach>
</body>
</html>