package Lista.Q9;

public class Paciente {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }

    private String diagnostico;

    public Paciente(String nome, int idade, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
    }
}
