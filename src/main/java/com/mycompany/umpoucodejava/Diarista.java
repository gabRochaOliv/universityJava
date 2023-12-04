
package com.mycompany.umpoucodejava;




public class Diarista extends Funcionario
{
    
    private Double salarioDia;
    private Integer diasTrabalhados;

    public Diarista(Integer codigo, String nome) {
        super(codigo, nome);
    }
    
    /*public Diarista(Double salarioDia, Integer diasTrabalhados, Integer codigo, String nome)
    {
        super(codigo, nome);
        this.diasTrabalhados = diasTrabalhados;
        this.salarioDia = salarioDia;
    }
*/

    public Double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(Double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(Integer horasTrabalhadas) {
        this.diasTrabalhados = horasTrabalhadas;
    }
    
    @Override
    public Double calcularSalario()
    {
        return salarioDia * diasTrabalhados;
    }


    
    
    
    
}
