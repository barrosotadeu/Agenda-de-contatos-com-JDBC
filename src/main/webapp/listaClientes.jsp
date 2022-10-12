<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.tadeu.cadastro_de_clientes_jdbc.modelo.Cliente" import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de clientes</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<table>
		<thead>
			<th>ID</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Telefone</th>
			<th>Opções</th>
		</thead>
		<tbody>
			<c:forEach items="${clientes}" var="cliente">
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.nome}</td>
					<td>${cliente.CPF}</td>
					<td>${cliente.telefone}</td>
					<td><a class="botao editar" href="entrada?acao=MostraCliente&id=${cliente.id}">editar </a><a class="botao deletar" href="entrada?acao=DeletaCliente&id=${cliente.id}">deletar</a>
				</tr>
				
				
			</c:forEach>
		</tbody>
	</table>
	
	<a class="botao novo" href="entrada?acao=FormAdicionaCliente">Cadastrar</a>

</body>
</html>