
package com.mycompany.umpoucodejava;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Questao2 {
    
    public static void main(String [] args)
    {
        try{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
         System.out.println("Informe o primeiro valor: ");
         int x = teclado.nextInt();
          System.out.println("Informe o segundo valor: ");
         int y = teclado.nextInt();
         double resultado = x / y;
         System.out.println("O resultado eh: " + resultado);
        }
        catch(InputMismatchException e)
        {
             System.out.println("Voce digitou uma String! ");
        
        }
        catch(ArithmeticException e)
        {
             System.out.println("Ocorreu um erro! Verifique se o valor que digitou eh diferente de 0");
        
        }
    }
    
}
