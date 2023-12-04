/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;



/**
 *
 * @author Gabriel
 */
public class Circle extends Ponto2 {
    private double raio;
    
    double getRaio(){
        return raio;
    }
    
    void setRaio(double raio){
        this.raio = raio;
    }
    
    public Circle(){
        super();
        raio = 1;
    }
    
    public Circle(double raio, int x, int y){
        super(x, y);
        this.raio = raio;
    }
   
    
    
}

    
