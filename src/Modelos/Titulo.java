package Modelos;

import ListaFilmesAPI.Models.TituloOMDB;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    private  int anoLancamento;

    private int duracaoMininutos;

    public Titulo(String nome, int anoLancamento){
        this.nome = nome;

        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOMDB meuTituloOM) {
        this.nome=meuTituloOM.title();
        this.anoLancamento=Integer.valueOf(meuTituloOM.year());
        this.duracaoMininutos=Integer.valueOf((meuTituloOM.runtime().substring(0,2)));
    }


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

    @Override
    public String toString() {
        return "O titulo é "+nome+", o ano de lancamento foi "+anoLancamento+"e o tempo do filme em minutos foi: "+duracaoMininutos;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }
}
