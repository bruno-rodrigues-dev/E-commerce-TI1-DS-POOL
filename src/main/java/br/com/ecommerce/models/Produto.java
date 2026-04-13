package br.com.ecommerce.models;

public class Produto {
    private double valor;
    private String nome;
    private String descricao;
    private String imagem;

    public Produto(double valor, String nome, String descricao, String imagem) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }
}


