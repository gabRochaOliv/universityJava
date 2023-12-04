/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;



/**
 *
 * @author Gabriel
 */
public class Gerente2 implements IFuncionario {
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public Gerente2(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    public double calcularSalario(){
        return salarioMensal + (0.10 * salarioMensal);
    }
    
}
