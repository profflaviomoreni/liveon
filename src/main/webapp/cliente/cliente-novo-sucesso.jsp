<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="clienteModelAttr" class="br.com.fiap.live.models.ClienteModel" scope="request" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Cliente ${clienteModelAttr.idCliente} - ${clienteModelAttr.nomeCliente} cadastrado com sucesso</h1>
	<br>
	<a href="cliente-listar">Voltar para a lista de clientes</a>
	
	<br>
	<%= clienteModelAttr.getIdCliente() %><br>
	<%= clienteModelAttr.getNomeCliente() %>

</body>
</html>