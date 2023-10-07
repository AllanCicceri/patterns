package com.example.cartao;

public class Master implements IOperadoraCartao{
    @Override
    public boolean GeraTransacao(double valor) {
        if(valor > 0){
            return true;
        }
        return false;
    }
}
