package DesafioHeranca.Model;

public class Civic extends Carro{
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
