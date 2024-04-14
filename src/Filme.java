public class Filme {

    private String nome;

    private  int anoLancamento;


    Filme(String Nome, int AnoLancamento){

        this.nome= Nome;
        this.anoLancamento=AnoLancamento;

    }


  private String getnome(){

        return nome;

    }


    public  String setnome(){

       return nome;

    }


    void DescricaoFilme(){

        System.out.println("O filme "+nome+" foi lançado no ano de "+anoLancamento);

    }


}

