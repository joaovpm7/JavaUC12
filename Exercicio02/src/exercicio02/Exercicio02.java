/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produto;
        double vproduto;
        
       produto= JOptionPane.showInputDialog("Digite o nome do produto: ");
       vproduto= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pruduto: "));
       
       if (vproduto>=50 && vproduto<=200){
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + produto +"\n" + "Valor original do produto: "+vproduto);
    }
    }
    
}
