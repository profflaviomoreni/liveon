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
	<form action="peso-usuario-editar" method="post">
		<input type="hidden" name="idPeso" value="${peso.idPeso}">
		
		<label for="gorduraCorporal">Gordura:</label><br> 
		<input type="text" id="gorduraCorporal" name="gorduraCorporal" value="${peso.gorduraCorporal}"><br> 
		
		<label for="peso">Peso:</label><br> 
		<input type="text" id="peso" name="peso" value="${peso.peso}"><br>
		
		<label for="imc">IMC:</label><br> 
		<input type="text" id="imc" name="imc" value="${peso.imc}"><br>
		<br> 
		
		<label for="data">Data:</label><br> 
		<input type="text" id="data" name="data" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${peso.data}"/>"><br>
		<br> 
		
		<label for="Risco">Risco: ${peso.idRisco} </label><br> 
		<select>
			<option>Selecione o risco</option>
			<c:forEach items="${riscos}" var="r">
				<c:if test="${ peso.idRisco eq r.idRisco }">
					<option value="${r.idRisco}" selected>${r.nomeRisco}</option>
				</c:if>
				<c:if test="${ peso.idRisco ne r.idRisco }">
					<option value="${r.idRisco}">${r.nomeRisco}</option>
				</c:if>
			</c:forEach>
		</select>
		
		<br>
		<br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>