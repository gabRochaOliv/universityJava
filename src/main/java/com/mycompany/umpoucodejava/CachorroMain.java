
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Cachorro;


public class CachorroMain {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro("BOB", "Pudle");
        Cachorro c3 = new Cachorro("Jonas");
        
        System.out.println(c2.getNome() + " " + c2.getRaca());
        
        c2.latir();
        c2.latir();
        
        c2.latirRepetido(12);
        
    }
}
