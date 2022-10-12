<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Tabela de Contatos</title>
</head>
<body>
	<form action="entrada" method="POST">
	
		<label for="nome">Informe o nome do cliente</label>
		<input type="text" id="nome" name="nome" placeholder="nome do cliente">
		
		<label for="cpf">Informe o cpf do cliente</label>
		<input type="text" id="cpf" name="cpf" placeholder="cpf do cliente">
		
		<label for="telefone">Informe o numero de telefone do cliente</label>
		<input type="text" id="telefone" name="telefone" placeholder="telefone do cliente">
		
		<input type="hidden" name="acao" value="CadastraCliente">
		<button type="submit" class="btn btn-primary">Cadastrar</button>
		
	</form>

</body>
</html>