<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <body>
        <div class="tabela">
            <h1>Lista de Clientes</h1>
            <table border=1>
                <thead>
                    <tr>
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
                <c:forEach items="${listaCliente}" var="cliente">
                    <tr>
                        <td><c:out value="${cliente.idCliente}" /></td>
                    <td><c:out value="${cliente.cliNome}" /></td>
                    <td><c:out value="${cliente.cliCpf}" /></td>
                    <td><c:out value="${cliente.cliEndereco}" /></td>
                    <td><c:out value="${cliente.cliCidade}" /></td>
                    <td><c:out value="${cliente.cliUf}" /></td>
                    <td><c:out value="${cliente.cliTelefone}" /></td>
                    <td><a href="CadastroCliente?action=edit&idCliente=<c:out value="${cliente.idCliente}/>Update</a></td>
                    <td><a href="CadastroCliente?action=delete&idCliente=<c:out value="${cliente.idCliente}/>Delete</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
