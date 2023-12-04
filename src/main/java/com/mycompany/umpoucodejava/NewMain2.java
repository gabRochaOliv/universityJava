/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.umpoucodejava;


import com.mycompany.umpoucodejava.Circle;

/**
 *
 * @author Gabriel
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pixel p = new Pixel(1, 2, "verde");
        Circle c = new Circle(1, 2, 4);
        
        System.out.println(p.getX() + p.getY());
        System.out.println(p.getCor());
        System.out.println(c.getRaio());
    }
}
