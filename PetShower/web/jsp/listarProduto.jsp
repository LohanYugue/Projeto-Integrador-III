<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <h1><center>Lista de Produtos</center> </h1>
                <table border=1>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>Valor</th>
                            <th>Estoque</th>
                            <th>Data de Cadastro</th>
                            <th colspan=2>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listaProduto}" var="produto">
                        <tr>
                            <td><c:out value="${produto.idProduto}" /></td>
                        <td><c:out value="${produto.proNome}" /></td>
                        <td><c:out value="${produto.proValor}" /></td>
                        <td><c:out value="${produto.proEstoque}" /></td>
                        <td><c:out value="${produto.proDataCadastro}" /></td>
                        <td><a href="CadastroProduto?action=edit&idProduto=<c:out value="${produto.idProduto}/>Update</a></td>
                        <td><a href="CadastroProduto?action=delete&idProduto=<c:out value="${produto.idProduto}/>Delete</a></td>

                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </fieldset>
    </body>
</html>
