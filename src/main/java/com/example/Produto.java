package com.example;

public class Produto {
    private String nome;
    private double peso;
    private double preco;

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
