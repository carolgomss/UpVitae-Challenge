<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>

<head>
    <title>Lista Associados</title>
    <%@ include file="caminhos/imports-2.html" %>
<link rel="stylesheet" href="css/atualiza.css">
    
    </script>
</head>

<body>
    <%@ include file="caminhos/cabecalho-2.html" %>
        <header class="header">
            <div class="container">
                <a href="index.jsp" class="grid-4">
                    <img src="img/UpVitae_final.png" alt="Upvitae"></a>
                <nav class="grid-12 header_menu">
                    <ul>
                        <li><a href="desempenho.jsp">Desempenho</a></li>
                        <li><a href="gestao_metas.jsp">Gest�o de Metas</a></li>
                        <li><a href="recompensas.jsp">Recompensas</a></li>
                        <li><a href="cadastro.jsp" class="menu-ativo">Cadastro</a></li>
                        <li><a href="login.jsp">Login</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <div class="geralAtualiza">
        <div class="col-16">
        <nav class="linksAtualiza">
            <ul>
                <li><a href="index.jsp">Inicio</a></li>
                <!-- MUDAR ACAO -->
                <li><a href="cadassociado?acao=listarTodos">Associados</a></li><br>
            </ul>
        </nav>
    </header>

    <section>
        <form action="cadassociado" method="POST">
            <input type="hidden" name="acao" value="atualizar">
            <input type="hidden" name="id" value="${objIdMeta}">

            <fieldset>
                <legend  class="metaTitulo">Atualização de Meta Individual</legend>
                <div><br><br>

                    <label for="idAreaMeta">Area do Associado Gestor/RH</label>
                    <input type="text" name="areaMeta" id="idAreaMeta" required="required" placeholder="Digite sua area" value="${objMeta.areaMeta}">
                </div><br><br>

                <div>
                    <label for="idCpfMeta">CPF</label>
                    <input type="text" name="cpfMeta" id="cpfMeta" required="required" placeholder="Digite seu cpf"
                        value="${objMeta.cpfMeta}">
                </div><br><br>

                <div>
                    <label for="idCpfMeta">Nome Gestor</label>
                    <input type="text" name="nomeMeta" id="idNomeMeta" required="required" placeholder="Digite seu nome"
                        value="${objMeta.nomeMeta}">
                </div><br><br>

                <div>
                    <label for="tituloMeta">Título da Meta</label>
                    <input type="text" name="tituloMeta" id="idTituloMeta" required="required" placeholder="Digite o título"
                        value="${objMeta.tituloMeta}">
                </div><br><br>

                <div>
                    <label for="descMeta">Descrição da Meta</label>
                    <input type="text" name="descMeta" id="idDescMeta" required="required" placeholder="Digite a descrição"
                        value="${objMeta.descMeta}">
                </div><br><br>
                
                 <div>
                    <label for="nomeFunMeta">Nome do Funcionário Responsável pela Meta</label>
                    <input type="text" name="nomeFunMeta" id="idNomeFunMeta" required="required" placeholder="Digite..."
                        value="${objMeta.descMeta}">
                </div><br><br>
                
                <div>
                    <label for="cpfFunMeta">CPF do Funcionário Responsável pela Meta</label>
                    <input type="text" name="cpfFunMeta" id="CpfFunMeta" required="required" placeholder="Digite..."
                        value="${objMeta.cpfFunMeta}">
                </div><br><br>

                <div>
                    <label for="cpfFunMeta">Valor da Meta</label>
                    <input type="text" name="valorMeta" id="valorMeta" required="required" placeholder="Digite..."
                        value="${objMeta.valorMeta}">
                </div><br><br>


                <div>
                    <label for="idNasc">Data Lançamento</label>
                    <input type="date" name="dataLan" id="idDataLan" required="required"
                        value='<f:formatDate value="${objCad.dataLan}" pattern="yyyy-MM-dd"/>'>
                </div><br><br>

                <div>
                    <label for="idDataLim">Data Limite</label>
                    <input type="date" name="dataLim" id="idDataLim" required="required"
                        value='<f:formatDate value="${objCad.dataLim}" pattern="yyyy-MM-dd"/>'>
                </div><br><br>
                
                    <button class="atualizar" type="submit">Atualizar</button>
                </div>   

            </fieldset>
        </form>
   
    </div>
   </div>
    </section>

    <footer>
        <div class="footer">
            <div class="container">
                <div class="grid-4 footer_contato">
                    <h3>Contato</h3>
                    <ul>
                        <li>(11)4433 - 3344</li>
                        <li>upprojects.fiap.com.br</li>
                        <li>S�o Paulo</li>
                    </ul>
                </div>

                <div class="grid-4 footer_redes">
                    <h3>Redes Sociais</h3>
                    <ul>
                        <li><a href="http://facebook.com" target="_blank"><img src="img/redes-sociais/facebook1.svg"></a></li>
                        <li><a href="http://instagram.com" target="_blank"><img src="img/redes-sociais/instagram-sketched.svg"></a></li>
                        <li><a href="http://twitter.com" target="_blank"><img src="img/redes-sociais/twitter (1).svg"></a></li>
                    </ul>
                </div>

            </div>
        </div>

        <div class="copy">
            <div class="container">
                <p class="grid-16">TechUp Projects 2020 - Copyright.</p>
            </div>
        </div>
    </footer>

<!-- JavaScript -->
<script src="./js/simple-anime.js"></script>
  <script src="./js/script.js"></script>
<!-- JavaScript -->

</body>