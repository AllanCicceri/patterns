package com.example;

import com.example.cartao.Master;
import com.example.frete.FreteCorreio;

/**
 * App java puro para testar os padrões de projeto:
 * Singleton, Strategy e Facade
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Abrindo carrinho singleton" );
        CarrinhoDeCompras carrinho = CarrinhoDeCompras.Criar();


        Produto prod1 = new Produto("Mesa", 50.2, 150.0);
        Produto prod2 = new Produto("Cadeira", 10.5, 250.0);
        System.out.println( "Adiciona produtos no carrinho" );
        carrinho.AddProduto(prod1);
        carrinho.AddProduto(prod2);

        //Executa método Fecha() que serve de facade, simplificando calculo de frete do correio e transação da operadora
        carrinho.Fechar(new FreteCorreio(), new Master());

    }
}
