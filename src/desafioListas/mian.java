package desafioListas;

import java.util.Collections;
import java.util.Scanner;
import desafioListas.model.item;
import desafioListas.model.Cartao;

public class mian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite o limite do cartão");
        double limite = sc.nextDouble();
        sc.nextLine(); 
       Cartao cartao= new Cartao(limite);
     
     
        int sair=1;
        while (sair!=0) {
            System.out.println("Digite o Nome do Item:");
            String nome = sc.nextLine();
            System.out.println("Digite o Valor da compra");
            double valor = sc.nextDouble();
            item Item=new item(nome,valor);
            boolean CompraFeita=cartao.lancaCompra(Item);
            if (CompraFeita) {
            
                System.out.println("Compra Realizada");
                System.out.println("Para sair digite 0 e para ficar 1");
                sair=sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS:\n");
            Collections.sort(cartao.gItems());
            
            for (item i : cartao.gItems()) {
                System.out.println(" "+i.getNome()+" de valor: "+i.getValor());
                
            }
            System.out.println("\n***********************");

            System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
            
        
            

            
            
        }


    }

    
}
