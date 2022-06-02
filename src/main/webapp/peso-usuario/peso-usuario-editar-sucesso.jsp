<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de pesos do usuario</title>
</head>
<body>
	
	<h2>Peso editado com sucesso</h2>
	<br>
		
	<label for="gorduraCorporal">Gordura: ${peso.gorduraCorporal}</label><br> 
	
	<label for="peso">Peso: ${peso.peso}</label><br> 
	
	<label for="imc">IMC: ${peso.imc}</label><br> 
	
	<label for="data">Data: <fmt:formatDate pattern="dd/MM/yyyy" value="${peso.data}"/></label><br> 

	<br>
	<br>
	<a href="peso-usuario-listar">Voltar para a lista de clientes</a>
		
</body>
</html>