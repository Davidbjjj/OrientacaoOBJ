package desafioListas.model;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    //declarando uma lista do tipo classe <item> chamado "items"
    private List<item> items;

    //Aqui a variavel limite vai ser coloca na main, porque esse valor vai ser apenas trabalhado na lógica
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


    //essa lógica vai diferenciar o valor de saldo e limite, pois se o saldo>que o valor do item, vai se subtrair o valor do saldo
   public boolean lancaCompra(item Item){
    if (this.saldo> Item.getValor()) {
        this.saldo-=Item.getValor();
        //após subtrair o valor do item, vai adicionar esse Item a Lista de items
        this.items.add(Item);
        return true;
        
    }
    return false;
   }
   //torna publica a Lista<item> com o nome gItems
   public List<item>gItems(){
    return items;
   }
}