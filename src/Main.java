public class Main {
    public static void main(String[] args) {

        Serie serie = new Serie();
        serie.setTipo("A Serie ");
        Filme filme= new Filme();
        filme.setTipo("O Filme ");


        filme.setNome("Harry Potter e o Prisioneiro de Azkaban");
        filme.setAnoLancamento(2004);
        filme.Descricao();

        serie.setNome("Dois Homens e Meio");
        serie.setAnoLancamento(2006);
        serie.setEpsodios(15);
        serie.setMinutos(30);
        serie.Descricao();
        System.out.println("Com duração de "+serie.calculoep(0));



    }
}