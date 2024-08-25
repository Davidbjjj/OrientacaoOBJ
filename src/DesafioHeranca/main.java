package DesafioHeranca;

import DesafioHeranca.Model.Carro;
import DesafioHeranca.Model.Civic;
import DesafioHeranca.Model.Ferrari;

public class main {
    public static void main(String[] args) {
        Carro carro=new Carro();
        System.out.println(carro.velociadadeatual());
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.velociadadeatual());
        carro.freiar();
        System.out.println(carro.velociadadeatual());
        Carro ferrari=new Ferrari();
        System.out.println(ferrari.velociadadeatual());
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.velociadadeatual());
        ferrari.freiar();
        System.out.println(ferrari.velociadadeatual());
        Carro civic=new Civic();
        civic.freiar();
        System.out.println(civic.velociadadeatual());
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.velociadadeatual());
    }
}
