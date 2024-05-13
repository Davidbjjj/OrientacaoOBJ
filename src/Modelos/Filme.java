package Modelos;

public class Filme extends Titulo {

    @Override
    public String toString() {
        return "Filme:"+this.getNome()+"\n";
    }

    public Filme(String nome){
        
        this.setNome(nome);
    }
    public Filme(){
        
    }
}