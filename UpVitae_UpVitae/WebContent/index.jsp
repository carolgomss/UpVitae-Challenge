<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
	 	<title>Up Vitae</title>
	 	<%@ include file="caminhos/imports.html" %>
	</head>
	<body>

		<%@ include file="caminhos/cabecalho.html" %>

		<section class="introducao">
			<div class="container">
				<h1 data-anime="100" class="fadeInDown">O Desenvolvimento Começa Aqui</h1>
				<blockquote data-anime="700" class="fadeInDown quote-externo">
					<p>EMBARQUE NESSA JORNADA RUMO AO SUCESSO</p>
				</blockquote>
				<a data-anime="900" href="cadastro.jsp" class="btn">Cadastre-se</a>
			</div>
		</section>
		
		<section class="produtos container fadeInDown" data-anime="300">
			<h2 class="subtitulo">Desempenho</h2>
			<ul class="produtos_lista">

				<li class="grid-1-3">
					<a href="desempenho.jsp"><div class="produtos_icone">
						<img src="img/icon/efficiency.svg" alt="Metas">
					</div>
					<h3>Metas</h3>
					<p>aqui você encontra informações sobre suas metas e desempenho</p>
				</li></a>

				<li class="grid-1-3">
					<a href="recompensas.jsp"><div class="produtos_icone">
						<img src="img/icon/podium.svg" alt="Recompensas">
					</div>
					<h3>Recompensas</h3>
					<p>acompanhe seu progresso, gerencie suas bonificações</p>
				</li></a>

				<li class="grid-1-3">
					<a href="desempenho.jsp"><div class="produtos_icone">
						<img src="img/icon/team.svg" alt="Colaboracao">
					</div></a>
					<h3>Colaboração</h3>
					<p> depois compartilhe suas ideias com equipe gestores e RH</p>
				</li>

			</ul>

			<div class="call">
				<p>clique aqui e veja os detalhes da área de Desempenho</p>
				<a href="desempenho.jsp" class="btn btn-preto">Desempenho</a>
			</div>
		</section>

		<!-- Fecha Produtos -->

		<section class="portfolio">
			<div class="container">
				<h2 class="subtitulo">Reconhecimento e Propósito</h2>
				<ul class="portfolio_lista">
					<li class="grid-8"><img src="img/portfolio/team1.jpg" alt="Equipe"></li>
					<li class="grid-8"><img src="img/portfolio/work1.jpg" alt="Home-Office"></li>
					<li class="grid-16"><img src="img/portfolio/biblioteca (2).jpg" alt="EstaÃ§Ã£o-De-Trabalho"></li>
				</ul>
				<div class="call">
					<p>conheça mais sobre nossa ferramenta</p>
					<a href="cadastro.jsp" class="btn">Cadastre-se</a>
				</div>
			</div>
		</section>

		<section class="qualidade container">
			<!-- <h2 class="subtitulo">conheÃ§a a</h2> -->
			<img src="img/logo_final.png" alt="Upvitae">
			<div class="qualidade_lista">
				
					<h3>Um Produto desenvolvido pela TechUp Projects</h3>
					<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui magni ducimus perspiciatis quam, laborum natus corporis quaerat officia temporibus optio dolor dolores facere ut, eius molestias facilis alias inventore velit. Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui repellendus quae distinctio. Veniam molestias neque fuga pariatur, provident voluptate conseq</p>
			</div>
		</section>

		<section class="quebra">
				<p></p>
		</section>
		
		<%@ include file="caminhos/rodape.html" %>

	</body>
</html>