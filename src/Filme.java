public class Filme {

    private String nome;

    private  int anoLancamento;

    private String getnome(){

        return nome;

    }


    public  String setnome(){

       return nome;

    }

    Filme(String Nome, int AnoLancamento){

        this.nome= Nome;
        this.anoLancamento=AnoLancamento;

    }


    public void DescricaoFilme(){

        System.out.println("O filme "+nome+", foi lançado no ano de "+anoLancamento);

    }


}

