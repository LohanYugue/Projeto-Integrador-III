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
            <form method="POST" action="${pageContext.request.contextPath}/CadastroProduto">
                <fieldset class="fieldset">
                    <h1><center>Cadastro de Produtos</center></h1>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="idProduto">ID Produto:</label>
                            <input type="number" class="form-control" id="inputId" placeholder="ID" disabled>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="nomePro">Nome:</label>
                            <input type="text" class="form-control" id="inputNome" placeholder="Nome">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="valorPro">Valor:</label>
                        <input type="text" class="form-control" id="inputValor" placeholder="R$">
                    </div>
                    <div class="form-group">
                        <label for="quantPro">Quantidade</label>
                        <input type="number" class="form-control" id="inputQtd" placeholder="Quantidade">
                    </div>
                    <div>
                    <button type="submit" class="btnSalvar">Salvar</button>
                    
                    <button type="reset" value="Reset" class="btnLimpar">Limpar</button>

                    <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                    
                </fieldset>
            </form>
        </main>
    </body>
</html> 