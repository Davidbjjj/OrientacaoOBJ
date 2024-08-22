package DesafioComposicao.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
     String nome;
     public List<Compra>compras=new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    public void adcionarCompra(Compra compra){
        this.compras.add(compra);
    }
    public double ObtervalorTotal(){
    double total=0;
    for (Compra compra:compras){
        total=total+compra.obterValorTotal();
    }
    return total;
    }
}
