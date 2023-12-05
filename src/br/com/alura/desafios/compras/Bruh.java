package br.com.alura.desafios.compras;

import java.util.ArrayList;

public class Bruh {

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(10.0);
        lista.add(10.0);
        lista.add(10.0);
 
        int size = lista.size();

        System.out.println(size);
        System.out.println();

        while (size != 0) {
            size--;
            System.out.println(lista.get(size));
        }
    }
   
    
    
}
