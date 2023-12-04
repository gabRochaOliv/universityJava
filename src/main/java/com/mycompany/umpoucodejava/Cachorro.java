
package com.mycompany.umpoucodejava;

public class Cachorro {
    
    private String raca;
    private String nome;
    
    public Cachorro()
    {
        
    }
    
    public Cachorro(String nome)
    {
        this.nome = nome;
        this.raca = "indeterminada";
        
    }
    
    public Cachorro(String nome, String raca)
    {
        this.nome = nome;
        this.raca = raca;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setRaca(String raca)
    {
        this.raca = raca;
    }
    
    public String getRaca()
    {
        return raca;
    }
    
    public void latir()
    {
        System.out.println("auau");
    }
    
    public void latirRepetido(Integer vezes)
    {
        if(vezes < 0)
        {
            System.out.println("Bugou");
        }
        else if(vezes > 100){
            System.out.println("Invalido");
            
        }
        else{
            for(int i = 0; i < vezes; i++ )
            {
                System.out.println("auau");
                
            }
            System.out.println();
        }
    }
}
