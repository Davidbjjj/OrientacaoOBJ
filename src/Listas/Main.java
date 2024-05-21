package Listas;

import Modelos.Filme;
import Modelos.Serie;
import Contador.Contar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie("Dois Homens e Meio",2006);
        serie.setTipo("A Serie ");
        Filme filme= new Filme("Harry Potter e o Prisioneiro de Azkaban",2004);
        filme.setTipo("O Filme ");
        Filme filme2= new Filme("Meninas malvadas",2004);
        filme2.setTipo("O Filme ");

        filme.setDuracaoMininutos(150);
        filme.Descricao();
        System.out.println("Duração do filme: " + filme.getDuracaoMininutos());



        serie.setEpsodios(15);
        serie.setMinutos(30);
        serie.setTempora(2);
        serie.Descricao();
        System.out.println("Duração a série: " + serie.getDuracaoMininutos());
        System.out.println();


        filme2.setDuracaoMininutos(90);
        filme2.Descricao();
        System.out.println("Duração do filme: " + filme2.getDuracaoMininutos());


        Contar contar=new Contar();
        contar.maratonar(serie);
        contar.maratonar(filme);
        System.out.println("tempo total em minutos para maratonar é de: "+contar.getTempo());


        ArrayList<Filme>listaDeFilmes=new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}