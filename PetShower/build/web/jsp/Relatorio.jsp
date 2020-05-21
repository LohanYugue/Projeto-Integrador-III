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
        <link href="../css/Relatorio.css" rel="stylesheet">
        <title>Relatório Mensal</title>
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
        <h2><center>Produtos mais vendidos</center></h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Produto</th>
                    <th scope="col">Quantidade</th>
                    <th scope="col">Valor</th>
                    <th scope="col">ValorTotal</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Ração Canina</td>
                    <td>50</td>
                    <td>R$40,00</td>
                    <td>R$2.000</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Tapete</td>
                    <td>30</td>
                    <td>R$20,00</td>
                    <td>R$600,00</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Veneno de Pulgas</td>
                    <td>10</td>
                    <td>R$50,00</td>
                    <td>R$500,00</td>
                </tr>
            </tbody>
        </table>


    </body>
</html>
