package com.example;

import com.example.cartao.IOperadoraCartao;
import com.example.frete.FreteCorreio;
import com.example.frete.IFrete;

public class CarrinhoDeCompras {

    private static CarrinhoDeCompras instancia;
    private double total;

    private CarrinhoDeCompras(){}

    public static CarrinhoDeCompras Criar(){
        if(instancia == null){
            instancia = new CarrinhoDeCompras();
        }

        return instancia;
    }

    public void AddProduto(Produto prod){
        total += prod.getPreco();
    }

    public void Fechar(IFrete tipoFrete, IOperadoraCartao operadoraCartao){
        double frete = tipoFrete.calcula();
        System.out.println("Frete: " + frete);

        double total = frete + this.total;
        if(operadoraCartao.GeraTransacao(total)){
            System.out.println("Cartão aprovado! Valor da compra: " + total);
        }else {
            System.out.println("Compra rejeitada pela operadora!");
        }


    }
}
