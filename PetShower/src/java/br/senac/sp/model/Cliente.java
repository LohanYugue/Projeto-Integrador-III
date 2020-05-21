package br.senac.sp.model;

import java.util.Date;

public class Cliente {

    private int cli_id;
    private String cli_nome;
    private String cli_cpf;
    private Date cli_dataNascimento;
    private String cli_rua;
    private String cli_cidade;
    private String cli_uf;
    private String cli_telefone;

    public Cliente() {
    }
    

    public Cliente(int cli_id, String cli_nome, String cli_cpf, Date cli_dataNascimento, String cli_rua, String cli_cidade, String cli_uf, String cli_telefone) {
        this.cli_id = cli_id;
        this.cli_nome = cli_nome;
        this.cli_cpf = cli_cpf;
        this.cli_dataNascimento = cli_dataNascimento;
        this.cli_rua = cli_rua;
        this.cli_cidade = cli_cidade;
        this.cli_uf = cli_uf;
        this.cli_telefone = cli_telefone;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_nome() {
        return cli_nome;
    }

    public void setCli_nome(String cli_nome) {
        this.cli_nome = cli_nome;
    }

    public String getCli_cpf() {
        return cli_cpf;
    }

    public void setCli_cpf(String cli_cpf) {
        this.cli_cpf = cli_cpf;
    }

    public Date getCli_dataNascimento() {
        return cli_dataNascimento;
    }

    public void setCli_dataNascimento(Date cli_dataNascimento) {
        this.cli_dataNascimento = cli_dataNascimento;
    }

    public String getCli_rua() {
        return cli_rua;
    }

    public void setCli_rua(String cli_rua) {
        this.cli_rua = cli_rua;
    }

    public String getCli_cidade() {
        return cli_cidade;
    }

    public void setCli_cidade(String cli_cidade) {
        this.cli_cidade = cli_cidade;
    }

    public String getCli_uf() {
        return cli_uf;
    }

    public void setCli_uf(String cli_uf) {
        this.cli_uf = cli_uf;
    }

    public String getCli_telefone() {
        return cli_telefone;
    }

    public void setCli_telefone(String cli_telefone) {
        this.cli_telefone = cli_telefone;
    }
    

    

    

}
