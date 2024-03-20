package com.example.atividade1.Listas;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        System.out.println(lista);
        // imprimindo os numeros separadamente

        for (int i = 0; i < 5; i++) {
            System.out.println(lista.get(i));
        }
    }
}
