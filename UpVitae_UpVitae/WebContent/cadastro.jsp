<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	 	<title>Cadastrar Meta</title>
	 	<%@ include file="header.jsp" %>
	 	<%@ include file="caminhos/imports.html" %>
	 	<link rel="stylesheet" href="css/cadastro.css">
	</head>
	<body>
	
	 <%@ include file="caminhos/cabecalho.html" %>

	<div>
	<h2>${param.msg}</h2>
</div>
	 
		<section class="cadastro-intro">
		<div class="container">
		
			<form action="metasExemplo" method="post">
				 <input type="hidden" name="acao" value="cadastrar">
			
				<h1>Metas</h1><br />
				
				<div class="campo">	
				<label for="name">Nome</label>
				<input type="text" name="name" id="name" placeholder="Nome da meta" required="required">
				</div>
				
				<div class="campo">	
				<label for="descricao">Nome</label>
				<input type="text" name="descricao" id="descricao" placeholder="Descrição da meta" required="required">
				</div>
				
				<div class="campo">	
				<label for="pontuacao">Pontuação</label>
				<input type="text" name="pontuacao" id="pontuacao" placeholder="Pontuação" required="required">
				</div>
				
				<div class="campo">  
				<button type="submit">Cadastrar</button>
				</div>
			</form>

			<div class="box-chatbot">
				<h3>Quer fazer seu cadastro de maneira mais simples e dinamica?</h3>
				<h3>Faça o seu cadastro através do nosso ChatBot!</h3>
				<div class="imagem-chatbot">
					<a href="chatbot.html" ><img src="img/chatbot.png" alt="Chatbot"></a>
				</div>
			</div>
		</div>
</section>

	<%@ include file="caminhos/rodape.html" %>
	
	</body>
</html>
