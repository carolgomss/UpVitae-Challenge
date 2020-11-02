<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<title>Gestão de Recompensas</title>
	<%@ include file="caminhos/imports-2.html" %>
    <link rel="stylesheet" href="css/gestao_recompensas.css">
</head>

<body>

	<%@ include file="caminhos/cabecalho-2.html" %>

    <section class="introducao-interna interna_produtos">
        <div class="container">
            <h1 id="gestao_metas" data-anime="300" class="fadeInDown">Quadro de Gestão de Recompensas</h1>
            <p id="para-gestao" data-anime="300" class="fadeInDown">Atribua benefícios para funcionários e equipes,
                recompense a quem dedica o melhor de si</p>
            
        </div>
    </section>

    <section class="container produto_item fadeInDown" data-anime="300">
        <div class="grid-5 produto_icone" class="opacity"><img src="img/thanks.jpg"></div>
        <div class="grid-5 produto_icone"><img src="img/thanks.jpg"></div>
        <div class="grid-5 produto_icone" class="opacity"><img src="img/thanks.jpg"></div>

        <div class="grid-16 produto_info">
            <div class="content">
                <div class="separa_tabelas"></div>

                <h3>Painel Informativo</h3>
                <!-- Trigger/Open The Modal -->
                <button id="myBtn" class="bttModal">FIQUE POR DENTRO DO QUADRO DE RECOMPENSAS</button>

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
    <section class="form_metas">
        <div class="grid-16" class="form_metas">
            <div class="separa_tabelas"></div>

            
            <h3>Formulário de Cadastro de Recompensas</h3><br><br>
            <form class="form_metas" action="">
                <label for="lname">INSIRA SUA ÁREA DE ATUAÇÃO:</label><br>
                <input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
                 
                <label for="fname">NÚMERO DO SEU CPF:</label><br>
                <input type="text" id="cpf" name="cpf"><br><br>
                  
                <label for="lname">NOME COMPLETO:</label><br>
                <input class="nome_completo" type="text" id="nomeCompleto" name="nomeCompleto"><br><br>
                 
                <label for="fname">TÍTULO DA RECOMPENSA:</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="fname">DESCRIÇÃO DA RECOMPENSA:</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="fname">CUSTO:</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="fname">NOME DO ASSOCIADO CONTEMPLADO</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="fname">CPF:</label><br>
                <input type="text" id="tituloMeta" name="tituloMeta"><br><br>

                <label for="dataLimite">DATA DE ASSOCIAÇÃO:</label><br>
                <input type="date" id="dataLimite" name="dataLLimite"><br><br>

                <label for="dataLimite">DATA LIMITE:</label><br>
                <input type="date" id="dataLimite" name="dataLLimite"><br><br>

                <input class="btnMeta" type="submit" value="Enviar"><br><br>
                  
            </form>
        </div>
    </section>
    </div>
    
   
  
</section>


<section class="quebra">
    
</section>

<%@ include file="caminhos/rodape.html" %>

</body>

</html>