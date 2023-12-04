
package com.mycompany.umpoucodejava;




public class Pixel extends Ponto
{
    private String cor;

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
    // Construtor vazio, inicializa x e y com zero e cor como "preta"
    public Pixel()
    {
        super();
        this.cor = "preta";
        
    }
    
    //um construtor que recebe os valores para x e y apenas, e deixa a cor padrão "preta"
    public Pixel(Integer x,Integer y)
    {
        super(x,y);
        this.cor = "preta";
        
    }
    
    //outro que recebe x, y e a cor.
    public Pixel(Integer x, Integer y, String cor)
    {
        super(x,y);
        this.cor = cor;
    }
    


    /**
     *
     */

  
    public void exibirInformacoes()
    {
        System.out.println("Pixel - Cordenada: " + getX() + " " + getY() + " " + "Cor: " + cor);
    }
    
    
    
}
