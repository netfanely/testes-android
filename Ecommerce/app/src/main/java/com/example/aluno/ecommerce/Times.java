package com.example.aluno.ecommerce;

import java.io.Serializable;

/**
 * Created by axel on 02/02/19.
 */

public class Times implements Serializable {

    private String nome;
    private String subnome;
    private String preco;
    private int imagem;

    public Times(){

    }

    public Times(String nome, String subnome, String preco, int imagem){
        this.nome = nome;
        this.subnome = subnome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubnome() { return subnome; }

    public void setSubnome(String subnome) { this.subnome = subnome; }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getPreco() { return preco; }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}

