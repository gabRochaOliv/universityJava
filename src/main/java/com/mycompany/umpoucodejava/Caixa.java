
package com.mycompany.umpoucodejava;

class Caixa {
    
    Double altura;
    Double largura;
    Double profundidade;
    
    
    Caixa()
    {
        altura = 0.0;
        largura = 0.0;
        profundidade = 0.0;
        
    }
    
    Caixa(Double altura, Double largura, Double profundidade)
    {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        
    }
    
    Double calcularVolume()
    {
        Double volume = altura * profundidade * largura;
        return volume;
    }
   
}
