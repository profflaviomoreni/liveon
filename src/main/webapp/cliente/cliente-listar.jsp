<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cliente</h1>
	<br>
	<a href="cliente-novo">Novo Cliente</a>
	
	<br>
	<table>
		<tr>
			<th>Id</th>    
			<th>Nome</th>    
			<th>Email</th>
			<th>Ações</th>  
		</tr>
		
		<c:forEach items="${listaClientes}" var="cliente"> 
			<tr>
				<td>${cliente.idCliente}#</td>    
				<td>${cliente.nomeCliente}</td>    
				<td>${cliente.emailCliente}</td>  
				<td><a href="cliente-excluir?id=${cliente.idCliente}">Excluir</a></td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>