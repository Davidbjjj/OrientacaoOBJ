package Modelos;

public class Serie extends Titulo {
    public Serie(String nome, int ano){
        super(nome,ano);

    }

private int epsodios;

private int minutos;

private int tempora;



    public int getTemporas(){
        return tempora;
    }

    public void setTempora(int tempora){
        this.tempora=tempora;

    }

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


    @Override
   public int getDuracaoMininutos(){
        return epsodios*minutos*tempora;
   }

   @Override
    public void Descricao(){

        System.out.println(getTipo()+getNome()+", foi lançada no ano de "+getAnoLancamento());

    }
}
