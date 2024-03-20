package Herança.atividade4;

public class Violao extends InstrumentoMusical{
    @Override
    void tocar() {
        System.out.println("tocando violao");

    }

    @Override
    void afinar() {
        System.out.println("afinando violao");
    }
}
