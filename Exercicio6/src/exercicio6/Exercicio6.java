
package exercicio6;

import javax.swing.JOptionPane;


public class Exercicio6 {
    public static void main(String[] args){
        double prod = 1;
        String texto = "";
        
        while (prod!=0){
            prod = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
            
            if(prod == 0){
              JOptionPane.showMessageDialog(null, "Programa será encerrado!");
              break;
            }
            JOptionPane.showMessageDialog(null, "O valor com acrecimo é R$: " + prod*1.12 + "\n" + "Valor arrendondado: " + Math.round(prod));
        }
    }
}
   

    
    

        
       
   
  
 
    
             

            
        
                
                
        
    
   
