<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	 	<title>Cadastro</title>
	 	<%@ include file="header.jsp" %>
	 	<%@ include file="caminhos/imports.html" %>
	 	<link rel="stylesheet" href="css/cadastro.css">
	</head>
	<body>
	
	 <%@ include file="caminhos/cabecalho.html" %>

	<div>
	<h2>${param.msgStatus}</h2>
</div>
	 
		<section class="cadastro-intro">
		<div class="container">
		
				
	
		
			<label for="cadastro"><h1 data-anime="0" class="fadeInDown">Cadastro</h1></label><br><br>
			
			<form action="cadassociadoServlet" method="post">
       		<input type="hidden" name="acao" value="cadastrar">
       		

			
			<div class="campo">	
			<label for="idAr">Área de atuação</label>
			<input type="text" name="areaCad" id="idAr" placeholder="Digite sua área" required="required">
			</div>
			
			<div class="campo">	
			<label for="idNome">Nome</label>
			<input type="text" name="nomeCad" id="idNome" placeholder="Digite seu nome" required="required">
			</div>
			
			<div class="campo">	
			<label for="idCpf">CPF</label>
			<input type="text" name="cpfCad" id="idCpf" placeholder="Digite seu CPF" required="required">
			</div>
			
			
			<div class="campo">	
			<label for="idNasc">Data de nascimento</label>
			<input type="text" name="nascCad" id="idNasc" placeholder="Digite sua data de nascimento" required="required">
			</div>
			
			
			<div class="campo">	
			<label for="idEmail">e-mail</label>
			<input type="text" name="emailCad" id="idEmail" placeholder="Digite seu e-mail" required="required">
			</div>
			
			
			<div class="campo">	
			<label for="idTel">Telefone</label>
			<input type="tel" name="telefone" id="idTel" placeholder="(xx) xxxxxx-xxxx" required="required" pattern="\(?[0-9]{2}\)? ?[0-9]{4,6}-?[0-9]{3,4}$">
			</div>
			
			
			<div class="campo">	
			<label for="idSenha">Senha</label>
			<input type="text" name="senhaCad" id="idSenha" placeholder="Digite sua senha" required="required">
			</div>
			
			
			<div class="campo">	
			<label for="idValida">Repita a senha</label>
			<input type="text" name="validaCad" id="idValida" placeholder="Digite sua senhas" required="required">
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
