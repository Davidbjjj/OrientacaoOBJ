package Contador;
import Modelos.Titulo;

public class Contar {
    private int tempo;

    public int getTempo(){
        return this.tempo;
    }

    public void maratonar(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        this.tempo+=titulo.getDuracaoMininutos();

    }
}
