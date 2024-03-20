package com.example.atividade1.Listas;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<String>();
        listaDeCompras.add("Banana");
        listaDeCompras.add("arroz");
        listaDeCompras.add("pao de forma");

        for (int i = 0; i < listaDeCompras.size(); i++) {
                System.out.println(listaDeCompras.get(i));
        }
        System.out.println("\nLista com o item removido:");
        listaDeCompras.remove("Banana");

         for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println(listaDeCompras.get(i));
        }
    }

}
