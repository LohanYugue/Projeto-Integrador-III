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
                    <a href="CadastroVenda.jsp"> Cadastro de Venda</a><br>
                </div>
                <div class="estatisticas-item">
                    <a href="CadastroCliente.jsp">Cadastro de Cliente</a><br>
                </div>
                <div class="estatisticas-item">
                    <a href="CadastroProduto.jsp">Cadastro de Produto</a><br>
                </div>
            </div>

        </section>

        <!-- end search e estatisticas -->


        <!-- start Produtos -->
        <section class="section">
            <div class="content">
                <header class="section-header">
                    <h1> Aqui voce encontra os melhores produtos para seu pet</h1>
                    <p>Em diversas categorias!!</p>
                </header>

                <div class="row">
                    <div class="produtos-col">

                        <div class="box">
                            <div class="box-name">
                                Medicamentos
                            </div>

                            <div class="box-cover">
                                <img src="../img/seleções/antipulgas.png" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Os melhores medicamentos</h2>
                                    <p>Pets</p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>   

                <div class="row">
                    <div class="produtos-col">

                        <div class="box">
                            <div class="box-name">
                                Rações
                            </div>

                            <div class="box-cover">
                                <img src="../img/seleções/ração-seca.png" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>As melhores Rações</h2>
                                    <p>Pets</p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>   

                <div class="row">
                    <div class="produtos-col">

                        <div class="box">
                            <div class="box-name">
                                Tapetes
                            </div>

                            <div class="box-cover">
                                <img src="../img/seleções/tapetes.png" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Os melhores Tapetes</h2>
                                    <p>Pets</p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>   


            </div>

        </section>
        <!-- end Produtos -->



    </body>
</html>
