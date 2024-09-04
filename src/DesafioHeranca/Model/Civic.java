package DesafioHeranca.Model;

public class Civic extends Carro{

    public Civic(){
        super(100);
    }

    @Override
    public void acelerar() {
        velociade+=10;

    }

    @Override
    public void freiar() {
        velociade-=5;
        super.freiar();
    }
}
