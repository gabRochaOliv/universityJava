
package com.mycompany.umpoucodejava;

import com.mycompany.umpoucodejava.Gerente;
import com.mycompany.umpoucodejava.Funcionario;
import com.mycompany.umpoucodejava.Diarista;
import java.util.ArrayList;


public class Main {

 
    public static void main(String[] args) {
        
        Diarista diarista = new Diarista(); //<--- Erro (descobrir o porque)
        diarista.setCodigo(1);
        diarista.setNome("Maria");
        diarista.setSalarioDia(100.0);
        diarista.setDiasTrabalhados(15);

        Gerente gerente = new Gerente(); //<--- Erro (descobrir o porque)
        gerente.setCodigo(2);
        gerente.setNome("João");
        gerente.setSalarioMensal(5000.0);

        // Armazenando os objetos na estrutura de dados do tipo Funcionario (ArrayList)
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(diarista);
        funcionarios.add(gerente);

        // Chamando polimorficamente o método calcularSalario() para cada funcionário
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Código: " + funcionario.getCodigo());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println("------------------------------");
      
        
              
    }
    
}
}
