<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Associados</title>
<link rel="stylesheet" href="css/cadastro.css">
<%@ include file="header.jsp" %>
<%@ include file="caminhos/imports.html" %>
</head>

<body>
 <header>
 <%@ include file="caminhos/cabecalho.html" %>
  <nav>
   <ul>
   <li><a href="cadastro.jsp">Início</a></li>
   <li><a href="cadassociado?acao=listarTodos">Associados Cadastrados</a></li>
   </ul>
  </nav>
 </header>
 
<section>
 <table border="1">
  <tr>
   <th>ID</th>
    <th>Área de Atuação</th>
    <th>Nome</th>
    <th>CPF</th>
    <th>Data Nascimento</th>
    <th>e-mail</th>
    <th>Tel</th>
    <th>Senha</th>
    <th>Senha Confirma</th>
 <th colspan="2">Editar</th>
</tr>

<c:forEach var="cad" items="${lista_cad}" varStatus="id">
 <tr>
  <td>${cad.id}</td>
  <td>${cad.areaCad} ${cad.nomeCad}</td>
  <td>${cad.cpfCad}</td>
  <%--<td><f:formatDate value="${cad.nascCad}"pattern="dd/MM/yyyy"/></td>--%>
  <td>${cad.emailCad}</td>
  <td>${cad.telCad}</td>
  <td>${cad.senhaCad}</td>
  <td>${cad.validaCad}</td>

	<td><a href="cadassociado?acao=listarId&id_cad=${cad.id}">Editar</a></td>
	<td><a href="cadassociado?acao=excluir&id_cad=${cad.id}">Excluir</a></td>
</tr>

</c:forEach>
</table>
</section>


</body>