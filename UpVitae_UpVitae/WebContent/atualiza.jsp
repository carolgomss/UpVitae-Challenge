<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Associados</title>
<link rel="stylesheet" href="css/atualiza.css">
<%@ include file="caminhos/imports.html" %>
</head>

<body>
<header>
 <%@ include file="caminhos/cabecalho.html" %>

<div class="geralAtualiza">
        <div class="col-16">
        <nav class="linksAtualiza">
            <ul>
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="cadassociado?acao=listarTodos">Associados</a></li><br>
            </ul>
        </nav>
    </header>

    <section>
        <form action="cadassociado" method="POST">
            <input type="hidden" name="acao" value="atualizar">
            <input type="hidden" name="id" value="${objIdCad}">

            <fieldset>
                <legend  class="areaTitulo">Atualização de Cadastro</legend>
                <div><br><br>

                    <label for="idAr">Area do Associado</label>
                    <input type="text" name="areaCad" id="idNm" required="required" placeholder="Digite sua area"
                        value="${objCad.areaCad}">
                </div><br><br>


                <div>
                    <label for="idNome">Nome</label>
                    <input type="text" name="nomeCad" id="idNome" required="required" placeholder="Digite seu nome"
                        value="${objCad.nomeCad}">
                </div><br><br>

                <div>
                    <label for="idCpf">CPF</label>
                    <input type="text" name="cpfCad" id="idNome" required="required" placeholder="Digite seu cpf"
                        value="${objCad.cpfCad}">
                </div><br><br>


                <div>
                    <label for="idNasc">Data Nascimento</label>
                    <input type="date" name="data" id="idNasc" required="required"
                        value='<f:formatDate value="${objCad.dataNasc}" pattern="yyyy-MM-dd"/>'>
                </div><br><br>

                <div>
                    <label for="idEmail">e-mail</label>
                    <input type="text" name="emailCad" id="idEmail" required="required" placeholder="Digite seu e-amil"
                        value="${objCad.emailCad}">
                </div><br><br>

                <div>
                    <label for="idSenha">Senha</label>
                    <input type="text" name="senhaCad" id="idSenha" required="required" placeholder="Digite sua senha"
                        value="${objCad.senhaCad}">
                </div><br><br>

                <div>
                    <label for="idValida">Valida</label>
                    <input type="text" name="validaCad" id="idVAlida" required="required" placeholder="Digite sua senha"
                        value="${objCad.validaCad}">
                </div><br><br>

              </select>
           </div>


           <label for="idTel">Telefone</label>
           <input type="tel" name="telCad" id="idTel" placeholder="(xx) xxxxxx-xxxx" required="required"
                    pattern="\(?[0-9]{2}\)? ?[0-9]{4,6}-?[0-9]{3,4}$" value="${objCad.telCad}"><br><br><br>

                    <button class="atualizar" type="submit">Atualizar</button>
                </div>              
                              
            </fieldset>
        </form>
    </div>
    </div>
   </div>
    </section>

	<%@ include file="caminhos/rodape.html" %>
</body>