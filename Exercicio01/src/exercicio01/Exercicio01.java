/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EXERCICIO3
        
        //double mvalor,per;
        //per= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor percentual: "));
        //mvalor= Double.parseDouble(JOptionPane.showInputDialog("Digite o maior valor: "));
        //JOptionPane.showMessageDialog(null, "Valor do imposto: " + (mvalor*per/100));
        
        //com if
        double m1,p2,mvalor,per;
        m1= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do mercado: "));
        p2= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prefeitura: "));
        per= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor percentual: "));
        
        if (m1 >= p2){
            JOptionPane.showMessageDialog(null, "O maior valor é do mercado: "+m1);
            JOptionPane.showMessageDialog(null,"Valor do imposto: " + (m1*per/100));
        } else if (p2 >= m1) {
            JOptionPane.showMessageDialog(null,"O maior valor é da prefeitura: "+p2);
            JOptionPane.showMessageDialog(null,"Valor do imposto: " + (p2*per/100));
        }          
    }
}
    
