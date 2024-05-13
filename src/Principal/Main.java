import Modelos.Filme;
import Modelos.Serie;
import Contador.Contar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie();
        serie.setTipo("A Serie ");
        Filme filme= new Filme("Harry Potter e o Prisioneiro de Azkaban");
        filme.setTipo("O Filme ");
        Filme filme2= new Filme("Meninas malvadas");
        filme2.setTipo("O Filme ");
 

        filme.setAnoLancamento(2004);
        filme.setDuracaoMininutos(150);
        filme.Descricao();
        System.out.println("Duração do filme: " + filme.getDuracaoMininutos());


        serie.setNome("Dois Homens e Meio");
        serie.setAnoLancamento(2006);
        serie.setEpsodios(15);
        serie.setMinutos(30);
        serie.setTempora(2);
        serie.Descricao();
        System.out.println("Duração a série: " + serie.getDuracaoMininutos());
        System.out.println();


        filme2.setAnoLancamento(2004);
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