package DesafioComida.Model;

public class pessoa {
    private String nome;
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comer(comida Comida){
        if (Comida!=null){
            this.peso+= Comida.getPeso();
        }
    }
}
