package DesafioHeranca.Model;

public class Carro {
    int velociade=0;
    final int VELOCIDADEMAXIMA; 
    
    public Carro(int velocidademaxima){
        VELOCIDADEMAXIMA= velocidademaxima;
        
    }

    public int velociadadeatual(){
        return velociade;
    }
    public  void acelerar(){
        velociade+=5;

    }
    public void freiar(){

        if(velociade<=0){
            System.out.println("A não tem como mais freiar");
            velociade=0;
        }
        else {
            velociade-=5;
        }
    }
}
