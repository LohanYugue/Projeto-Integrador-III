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
        <header class="header fixed">
            <div class ="content">
                <div class="logo fl-left " >
                    <a href="#">
                        <img src="../img/background/logo_size.png" alt="LogoPetShower"/>
                    </a>
                </div>

                <nav class="nav">
                    <ul>
                        <li><a href="#produtos-col">Produtos</a></li> 
                        <li><a href="#section-header">Atendimento</a></li>
                        <li><a href="Relatorio.jsp">Relatório</a></li>
                        <li class="itemdropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consultas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="listarCliente.jsp">Cliente</a>
                                <a class="dropdown-item" href="listarProduto.jsp">Produto</a>
                            </div>
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
                    <a name="produtos-col" id="produtos-col"></a> 
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

                    <div class="produtos-col">

                        <div class="box">
                            <div class="box-name">
                                Shampoo
                            </div>

                            <div class="box-cover">
                                <img src="../img/seleções/shampoo-para-cachorros.jpg" alt=""/>
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

        <!-- start parallax -->
        <div class="parallax">
            <div class="content">
                <h1>ENCONTROU O QUE PRECISAVA?</h1>
                <p>Temos tudo o que eles gostam</p>
                <button>SAÍBA MAIS</button> 
            </div>
        </div>
        <!-- end parallax -->

        <!-- start LOJAS -->
        <section class="section">
            <div class="content">
                <a name="section-header" id="section-header"></a>
                <header class="section-header">
                    <h1> Veja algumas de nossas lojas</h1>
                    <p>Procure a sua região</p>
                </header>

                <div class="row">
                    <div class="destaques-col">
                        <div class="box">
                            <div class="box-name">
                                Lojas
                            </div>

                            <div class="box-cover">
                                <img src="../img/Lojas/loja1.jpg" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Santo amaro</h2>
                                    <p>(11)75847-2481</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="destaques-col">
                        <div class="box">
                            <div class="box-name">
                                Lojas
                            </div>

                            <div class="box-cover">
                                <img src="../img/Lojas/loja2.jpg" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Cachoeirinha</h2>
                                    <p>(11)75847-2481</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="destaques-col">
                        <div class="box">
                            <div class="box-name">
                                Lojas
                            </div>

                            <div class="box-cover">
                                <img src="../img/Lojas/loja3.jpg" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Avenida Paulista</h2>
                                    <p>(11)75847-2481</p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="destaques-col">
                        <div class="box">
                            <div class="box-name">
                                Lojas
                            </div>

                            <div class="box-cover">
                                <img src="../img/Lojas/loja4.jpg" alt=""/>
                            </div>

                            <div class="box-detalhes">
                                <div class="box-detalhes-info">
                                    <h2>Freguesia do Ó</h2>
                                    <p>(11)75847-2481</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end  LOJAS -->

        <!-- start footer -->
        <footer class="footer">
            <div class="content">
                <div class="footer-col">
                    <h1>Links Úteis</h1>
                    <ul class="footer-col-links">
                        <li><a href="https://github.com/LohanYugue/Projeto-Integrador-III/tree/master/PetShower/web/jsp">GitHub</a></li>
                        <li><a href="https://www.sp.senac.br/jsp/default.jsp?newsID=0">Senac</a></li>
                    </ul>
                </div>



                <div class="footer-col">
                    <h1>Social</h1>
                    <ul class="footer-col-social">
                        <li><a href="#"><i class="fab fa-twitter"></i>Twiter</a></li>
                        <li><a href="#"><i class="fab fa-facebook-f"></i>Facebook</a></li>
                        <li><a href="#"><i class="fab fa-instagram"></i>Instagram</a></li>
                    </ul>
                </div>
            </div>
        </footer>

        <!-- end footer -->
    </body>
</html>
