/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Lampada;

/**
 *
 * @author Gabriel
 */
public class LampadaMain {

    public static void main(String[] args) {
          Lampada lampada = new Lampada();
        
        System.out.println(lampada.mostrarEstado());
        lampada.ligar();
        
         System.out.println(lampada.mostrarEstado());
        
        
        
        

    }
    
}


