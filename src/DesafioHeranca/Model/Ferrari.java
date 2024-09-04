package DesafioHeranca.Model;

public class Ferrari extends Carro{

    public Ferrari(){
        super(220);
    }
    @Override
    public void acelerar() {
        velociade+=40;
    }

    @Override
    public void freiar() {
        velociade-=40;

    }
}
