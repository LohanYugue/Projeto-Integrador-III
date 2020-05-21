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

        <!-- start Vendas-->
        <main>
            <form method="POST" action="${pageContext.request.contextPath}/CadastroVendas">
                <fieldset class="fieldset">
                    <h1><center>Cadastro de Vendas</center></h1>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="idVenda">ID Venda:</label>
                            <input type="number" class="form-control" id="inputId" placeholder="ID" disabled>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="nomeCliente">Nome:</label>
                            <input type="text" class="form-control" id="inputNome" placeholder="Nome do Cliente">
                        </div>
                        <div class="form-group">
                            <label for="cpfCliente">CPF:</label>
                            <input type="text" class="form-control" id="inputCpf" placeholder="CPF do Cliente">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="valorTotal">Valor Total:</label>
                        <input type="text" class="form-control" id="inputValor" placeholder="R$">
                    </div>
                    <div class="form-group">
                        <label for="quantPro">Quantidade</label>
                        <input type="number" class="form-control" id="inputQtd" placeholder="Quantidade de Produtos">
                    </div>
                    <div>
                        <button type="submit" class="btnSalvar">Salvar</button>

                        <button type="reset" value="Reset" class="btnLimpar">Limpar</button>

                        <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                    </div>
                     <!-- end Vendas-->
                </fieldset>
            </form>
        </main>
    </body>
</html>
