package Modelos;

public class Filme extends Titulo {

    @Override
    public String toString() {
        return "Filme:"+this.getNome()+"\n";
    }
}