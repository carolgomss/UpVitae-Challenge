<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Desempenho</title>
		<%@ include file="caminhos/imports.html" %>
		<link rel="stylesheet" href="css/desempenho.css">
	</head>
	
	<body>

		<%@ include file="caminhos/cabecalho.html" %>

<section class="introducao-interna interna_produtos">
			<div class="container300">
				<h1 id= "abertura-desempenho" data-anime="300" class="fadeInDown">Painel de Desempenho</h1>
				<p id= "para-abertura" data-anime="300" class="fadeInDown">Acompanhe sua evolução dentro da B2W</p>
			</div>
		</section>

		<section class="container produto_item fadeInDown" data-anime="300">
			<div class="grid-5 produto_icone"><img class="opacity" src="img/work_hard.jpg"></div>
			<div class="grid-5 produto_icone"><img src="img/work_hard.jpg"></div>
			<div class="grid-5 produto_icone"><img class="opacity" src="img/work_hard.jpg"></div>

			<div class="grid-11 meta_panel">
			</div>
		</section>	

		<section class="container produto_info">
			<div class="grid-16 produto_info">
				
					<div class="separa_tabelas"></div>
	
					<h3>Painel Informativo</h3>
					<!-- Trigger/Open The Modal -->
					<button id="myBtn" class="bttModal">FIQUE POR DENTRO DO PAINEL DE DESEMPENHO DA B2W</button>
	
					<!-- The Modal -->
					<div id="myModal" class="modal">
	
						<!-- Modal content -->
						<div class="modal-content">
							<span class="close">&times;</span>
							<h4>Titulo(01)</h4>
							<h6>Dados vindos do banco...</h6>
							<h4>Titulo(02)</h4>
							<h6>Dados vindos do banco...</h6>
							<h4>Titulo(03)</h4>
							<h6>Dados vindos do banco...</h6>
	

	
						</div>
	
					</div>
	
				</div>
			</div>
		</section>

		
			<section class="container produto_info">
				<!-- <div class="grid-16 produto_info"> -->
						<div class="separa_tabelas"></div>
		
						<a href="listaCadastro.jsp"><button id="atualizaCad" class="bttUpdateCad">CLIQUE AQUI PARA ATUALIZAR OU DELETAR SEU PERFIL</button></a>

		<div class="separa_tabelas"></div><br>
		<label for="form_contato" class="contatoAssociado">DÚVIDAS, RECADOS E OUTRAS COMUNICAÇÕES? UTILIZE O FORMULÁRIO DE CONTATO:</label>
			<br>
			<form action="">
				<br><label for="area">Selecione o destino da mensagem:</label>
				 <select id="area" name="cars">
				 <option value="area">Selecione</option>
				 <option value="areaAG">Área Gerencial</option>
				 <option value="areaRH">RH</option>
				 </select><br><br>

				 <label for="lname">Nome:</label><br>
				 <input type="text" id="lname" name="lname" value=""><br><br> 

				 <label for="lname">CPF:</label><br>
				 <input type="text" id="lname" name="lname" value=""><br><br> 

				 <label for="dataLimite">Data:</label><br>
				 <input type="date" id="dataLimite" name="dataLLimite"><br><br>

				 <label for="fname">Título da mensagem:</label>
				 <input type="text" id="fname" name="fname" value=""><br><br>

				 <textarea rows="8" cols="75" name="comment" form="userform">Escreva sua mensagem aqui</textarea><br><br>

				 <input class="btnMeta" type="submit" value="Enviar"><br><br>

			</form>

			<section class="margin"></section>
		    </section>

		</section>

		<section class="quebra">
		</section>

		<%@ include file="caminhos/rodape.html" %>
	</body>
</html>