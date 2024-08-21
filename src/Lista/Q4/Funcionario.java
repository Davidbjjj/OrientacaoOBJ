package Lista.Q4;

public class Funcionario {
    private String Nome;
    private String Departamento;
    private double Salario;

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome='" + Nome + '\'' +
                ", Departamento='" + Departamento + '\'' +
                ", Salario=" + Salario +
                '}';
    }

    public Funcionario(String nome, String departamento, double salario) {
        this.Nome = nome;
        this.Departamento = departamento;
        this.Salario = salario;
    }
}
