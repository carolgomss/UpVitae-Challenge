<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Área Gerencial</title>
		<link rel="stylesheet" href="css/recompensas.css">
		<%@ include file="caminhos/imports-2.html" %>
	</head>
	<body>
	<%@ include file="caminhos/cabecalho.html" %>

		<section class="introducao-interna interna_portfolio">
			<div class="container">
				<h1 id= "recompensas" data-anime="300" class="fadeInDown">Área Gerencial</h1>
				<p id= "para-recompensas" data-anime="300" class="fadeInDown">aqui você pode alterar ou deletar metas e benefícios</p>
			</div>
		</section>

		
		<section class="container produto_info">
			<div class="grid-16 produto_info">
				<div class="content">
					<div class="separa_tabelas"></div>
	
					<h3>Relatórios de Recompensas (Painel-1)</h3>
					<!-- Trigger/Open The Modal -->
					<button id="myBtn" class="bttModal">MÉDIA DAS RECOMPENSAS RECEBIDAS / PERÍODO DE CONTRATAÇÃO</button>
	
					<!-- The Modal -->
					<div id="myModal" class="modal">
	
						<!-- Modal content -->
						<div class="modal-content">
							<span class="close">&times;</span>
							<h4>TÃ­tulo(01)</h4>
							<h6>Dados vindos do banco...</h6>
							<h4>TÃ­tulo(02)</h4>
							<h6>Dados vindos do banco...</h6>
							<h4>TÃ­tulo(03)</h4>
							<h6>Dados vindos do banco...</h6>
	
	
						</div>
			
					</div>
					<div class="separa_tabelas"></div>
				</div>
			</div>
		</section>

		

		

	<%@ include file="caminhos/rodape.html" %>

	</body>
</html>