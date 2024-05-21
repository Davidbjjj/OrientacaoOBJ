package Listas;

import Modelos.Filme;
import Modelos.Serie;
import Contador.Contar;
import Modelos.Titulo;

import java.util.ArrayList;

public class PrincipalList {
    public static void main(String[] args) {
        Filme filme = new Filme("O poderoso chefão", 1970);

        Filme filme2 = new Filme("Avatar", 2023);

        Serie lost = new Serie("Lost", 2000);
        ArrayList<Titulo> lista=new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(lost);
        for (Titulo item:lista){
            System.out.println(item.getNome());
        }
    }
}
