/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;

/**
 *
 * @author Gabriel
 */

public class Lampada {
    
    boolean acesa;
    
    
    Lampada()
    {
        acesa = false;
          
    }
    
    void ligar()
    {
        acesa = true;
    }
    
    void desligar()
    {
        acesa = false;
    }
    
    String mostrarEstado()
    {
        if(acesa == true)
        {
            return "Ligado";
        }
        else
        {
            return "Desligado";
        }
    }
}
    
    

