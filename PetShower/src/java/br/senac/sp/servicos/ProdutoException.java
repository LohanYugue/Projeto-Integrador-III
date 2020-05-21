package br.senac.sp.servicos;

import java.sql.SQLException;

public class ProdutoException extends SQLException {

    public ProdutoException(String message, Throwable e) {
        super(message, e);
    }

}
