/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemplo01;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class ProjetoExemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        JOptionPane.showMessageDialog(null, "primeiro numero digitado: " + n1);
        JOptionPane.showMessageDialog(null, "segundo numero digitado: " + n2);
        JOptionPane.showMessageDialog(null, "A soma dos numeros: " + (n1+n2));
        
    }
    
}
