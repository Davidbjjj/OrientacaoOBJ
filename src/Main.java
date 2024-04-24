import Modelos.Filme;
import Modelos.Serie;
import Contador.Contar;

public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie();
        serie.setTipo("A Serie ");
        Filme filme= new Filme();
        filme.setTipo("O Filme ");



        filme.setNome("Harry Potter e o Prisioneiro de Azkaban");
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


        Contar contar=new Contar();
        contar.maratonar(serie);
        contar.maratonar(filme);
        System.out.println("tempo total em minutos para maratonar é de: "+contar.getTempo());

    }
}