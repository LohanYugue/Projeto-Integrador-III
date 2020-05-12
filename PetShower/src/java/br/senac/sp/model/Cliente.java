package br.senac.sp.model;

public class Cliente {

    private int idCliente;
    private String cliNome;
    private String cliRua;
    private String dataNascimento;
    private String cliCpf;
    private String cliBairro;
    private String cliCidade;
    private String cliUf;
    private String cliCep;
    private String cliTelefone;

    public Cliente(String dataNascimento, int idCliente, String cliNome, String cliRua, String cliCpf, String cliBairro, String cliCidade, String cliUf, String cliCep, String cliTelefone) {
        this.idCliente = idCliente;
        this.dataNascimento = dataNascimento;
        this.cliNome = cliNome;
        this.cliRua = cliRua;
        this.cliCpf = cliCpf;
        this.cliBairro = cliBairro;
        this.cliCidade = cliCidade;
        this.cliUf = cliUf;
        this.cliCep = cliCep;
        this.cliTelefone = cliTelefone;
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
        return cliRua;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliRua = cliEndereco;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
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

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public String getCliTelefone() {
        return cliTelefone;
    }

    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    @Override
    public String toString() {
        return "Cliente {" + "::idCliente = " + this.idCliente + "::cliNome = " + this.cliNome + "::cliEndereco = " + this.cliRua + "::cliBairro = " + this.cliBairro + "::cliCidade = " + this.cliCidade + "::cliUf = " + this.cliUf + "::cliCep = " + this.cliCep + "::cliTelefone = " + this.cliTelefone + "}";
    }

}
