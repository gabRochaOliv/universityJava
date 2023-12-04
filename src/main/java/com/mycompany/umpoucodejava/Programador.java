/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.IFuncionario;


/**
 *
 * @author Gabriel
 */
public class Programador implements IFuncionario, Teste{
    
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public Programador(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    
    public double calcularSalario(){
        return salarioMensal;
    }
}
