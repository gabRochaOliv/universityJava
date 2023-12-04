package com.mycompany.umpoucodejava;

public class Excecao {

    public static void main(String argos[]) {
        try {

            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excecao capturada: " + e);
        }

    }

    static void metodo1() {
        metodo2();
    }

    static void metodo2() {
        try {

            int vetor[] = new int[10];
            for (int i = 0; i < 15; i++) {
                vetor[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excecao capturada em metodo2: " + e);
        }
    }
}
