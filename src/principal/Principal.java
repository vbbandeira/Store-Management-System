/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("Pedro");
        
        Gerente g = new Gerente();
        g.setNome("Vinícius");
        g.setSalario(6000.00);
        g.setBonus(1000.00);
        
        Secretario s = new Secretario();
        s.setNome("João");
        s.setSalario(4500.00);
        s.setBonus(850.00);
        
        Diretor d = new Diretor();
        d.setNome("Bandeira");
        d.setSalario(8000.00);
         
        imprimirGratificacao(g);
        imprimirGratificacao(s);
        
        efetuarAutenticacao(c);
        efetuarAutenticacao(g);
        
    }
    
    public static void imprimirGratificacao(Funcionario f){
        
        JOptionPane.showMessageDialog(null, "Nome: " + f.getNome()
                + "\nSalário + gratificação: " + f.gratificacao());     
    }
   
    
    public static void efetuarAutenticacao(Autenticavel a){
        
        
        a.autenticar();
    }
}
