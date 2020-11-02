<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
	 	<title>Login</title>
	 	<%@ include file="caminhos/imports.html" %>
	 	<link rel="stylesheet" href="css/login.css">
	</head>
	<body>

 		<%@ include file="caminhos/cabecalho.html" %>

		<section class="introducao">
			<div class="container">
				<h1 data-anime="000" class="fadeInDown">Login</h1>
        <form action="">

              <div class="input">
                <input required type="text" />
                <label>CPF</label>
                <span class="error"></span>
              </div>


              <div class="input">
                <input required type="password" />
                <label>Senha</label>
                <span class="error"></span>
              </div>

              <button type="submit">Enviar</button>
              <h5 >Ainda não é cadastrado <a data-anime="000" href="cadastro.html">Cadastre-se</a> </h5>

          </form>
			</div>
		</section>
	<%@ include file="caminhos/rodape.html" %>
	</body>
</html>
