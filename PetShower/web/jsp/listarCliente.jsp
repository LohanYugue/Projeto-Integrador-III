<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleeapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/font/fontawesome-all.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link href="../css/CadastroCliente.css" rel="stylesheet">
        <title>Lista</title>
    </head>
    <body>
       
        <!-- start header-->
        <header class="header">
            <div class ="content">
                <div class="logo fl-left " >
                    <a href="#">
                        <img src="../img/background/logo_size.png" alt="LogoPetShower"/>
                    </a>
                </div>
            </div>
        </header>
        <!-- end /header -->

        <fieldset class="fieldset ">
            <div class="tabela">
                <h1>Lista de Clientes</h1>
                <table border=1>
                    <thead>
                        <tr class="tr">
                            <th>ID</th>
                            <th>Nome</th>
                            <th>CPF</th>
                            <th>Endereço</th>
                            <th>Cidade</th>
                            <th>UF</th>
                            <th>Telefone</th>
                            <th colspan=2>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${cliente}" var="cliente">
                            <tr>
                                <td><c:out value="${cliente.idCliente}" /></td>
                                <td><c:out value="${cliente.cliNome}" /></td>
                                <td><c:out value="${cliente.cliCpf}" /></td>
                                <td><c:out value="${cliente.cliDataNasc}" /></td>
                                <td><c:out value="${cliente.cliEndereco}" /></td>
                                <td><c:out value="${cliente.cliCidade}" /></td>
                                <td><c:out value="${cliente.cliUf}" /></td>
                                <td><c:out value="${cliente.cliTelefone}" /></td>
                                <td><a href="${pageContext.request.contextPath}/EditarCliente?cli_id=<c:out value="${cliente.cli_id}"/>">Editar</a></td>
                                <td><a href="${pageContext.request.contextPath}/DeletarCliente?cli_id=<c:out value="${cliente.cli_id}"/>">Deletar</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <div>
                     <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                </div>
            </div>
        </fieldset>

    </body>
</html>
