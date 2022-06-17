package com.garimp.garimp.models;

public class Produto {
    private int id;
    private int valor;
    private String tamanho;
    private String colecao;

    public Produto(int id, int valor, String tamanho, String colecao) {
        this.id = id;
        this.valor = valor;
        this.tamanho = tamanho;
        this.colecao = colecao;
    }

    public String getColecao() {
        return colecao;
    }

    public int getId() {
        return id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getValor() {
        return valor;
    }
}
