<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Minhas Recompensas</title>
		<%@ include file="caminhos/imports-2.html" %>
		<link rel="stylesheet" href="css/recompensas.css">
	</head>
	<body>
		<%@ include file="caminhos/cabecalho.html" %>

		<section class="introducao-interna interna_portfolio">
			<div class="container">
				<h1 id= "recompensas" data-anime="300" class="fadeInDown">Recompensas</h1>
				<p id= "para-recompensas" data-anime="300" class="fadeInDown">juntos vamos celebrar as conquistas</p>
			</div>
		</section>

		<section class="produtos container fadeInDown" data-anime="300">
			<h2 id= "painel" class="subtitulo">Painel Geral</h2>
			<ul class="produtos_lista">

				<li class="grid-1-3">
					<div class="produtos_icone">
						<img src="img/prize.svg" alt="Pontuacao">
					</div>
					<h3>Pontos</h3>
					<p>Você precisa de 1000 pontos para atingir o próximo nível</p>
				</li>

				<li class="grid-1-3">
					<div class="produtos_icone">
						<img src="img/course1.svg" alt="Cursos">
					</div>
					<h3>Cursos</h3>
					<p>Você tem 5 cursos on-line, inicie a hora que quiser</p>
				</li>

				<li class="grid-1-3">
					<div class="produtos_icone">
						<img src="img/love.svg" alt="Bonificacoes">
					</div>
					<h3>Bonificações</h3>
					<p>Confira seus bônus em carteira digital entre outros prêmios</p>
				</li>

			</ul>
		</section>
		
		<section class="container produto_info">
			<div class="grid-16 produto_info">
				<div class="content">
					<div class="separa_tabelas"></div>
	
					<h3>Painel Informativo</h3>
					<!-- Trigger/Open The Modal -->
					<button id="myBtn" class="bttModal">FIQUE POR DENTRO DO PAINEL DE RECOMPENSAS</button>
	
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
	
				</div>
			</div>
		</section>

		
		<section class="ame-digital">
			<div class="grid-1-8">
				<div class="banner-ame-digital">
					<div class="logo-ame"><a href="https://www.amedigital.com/"><img class="logo-ame" src="img/ame-logo.png" alt="logo-ame-digital"></a>
						<div class="logo-dir"></div>
						<div class="logo-esq"></div>
					</div>
					<div class="info-ame"></div>
					<div class="info-ame2">
						<p class="ame-txt-titulo">AME Digital</p> 
						<p class="ame-txt">Somos parceiros do app que você paga mais rápido e ainda ganha cashback, confira em seu painel de benefícios!</p>
					</div>
				</div>
			</div>

		</section>

		
				
			<div class="recompensa-depoimento-title">
				<h2>Reconhecimento e Agradecimento</h2>
				<p>Veja abaixo depoismentos de quem acreditou e chegou lá!</p>
			</div>

		

		<section class="container fadeInDown" data-slide="quote" data-anime="1200">
			<blockquote class="quote_clientes">
				<p>"Lorem ipsum dolor sit, amet consectetur adipisicing elit. Asperiores quod iusto, tempora voluptates sit consequatur nostrum voluptas minus deserunt, corrupti, accusamus quis nulla id magnam rerum numquam quasi sequi eius?</p>
				<cite>Maria Maria</cite>
			</blockquote>
			<blockquote class="quote_clientes">
				<p>"Lorem ipsum dolor sit amet consectetur adipisicing elit. Inventore facere et illo veniam in assumenda molestiae odio ipsam corporis, facilis obcaecati architecto repudiandae magnam possimus ipsa aliquid consequuntur nisi commodi."</p>
				<cite>Jose Jose</cite>
			</blockquote>
			<blockquote class="quote_clientes">
				<p>"Lorem ipsum dolor sit amet consectetur adipisicing elit. Laboriosam aut debitis exercitationem dignissimos non nam, recusandae ducimus omnis quidem eum nulla perferendis nihil molestias perspiciatis eius cupiditate enim veritatis architecto."</p>
				<cite>Ana Ana</cite>
			</blockquote>
		</section>

		<section class="portfolio">
			<div class="container" data-slide="portfolio">
				<ul class="portfolio_lista">
					<li class="grid-8"><img src="img/celebrate1.jpg" alt="Luz aconchegante"></li>
					<li class="grid-8"><img src="img/book.jpg" alt="Java livro"></li>
					<li class="grid-16"><img src="img/beach_final.jpg" alt="Praia"></li>
				</ul>
				<ul class="portfolio_lista">
					<li class="grid-8"><img src="img/jaqueta.jpg" alt="Loja de Roupas"></li>
					<li class="grid-8"><img src="img/escuro_show (2).jpg" alt="Show de Rock"></li>
					<li class="grid-16"><img src="img/escuro_large (2).jpg" alt="Inglaterra"></li>
				</ul>
				<ul class="portfolio_lista">
					<li class="grid-8"><img src="img/bike_race.jpg" alt="Bicicleta Esporte"></li>
					<li class="grid-8"><img src="img/kids_bike.jpg" alt="Bicicleta RetrÃ´"></li>
					<li class="grid-16"><img src="img/forest.jpg" alt="Floresta"></li>
				</ul>
			</div>
		</section>

		<section class="quebra">
			<blockquote class="quote-externo container">
				
			</blockquote>
		</section>

	<%@ include file="caminhos/rodape-2.html" %>

	</body>
</html>