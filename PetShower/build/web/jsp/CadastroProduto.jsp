<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cadastro</title>
        <<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="CadastroProduto.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap">
    </head>
    <body>
        <main>
            <h1><center>Cadastro de Produtos</center></h1>
            <form>
                <fieldset>
                    <legend>Dados</legend>

                    <div class="form-group">
                        <label for="codigo">Código:</label>
                        <input type="number" class="form-control" id="codigo" name="idProduto">
                    </div>

                    <div class="form-group">
                        <label for="nome">Nome:</label>
                        <input type="text" class="form-control" id="nome" name="proNome">
                    </div>

                    <div class="form-group">
                        <label for="valor">Valor:</label>
                        <input type="text" class="form-control" id="valor" name="proValor">
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
                        <button type="submit" class="btn btn-primary mb-3">Salvar</button>
                    </div>


                </fieldset>
            </form>
        </main>

    </body>
</html>