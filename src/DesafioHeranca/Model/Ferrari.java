package DesafioHeranca.Model;

public class Ferrari extends Carro{
    @Override
    public void acelerar() {
        velociade+=40;
    }

    @Override
    public void freiar() {
        velociade-=40;

    }
}
