<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <title>Cadastro</title>

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

        <!-- start form -->
        <main>
            <form action="CadastroCliente" method="POST">
                <fieldset class="fieldset">
                    <h1><center>Cadastro Clientes</center></h1>

                    <div class="form-group">
                        <label for="codigo">Código:</label>
                        <input type="number" size="5" maxlength="5" value="0"  class="form-control" id="codigo" name="idCliente"/>
                    </div>

                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text"  maxlength="25" class="form-control" id="nome" name="cliNome">
                    </div>

                    <div class="form-group">
                        <label for="cpf">CPF:</label>
                        <input type="number" class="form-control" id="cpf" name="cliCpf">
                    </div>

                    <div class="form-group">
                        <label for="data">Data de Nascimento:</label>
                        <input type="date" class="form-control" id="data" name="cliDataNasc">
                    </div>

                    <div class="form-group">
                        <label for="endereco">Endereço:</label>
                        <input type="text" class="form-control" id="endereco" name="cliEndereco">
                    </div>

                    <div class="form-group">
                        <label for="cidade">Cidade:</label>
                        <input type="text" class="form-control" id="cidade" name="cliCidade">
                    </div>

                    <div class="form-group">
                        <select>
                            <option value="">Selecione</option>
                            <option value="RJ">RJ</option>
                            <option value="SP">SP</option>

                        </select>
                    </div>

                    <div class="form-group">
                        <label for="telefone">Telefone:</label>
                        <input type="number" class="form-control" id="telefone" name="cliTelefone">
                    </div>

                    <div>

                        <button type="submit" class="btnSalvar">Salvar</button>

                        <button type="reset" value="Reset" class="btnLimpar">Limpar</button>

                        <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">

                    </div>
                </fieldset>
            </form>
        </main>
        <!-- end form -->
    </body>
</html> 