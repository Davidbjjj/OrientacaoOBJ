package Modelos;

public class Titulo {

    private String nome;

    private  int anoLancamento;

    private int duracaoMininutos;

    public int getDuracaoMininutos() {
        return duracaoMininutos;
    }

    public void setDuracaoMininutos(int duracaoMininutos) {
        this.duracaoMininutos = duracaoMininutos;
    }

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

    private String tipo;


    public void setTipo(String tipo){

        this.tipo=tipo;

    }


    public String getTipo(){

        return tipo;

    }


    public void Descricao(){

        System.out.println(getTipo()+getNome()+", foi lançado no ano de "+getAnoLancamento());

    }


}
