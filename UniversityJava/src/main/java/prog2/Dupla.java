/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2;

/**
 *
 * @author Gabriel
 */
public class Dupla {
    
    Aluno aluno1;
    Aluno aluno2;
    
    Dupla(Aluno aluno1, Aluno aluno2)
    {
    this.aluno1 = aluno1;
    this.aluno2 = aluno2;
    }
    
    Dupla()
    {
        aluno1 = new Aluno();
        aluno2 = new Aluno();
    }
    
    void mostrarAluno()
    {
        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
        
    }
}


