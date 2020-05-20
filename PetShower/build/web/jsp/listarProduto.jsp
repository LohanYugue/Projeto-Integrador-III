<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <body>
        <div class="tabela">
            <h1>Lista de Produtos</h1>
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
    </body>
</html>
