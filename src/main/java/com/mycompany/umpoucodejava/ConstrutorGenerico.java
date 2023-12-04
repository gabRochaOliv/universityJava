
package com.mycompany.umpoucodejava;


public class ConstrutorGenerico {
    
    int soma;
    
  public <T extends Number> ConstrutorGenerico(T o)
    {
        soma = 0; 
    }
    
}
