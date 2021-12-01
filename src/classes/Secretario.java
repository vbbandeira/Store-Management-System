/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author aluno
 */
public class Secretario extends Funcionario{

    @Override
    public double gratificacao() {
        double grana;
        
        grana = super.getSalario() + super.getBonus();
        
        return grana;    
    }
    
}
