package Herança.atividade4;

public class Piano extends InstrumentoMusical{
    @Override
    void tocar() {
        System.out.println("tocando piano");
    }

    @Override
    void afinar() {
        System.out.println("afinando piano");
    }
}
