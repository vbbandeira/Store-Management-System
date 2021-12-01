/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario implements Autenticavel{

    @Override
    public double gratificacao() {
        double grana;
        
        grana = super.getSalario() + super.getBonus();
        
        return grana;    
    }

    @Override
    public void autenticar() {
         JOptionPane.showMessageDialog(null, " " + super.getNome() + " autenticado com sucesso! \n");
    }

    
    
}
