
package com.mycompany.umpoucodejava;


public class Generico <T extends Number, V extends T> {
    
    private T x;
    private V y;
    
    public Generico(T o, V i)
    {
        this.x = o;
        this.y = i;
    }   
    
}
