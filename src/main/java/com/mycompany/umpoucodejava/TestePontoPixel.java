
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Ponto;
import com.mycompany.umpoucodejava.Pixel;

 class TestePontoPixel {

    public static void main(String[] args) {
        
        Ponto ponto1 = new Ponto();
        System.out.println("Ponto - Coordenadas: (" + ponto1.getX() + ", " + ponto1.getY() + ")");

        Ponto ponto2 = new Ponto(3, 5);
        System.out.println("Ponto - Coordenadas: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        
        Pixel pixel1 = new Pixel();
        System.out.println("Pixel - Coordenadas: (" + pixel1.getX() + ", " + pixel1.getY() + "), Cor: " + pixel1.getCor());

        Pixel pixel2 = new Pixel(7, 8);
        System.out.println("Pixel - Coordenadas: (" + pixel2.getX() + ", " + pixel2.getY() + "), Cor: " + pixel2.getCor());

        Pixel pixel3 = new Pixel(1, 2, "vermelha");
        System.out.println("Pixel - Coordenadas: (" + pixel3.getX() + ", " + pixel3.getY() + "), Cor: " + pixel3.getCor());
        
    }
 }
    

