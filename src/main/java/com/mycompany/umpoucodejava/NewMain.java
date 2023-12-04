/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.umpoucodejava;
import com.mycompany.umpoucodejava.IFuncionario;
import com.mycompany.umpoucodejava.Gerente2;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class NewMain {
    public static void main(String[] args) {
       IFuncionario i1 = new Programador(234.00);
       IFuncionario i2 = new Programador(234.00);
       IFuncionario i3 = new Programador(234.00);
       IFuncionario i4 = new Programador(234.00);
       IFuncionario g1 = new Gerente2(234.00);
       IFuncionario g2 = new Gerente2(234.00);
       IFuncionario g3 = new Gerente2(234.00); 
       IFuncionario g4 = new Gerente2(234.00);
       
       ArrayList<IFuncionario>empregados = new ArrayList();
       
       empregados.add(i1);
       empregados.add(i2);
       empregados.add(i3);
       empregados.add(i4);
       empregados.add(g1);
       empregados.add(g2);
       empregados.add(g3);
       empregados.add(g4);
       
       for(IFuncionario f : empregados){
           
           System.out.println("Salario Mensal: " + f.calcularSalario());
       }
    }
    
}
