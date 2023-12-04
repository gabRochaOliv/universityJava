/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Conta;
import com.mycompany.umpoucodejava.Banco;

/**
 *
 * @author Gabriel
 */
public class ContaBancoMain {
    
        public static void main(String[] args) {
        Conta minhaConta = new Conta(1000);

        try {
            minhaConta.sacar(1200); // Tenta sacar um valor maior que o saldo
        } catch (Banco e) {
            // Captura e trata a exceção ContaExcecao
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
    

