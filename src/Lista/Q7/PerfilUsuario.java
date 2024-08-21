package Lista.Q7;

public class PerfilUsuario {
    private String nomeUsuario;
    private String bio;
    private int numero;

    @Override
    public String toString() {
        return "PerfilUsuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", bio='" + bio + '\'' +
                ", numero=" + numero +
                '}';
    }

    public PerfilUsuario(String nomeUsuario, String bio, int numero) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numero = numero;
    }
}
