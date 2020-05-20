package br.senac.sp.model;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private Date cliDataNasc;
    private String cliCpf;
    private String cliCidade;
    private String cliUf;
    private String cliTelefone;

    public Cliente() {

    }

    public Date getCliDataNasc() {
        return cliDataNasc;
    }

    public void setCliDataNasc(Date cliDataNasc) {
        this.cliDataNasc = cliDataNasc;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliUf() {
        return cliUf;
    }

    public void setCliUf(String cliUf) {
        this.cliUf = cliUf;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    @Override
    public String toString() {
        return "Cliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliEndereco = " + this.cliEndereco + "::cliCidade = " + this.cliCidade + "::cliUf = " + this.cliUf + "::cliTelefone = " + this.cliTelefone + "}";
    }

}
