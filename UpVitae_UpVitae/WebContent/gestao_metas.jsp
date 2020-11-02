<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html lang="pt-br">
		
	<head>
		<meta charset="UTF-8">
		<title>Gestão de Metas</title>
	 	<%@ include file="caminhos/imports-2.html" %>
		<link rel="stylesheet" href="css/gestao_metas.css">
	</head>
	
	<body>
		<%@ include file="caminhos/cabecalho-2.html" %>

		<section class="introducao-interna interna_produtos">
			<div class="container">
				<h1 id= "gestao_metas" data-anime="300" class="fadeInDown">Quadro de Gestão de Metas</h1>
				<p id= "para-gestao" data-anime="300" class="fadeInDown">Publique metas para seus funcionários e equipes, acompanhe seus resultados</p>
				<div class="btn-gestao">

				  <a data-anime="200" href="#formMeta" class="btn">Cadastrar Meta</a>
			    </div>
			</div>
		</section>

		<section class="container produto_item fadeInDown" data-anime="300">
			<div class="grid-5 produto_icone"><img src="img/phrase (2).jpg"></div>
			<div class="grid-5 produto_icone"><img src="img/phrase (2).jpg"></div>
			<div class="grid-5 produto_icone"><img src="img/phrase (2).jpg"></div>

			<div class="grid-16 produto_info">
				<div class="content">
				 
			</div>
		</section>

		
		<section class="container produto_info">
			<div class="grid-16 produto_info">
				<div class="content">
					<div class="separa_tabelas"></div>
	
					<h3>Painel Informativo</h3>
					<!-- Trigger/Open The Modal -->
					<button id="myBtn" class="bttModal">FIQUE POR DENTRO DO PAINEL DE METAS DA B2W</button>
	
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
			<div class="grid-16">
			<div class="separa_tabelas"></div>
		    </div>
			
		<section class="form_metas">
				<div class="grid-16" class="form_metas">
				
					<h3>Formulário de Cadastro - Metas Individuais<a name="formMeta"></a></h3>

					  <form class="form_metas" action="">
					  <input type="hidden" name="acao" value="cadastrarMetas">
					  
						<label for="lname">INSIRA SUA ÁREA DE ATUAÇÃO:</label><br>
						<input class="nome_completo" type="text" id="areaAtua" name="areaAtuacao"><br><br>

						<label for="fname">NÚMERO DO SEU CPF:</label><br>
						<input type="text" id="cpf" name="cpf"><br><br>
						  
  						<label for="lname">NOME COMPLETO:</label><br>
						<input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
						 
						<label for="fname">TITULO DA META:</label><br>
						<input type="text" id="tituloMetaIndividuo" name="tituloMetaIndividuo"><br><br>

						<label for="fname">DESCRIÇÃO DA META:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">NOME DO FUNCIONÁRIO ENCARREGADO:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">CPF DO FUNCIONÁRIO ENCARREGADO:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">VALOR DA META EM PONTOS:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="dataLimite">DATA DE LANÇAMENTO DA META:</label><br>
						<input type="date" id="dataLanca" name="dataLanca"><br><br>

						<label for="dataLimite">DATA LIMITE:</label><br>
						<input type="date" id="dataLimite" name="dataLLimite"><br><br>
						
						<a href="listaMetaIn.jsp"><button id="atualizaMeta" type="submit" class="bttUpdateMeta">ENVIAR</button></a><br><br>
						<a href="listaMetaIn.jsp"><button id="atualizaMeta" class="bttUpdateMeta">ATUALIZAR OU DELETAR META</button></a>
						
					</form>
				</div>
			</section>
			

			<div class="grid-16">
				<div class="separa_tabelas"></div>
		    </div>

			
				<div class="grid-16" class="form_metas"> 
					<h3>Formulário de Cadastro - TIMES</h3>
					
					<form class="form_metas" action="">
					
						<label for="lname">INSIRA SUA ÁREA DE ATUAÇÃO:</label><br>
						<input class="nome_completo" type="text" id="areaAtua" name="areaAtuacao"><br><br>

						<label for="fname">NÚMERO DO SEU CPF:</label><br>
						<input type="text" id="cpf" name="cpf"><br><br>
						  
  						<label for="lname">NOME COMPLETO:</label><br>
						<input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
						 
						<label for="fname">TÍTULO DA EQUIPE:</label><br>
						<input type="text" id="tituloMetaIndividuo" name="tituloMetaIndividuo"><br><br>

						<label for="fname">NOME DOS MEMBROS:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">CPF DOS MEMBROS:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="dataLimite">DATA DE CRIAÇÃO:</label><br>
						<input type="date" id="dataLimite" name="dataLLimite"><br><br>

						<input class="btnMeta" type="submit" value="Enviar"><br><br>
						  
					</form>
				</div>
	
		</section>	
			
		<section class="container produto_info">
		<div class="grid-16">
				<div class="separa_tabelas"></div>
			</div>
			<section class="form_metas">
				<div class="grid-16" class="form_metas">
					<h3>Formulário de Cadastro DE Metas - Times</h3>
					<form class="form_metas" action="">
						<label for="lname">INSIRA SUA ÁREA DE ATUAÇÃO:</label><br>
						<input class="nome_completo" type="text" id="areaAtua" name="areaAtuacao"><br><br>

						<label for="fname">NÚMERO DO SEU CPF:</label><br>
						<input type="text" id="cpf" name="cpf"><br><br>
						  
  						<label for="lname">NOME COMPLETO:</label><br>
						<input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
						 
						<label for="fname">TÍTULO DA META:</label><br>
						<input type="text" id="tituloMetaIndividuo" name="tituloMetaIndividuo"><br><br>

						<label for="fname">DESCRIÇÃO DA META:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">NOME DO TIME ENCARREGADO:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">CPF DO TIME ENCARREGADO:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="fname">VALOR DA META EM PONTOS:</label><br>
						<input type="text" id="tituloMeta" name="tituloMeta"><br><br>

						<label for="dataLimite">DATA DE LANÇAMENTO DA META:</label><br>
						<input type="date" id="dataLanca" name="dataLanca"><br><br>

						<label for="dataLimite">DATA LIMITE:</label><br>
						<input type="date" id="dataLimite" name="dataLLimite"><br><br>

						<input class="btnMeta" type="submit" value="Enviar"><br><br>
						
					</form>
				</div>

			</section>
			
			<div class="grid-16">
    <div class="separa_tabelas"></div>
    </div>
    
   
    <section class="form_metas">
        <div class="grid-16" class="form_metas">
            <h3>Formulário de Metas Realizadas</h3>
            <form class="form_metas" action="">
            
               <label for="lname">INSIRA SUA ÁREA DE ATUAÇÃO:</label><br>
						<input class="nome_completo" type="text" id="areaAtua" name="areaAtuacao"><br><br>

                <label for="fname">NÚMERO DO SEU CPF:</label><br>
                <input type="text" id="cpf" name="cpf"><br><br>
                  
                  <label for="lname">NOME COMPLETO:</label><br>
                <input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
                 
                <label for="fname">TÍTULO DA META:</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="fname">NOME DO ASSOCIADO QUE CUMPRIU A META:</label><br>
                <input type="text" id="funcionarioMeta" name="funcinarioMeta"><br><br>

                <label for="fname">CPF DO ASSOCIADO QUE CUMPRIU A META:</label><br>
                <input type="text" id="funcionarioCPFMeta" name="funcionarioCPFMeta"><br><br>

                <label for="dataLimite">DATA DA FINALIZAÇÃO:</label><br>
                <input type="date" id="dataCompleto" name="dataComplpeto"><br><br>

                <input class="btnMeta" type="submit" value="Enviar"><br><br>
                  
            </form>
        </div>
    </section>
			
		</section>
		
			<div class="grid-16">
				<div class="separa_tabelas"></div>
			</div>
		</section>
		
		<section class="quebra">
			
		</section>

		

	<%@ include file="caminhos/rodape.html" %>

	</body>
</html>