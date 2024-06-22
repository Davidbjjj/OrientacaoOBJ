package desafioListas.model;

public class item implements Comparable<item> {

    private String nome;
    private double valor;

    public item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    //sobre escrita da classe, sempre quando ela é chamada, ela vai responder do jeito abaixo
    @Override
    public String toString() {
        
        return "Compra:Descrição: "+nome+"valor: "+valor;
    }


    @Override
    public int compareTo(item OutroItem){
        return Double.valueOf(this.valor).compareTo(Double.valueOf(OutroItem.valor));
    }
}
