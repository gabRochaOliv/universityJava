/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Banco;

/**
 *
 * @author Gabriel
 */


public class Conta{
    private double saldo;

    // Construtor
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) throws Banco {
        if (valor > saldo) {
            // Lança a exceção se o saldo for inferior ao valor sacado
            throw new Banco("Saldo insuficiente. Saldo atual: " + saldo);
        } else {
            // Caso contrário, realiza o saque e atualiza o saldo
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
        }
    }

    // Método para obter o saldo atual
    public double getSaldo() {
        return saldo;
    }
}



