package Lista.Q2;

public class Aluno {
    private String Nome;
    private int Ano;
    private String Serie;

    public Aluno(String nome, int ano, String serie) {
        this.Nome = nome;
        this.Ano = ano;
        this.Serie = serie;
    }

    @Override
    public String toString() {
        return "Nome: "+Nome+", Ano: "+Serie;
    }
}
