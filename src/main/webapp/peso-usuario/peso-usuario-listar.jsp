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
	<h1>Pesos do usuário (<b>Nome do usuário selecionado</b>)</h1>
	<br>
	<a href="#">Adicionar Peso</a>
	
	<br>
	<table border=1>
		<tr>
			<th>Data</th>    
			<th>Gordura</th>    
			<th>Peso</th>
			<th>IMC</th>
			<th>Ações</th>  
		</tr>
		
		<c:forEach items="${pesosUsuario}" var="peso"> 
			<tr>
				<td><fmt:formatDate pattern="dd/MM/yyyy" value="${peso.data}"/></td>    
				<td>${peso.gorduraCorporal}</td>    
				<td>${peso.peso}</td>  
				<td>${peso.imc}</td>  
				<td>
					<a href="peso-usuario-excluir?id=${peso.idPeso}">Excluir</a> | 
					<a href="peso-usuario-editar?id=${peso.idPeso}">Editar</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>