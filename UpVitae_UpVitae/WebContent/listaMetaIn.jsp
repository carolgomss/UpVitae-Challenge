<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Associados</title>
<%@ include file="caminhos/imports-2.html" %>
<link rel="stylesheet" href="css/atualiza.css">

</head>

<body>
	<%@ include file="caminhos/cabecalho-2.html" %>
	<%@ include file="caminhos/imports.html" %>
 
  <nav>
   <ul>
   <li><a href="cadastro.jsp">Inícicio</a></li>
   <li><a href="cadassociado?acao=listarTodos">Associados Cadastrados</a></li>
   </ul>
  </nav>
 </header>
 
<section>
 <table border="1">
  <tr>
   <th>ID</th>
    <th>Área de Atuação</th>
    <th>CPF</th>
    <th>Nome</th>
    <th>Título da Meta</th>
    <th>Descrição da Meta</th>
    <th>Nome do Funcionário Encarregado</th>
    <th>CPF do FuncionÃ¡rio Encarregado</th>
    <th>Valor da Meta em Pontos</th>
    <th>Data de LanÃ§amento da Meta</th>
    <th>Data de Limite</th>

 <th colspan="2">Editar</th>
</tr>

<c:forEach var="cad" items="${lista_cad}" varStatus="id">
 <tr>
  <td>${meta.idMeta}</td>
  <td>${meta.areaMeta} ${meta.nomeMeta}</td>
  <td>${meta.cpfMeta}</td>
  <td>${meta.tituloMeta}</td>
  <td>${meta.descMeta}</td>
  <td>${meta.nomeFunMeta}</td>
  <td>${meta.cpfFunMeta}</td>
  <td>$meta.valorMeta}</td>
  <td><f:formatDate value="${meta.dataLan}"pattern="dd/MM/yyyy"/></td>
  <td><f:formatDate value="${meta.dataLim}"pattern="dd/MM/yyyy"/></td>

<!-- Depende do nome da classe<td><a href="cadassociado?acao=listarId&id_cad=${cad.id}">Editar</a></td> -->
<!-- Depende do nome da classe<td><a href="cadassociado?acao=excluir&id_cad=${cad.id}">Excluir</a></td> -->
</tr>

</c:forEach>
</table>
</section>

<footer>
  <div class="footer">
    <div class="container">
      <div class="grid-4 footer_contato">
        <h3>Contato</h3>
        <ul>
          <li>(11)4433 - 3344</li>
          <li>upprojects.fiap.com.br</li>
          <li>São Paulo</li>
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