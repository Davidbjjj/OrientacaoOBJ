package Lista.Q3;

public class Produto {
    private String Nome;
    private double Preco;
    private String Categoria;

    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + Nome + '\'' +
                ", Preco=" + Preco +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }

    public Produto(String nome, double preco, String categoria) {
        this.Nome = nome;
        this.Preco = preco;
        this.Categoria = categoria;
    }
}
