public class Serie extends Titulo {

private int epsodios;

private int minutos;

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

   public int calculoep(int epmin){
        epmin=getMinutos()*getEpsodios();

        return epmin;
   }
}
