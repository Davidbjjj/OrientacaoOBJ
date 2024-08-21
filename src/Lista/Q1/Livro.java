package Lista.Q1;

import Modelos.Titulo;

public class Livro {
    private String Titulo;
    private String Autor;
    private int AnoPublicado;

    public Livro(String titulo, String autor, int anoPublicado){

        this.Titulo=titulo;
        this.Autor=autor;
        this.AnoPublicado=anoPublicado;

    }

    @Override
    public String toString() {
        return "Titulo: "+Titulo+", autor: "+Autor+", Ano de Lançamento: "+AnoPublicado;
    }
}
