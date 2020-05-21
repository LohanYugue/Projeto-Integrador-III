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
        <link href="../css/CadastroCliente.css" rel="stylesheet">
       
        <title>Login</title>
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
        <fieldset class="fieldset-login ">
            <h1><center>Login</center></h1>
            <form action="Logint">

                <div class="form-group" >
                    <center>
                        <label for="nome">Login:</label> 
                        <input type="text" size="21" maxlength="25" class="form-control" placeholder="Insira seu Login" id="nome" name="cliNome">
                    </center> 
                </div>
                <div class="form-group">
                    <center>
                        <label for="nome">Senha: </label>
                        <input type="password" size="20" maxlength="25" class="form-control" placeholder="Insira sua senha" id="nome" name="cliNome">
                    </center>
                </div>
                <div>
                    <center>
                        <button type="submit" class="btnSalvar">Salvar</button>
                        <button type="reset" value="Reset" class="btnLimpar">Limpar</button>
                        <input type="button" value="Voltar" class="btnVoltar" onClick="history.go(-1)">
                    </center>
                </div>
            </form>
        </fieldset>
        <!-- end form -->
    </body>
</html>