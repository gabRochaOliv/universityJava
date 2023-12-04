/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;



/**
 *
 * @author Gabriel
 */
public class Pixel2 extends Ponto2{
    
    private String cor;
    
    String getCor(){
        return cor;
    }
    
    void setCor(String cor){
        this.cor = cor;
    }
    
    public Pixel2(){
        super();
        cor = "preto";
    }
    
    public Pixel2(int x, int y, String cor){
        super(x ,y);
        this.cor = cor;
    }
    
    
    
    
    
}
