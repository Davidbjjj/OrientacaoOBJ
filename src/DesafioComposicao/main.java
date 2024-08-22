package DesafioComposicao;

import DesafioComposicao.model.Cliente;
import DesafioComposicao.model.Compra;
import DesafioComposicao.model.Produto;

public class main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("David Pontes");
        Compra compra = new Compra();
        Compra compra2= new Compra();
        compra.adicinarCompra("Bolacha",5,2);
        compra.adicinarCompra(new Produto("Boneco do Ben 10",60),2);
        compra2.adicinarCompra("Biscoito",3,4);
        compra2.adicinarCompra(new Produto("Coxa de Frango",30),2);
        cliente.adcionarCompra(compra);
        cliente.adcionarCompra(compra2);
        System.out.println(cliente.ObtervalorTotal());

    }

}
