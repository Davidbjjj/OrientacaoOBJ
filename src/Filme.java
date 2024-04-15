public class Filme {

    private String nome;

    private  int anoLancamento;


    public String getNome(){

        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }


    public int getAnoLancamento(){

        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){

        this.anoLancamento = anoLancamento;
    
    }


    public void DescricaoFilme(){

        System.out.println("O filme "+getNome()+", foi lançado no ano de "+getAnoLancamento());

    }


}

