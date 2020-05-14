package br.senac.sp.model;

import java.util.Date;

public class Produto {

    private int idProduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;
    private Date proDataCadastro;
    
    public Produto(){
        
    }

    public Produto(int idProduto, String proNome, Double proValor, int proEstoque,Date proDataCadastro) {
        this.idProduto = idProduto;
        this.proNome = proNome;
        this.proValor = proValor;
        this.proEstoque = proEstoque;
        this.proDataCadastro = proDataCadastro;
    }

    public Date getProDataCadastro() {
        return proDataCadastro;
    }

    public void setProDataCadastro(Date proDataCadastro) {
        this.proDataCadastro = proDataCadastro;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

}
