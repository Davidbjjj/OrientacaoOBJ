package Listas;

import Modelos.Filme;
import Modelos.Serie;
import Contador.Contar;
import Modelos.Titulo;

import java.util.ArrayList;

public class PrincipalList {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chef", 1970);

        Filme filme3 = new Filme("Avatar", 2023);

        Serie lost = new Serie("Lost", 2000);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item:lista) {
            System.out.println(item);

        }
    }
}
