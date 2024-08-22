package DesafioComposicao.model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Item> items = new ArrayList<>();

    public void adicinarCompra(Produto p,int quant){
        this.items.add(new Item(p,quant));
    }
    public void adicinarCompra(String nome,double preco,int quant){
        var produto=new Produto(nome,preco);
        this.items.add(new Item(produto,quant));
    }
    double obterValorTotal(){
        double total= 0;
      for(Item item:items){
          total=total+item.quantidade*item.produto.preco;
      }
        return total;
    }
}
