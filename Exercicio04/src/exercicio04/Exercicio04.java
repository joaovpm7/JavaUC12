/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class Exercicio04 {
    
     public static void main(String[] args)
     {
           
       int num,cont = 0, result;
       String resp = "";
       
       num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para gerar a tabuada: "));
       
       for (int x = 1; x <= 10; x++){
           result = num * ++cont;
           resp = resp + num + " x " + cont + " = " + result + "\n";
           
    }
       JOptionPane.showMessageDialog(null,resp);
  }
}

    
