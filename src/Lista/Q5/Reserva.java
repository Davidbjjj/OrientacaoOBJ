package Lista.Q5;

public class Reserva {
    private String nomeHospede;
    private String quarto;
    private int numeroNoites;

    @Override
    public String toString() {
        return "Reserva{" +
                "nomeHospede='" + nomeHospede + '\'' +
                ", quarto='" + quarto + '\'' +
                ", numeroNoites=" + numeroNoites +
                '}';
    }

    public Reserva(String nomeHospede, String quarto, int numeroNoites) {
        this.nomeHospede = nomeHospede;
        this.quarto = quarto;
        this.numeroNoites = numeroNoites;
    }
}
