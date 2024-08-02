package DesafioComida;

import DesafioComida.Model.comida;
import DesafioComida.Model.pessoa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        pessoa Pessoa =new pessoa();
        comida Comida=new comida();
        System.out.println("Digite o nome da pessoa");
        Pessoa.setNome(sc.nextLine());
        System.out.println("Digite o peso da pessoa");
        Pessoa.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Para comer, digite o nome da comida");
        Comida.setNome(sc.nextLine());
        System.out.println("Digite o peso da comida");
        Comida.setPeso(sc.nextDouble());
        Pessoa.comer(Comida);
        System.out.println(Pessoa.getNome()+" ficou com "+Pessoa.getPeso()+" após comer "+Comida.getNome());

    }
}
