
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Funcionario;


public class Gerente extends Funcionario {
    
    private Double salarioMensal;

    public Gerente(Integer codigo, String nome) {
        super(codigo, nome);
    }


    /*public Gerente(Integer codigo, String nome, Double salarioMensal) {
        super(codigo, nome);
        this.salarioMensal = salarioMensal;
    }

 */
    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public Double calcularSalario()
    {
        return salarioMensal = (salarioMensal * 0.10);
    }
    
}
