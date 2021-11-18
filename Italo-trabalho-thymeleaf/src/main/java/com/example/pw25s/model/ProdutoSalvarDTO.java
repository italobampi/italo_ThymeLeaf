package com.example.pw25s.model;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public class ProdutoSalvarDTO {

    @NotBlank
    private String produtoNome;


    private BigDecimal valor;

    @NotBlank
    private String urlImagem;

    @NotBlank
    private String paisOrigem;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getNomeProduto() {
        return produtoNome;
    }

    public void setNome(String nomeProduto) {
        this.produtoNome = nomeProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public Produto toProduto(){
        Produto produto = new Produto();
        produto.setNome(produtoNome);
        produto.setValor(valor);
        produto.setUrlImagem(urlImagem);
        produto.setPaisOrigem(paisOrigem);
        return produto;
    }
}
