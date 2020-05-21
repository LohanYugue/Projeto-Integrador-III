package br.senac.sp.servicos;

import java.sql.SQLException;

public class ClienteException extends SQLException {

    public ClienteException(String message, Throwable e) {
        super(message, e);
    }
}
