package Modelos;

public class Filme extends Titulo {
    public Filme(String nome, int anoLancamento){
super(nome, anoLancamento);
    }   

    @Override
    public String toString() {
        return "Filme:"+this.getNome()+"\n"+"Ano de Lançamento:"+this.getAnoLancamento()+"\n";
    }

    public Filme(String nome){
        
        this.setNome(nome);
    }
    public Filme(){
        
    }
}