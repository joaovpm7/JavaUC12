/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;



import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author sala302b
 */
public class Exercicio05 {
    
    public static void main(String[] args){
        
        String texto1 = "";
        String texto2 = "";
        String texto3 = "";
        int soma = 0;
     
        
      
        for (int i = 1; i < 2; i++){
            int dado = (int) (Math.random() * 6 + 1);
            int dado1 = (int) (Math.random() * 6 + 1);
            int dado2 = (int) (Math.random() * 6 + 1);
            
            texto1 = texto1 + dado + "\n";
            texto2 = texto2 + dado1 + "\n";
            texto3 = texto3 + dado2 + "\n";
            soma = dado + dado1 + dado2;
        }
       JOptionPane.showMessageDialog(null, texto1 + texto2 + texto3 + "Total = " + soma);
    } 
}
    
    

     
         
    

    

    
    
        

       
     


   
    
        
    
        
                                        
 
    

