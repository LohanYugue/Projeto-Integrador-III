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
        <link href="../css/CadastroProduto.css" rel="stylesheet">
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
        <main>
            <form>
                <fieldset class="fieldset">
                    <h1><center>Cadastro Produtos</center></h1>

                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text"  maxlength="25" class="form-control" placeholder="Insira o nome do produto" id="nome" name="cliNome">
                    </div>

                    <div class="form-group">
                        <label for="nome">Valor:</label>
                        <input type="number"  maxlength="25" class="form-control" placeholder="Insira o nome do produto" id="nome" name="cliNome">
                    </div>


                    <div class="form-group">
                        <label for="quantidade">Quantidade:</label>
                        <input type="number" class="form-control" id="estoque" name="proEstoque">
                    </div>

                    <div class="form-group">
                        <label for="data">Data:</label>
                        <input type="date" class="form-control" id="data" name="proDataCadastro">
                    </div>

                    <div>
                        <div>
                            <button type="submit" class="btnSalvar">Salvar</button>

                            <div>
                                <button type="reset" value="Reset" class="btnLimpar">Limpar</button>

                                <div>
                                    <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                                    
                                    <a type="button" class="btnLista" href="listarProduto.jsp">Lista de Produtos</a>


                                </div>


                                </fieldset>
                                </form>
                                </main>
                                </body>
                                </html> 