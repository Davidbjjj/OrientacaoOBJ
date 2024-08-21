package Lista.Q10;

public class Pedido {
    private double numeroPedido;
    private String descricaoPedido;
    private double valorTotal;

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", descricaoPedido='" + descricaoPedido + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }

    public Pedido(double numeroPedido, String descricaoPedido, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoPedido = descricaoPedido;
        this.valorTotal = valorTotal;
    }
}
