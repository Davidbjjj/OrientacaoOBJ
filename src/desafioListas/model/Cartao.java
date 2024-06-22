package desafioListas.model;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<item> items;

    
    public Cartao(double limite) {
        this.limite = limite;
        this.saldo=limite;
        this.items=new ArrayList<>();

    }

    public double getLimite() {
        return limite;
    }


    public double getSaldo() {
        return saldo;
    }


    
   public boolean lancaCompra(item Item){
    if (this.saldo> Item.getValor()) {
        this.saldo-=Item.getValor();
     
        this.items.add(Item);
        return true;
        
    }
    return false;
   }

   public List<item>gItems(){
    return items;
   }
}