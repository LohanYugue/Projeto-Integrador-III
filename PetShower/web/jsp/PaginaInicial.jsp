<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PetShower - O melhor site de pets do mundo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleeapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
        <link rel="stylesheet" type="text/css" href="css/fontawesome-all.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <link href="../css/PaginaInicial.css" rel="stylesheet">


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



                <nav class="nav">
                    <ul>
                        <li><a href="#">Atendimento</a></li>
                        <li><a href="#">Lojas</a></li>
                        <li><a href="#">Relatórios</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <!-- end /header -->

        <!-- start search e estatisticas -->
        <section class="section">
            <div class="search-box">
                <header>
                    <h1>PetShower</h1>
                    <p class="tagline">Aqui nós entendemos o que seu pet precisa!</p>
                </header>
                <form class="form-search" method="post" action="">
                    <input type="search" name="busca" id="busca" placeholder="Pesquisar"/>
                    <button type="submit"><i class="fa fa-search"></i></button>
                </form>
            </div>

            <div class="estatisticas">
                <div class="estatisticas-item">
                    <a href="CadastroVenda.jsp">Venda</a><br>
                </div>
                <div class="estatisticas-item">
                    <a href="CadastroCliente.jsp">Cliente</a><br>
                </div>
                <div class="estatisticas-item">
                    <a href="CadastroProduto.jsp">Produto</a><br>
                </div>
            </div>

        </section>

        <!-- end search e estatisticas -->
    </body>
</html>
