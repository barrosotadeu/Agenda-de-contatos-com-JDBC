<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente" import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar dados do cliente</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<form action="entrada" method="post">
	<label for="nome">Informe o nome do cliente</label>
		
		<input type="hidden" name="id" value="${cliente.id}">
		
		<input type="text" id="nome" name="nome" value="${cliente.nome}">
		
		<label for="cpf">Informe o cpf do cliente</label>
		<input type="text" id="cpf" name="cpf" value="${cliente.CPF}">
		
		<label for="telefone">Informe o numero de telefone do cliente</label>
		<input type="text" id="telefone" name="telefone" value="${cliente.telefone}">
		
		<input type="hidden" name="acao" value="AlteraCliente">
		<button type="submit" class="botao novo">Cadastrar</button>
		
	</form>
	

</body>
</html>