<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleeapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/font/fontawesome-all.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link href="../css/CadastroCliente.css" rel="stylesheet">
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.js"></script>
        <script type="text/javascript" src="http://www.godtur.no/godtur/js/jquery-ui-1.8.18.custom.min.js"></script>


        <title>Cadastro</title>

    </head>


    <body>

        <script>
            $(function () {
                $('input[name=dob]').datepicker();
            });
        </script>
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

        <!-- start form -->
        <main>
            <form method="POST" action="${pageContext.request.contextPath}/CadastroCliente" >
                <fieldset class="fieldset">
                    <h1><center>Cadastro Clientes</center></h1>

                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text"placeholder="Insira seu nome"  name="cliNome"
                               value="<c:out value="${cliente.cli_nome}" />"
                    </div>

                    <div class="form-group">
                        <label for="cpf">CPF:</label>
                        <input type="number"  placeholder="Insira seu cpf"name="cliCpf"
                               value="<c:out value="${cliente.cli_cpf}" />">
                    </div>

                    <div class="form-group">
                        <label for="data">Data de Nascimento:</label>
                        <input type="text" placeholder="dd/MM/yyyy" name="cliDataNasc" data-date-format="dd/MM/yyyy"
                               value="<fmt:formatDate pattern="dd/MM/yyyy" value="${cliente.cli_dataNascimento}" />" >
                    </div>

                    <div class="form-group">
                        <label for="endereco">Endereço:</label>
                        <input type="text"  placeholder="Insira o nome da sua rua"  name="cliEndereco"
                               value="<c:out value="${cliente.cli_rua}"/>" />
                    </div>

                    <div class="form-group">
                        <label for="cidade">Cidade:</label>
                        <input type="text" placeholder="Insira o nome da sua cidade" name="cliCidade"
                               value="<c:out value="${cliente.cli_cidade}" />">
                    </div>

                    <div class="form-group">
                        <label for="cidade">UF</label>
                        <input type="text" placeholder="Insira o UF" name="cliUf"
                               value="<c:out value="${cliente.cli_uf}" />">
                    </div>

                    <div class="form-group">
                        <label for="telefone">Telefone:</label>
                        <input type="number" placeholder="Insira seu telefone" name="cliTelefone"
                               value="<c:out value="${cliente.cli_telefone}"/>">
                    </div>

                    <div>

                        <button type="submit" class="btnSalvar">Salvar</button>

                        <button type="reset" value="Reset" class="btnLimpar">Limpar</button>

                        <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                        
                        <a type="button" class="btnLista" href="listarCliente.jsp">Lista de Clientes</a>

                    </div>
                </fieldset>
            </form>
        </main>
        <!-- end form -->
    </body>
</html> 