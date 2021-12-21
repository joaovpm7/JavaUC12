/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tentativas = 3,cont =1;
        
        while (tentativas < 4) {
            String login = JOptionPane.showInputDialog("Digite o login: ");
            String senha = JOptionPane.showInputDialog("Digite a senha: ");
            
            if(login.equals("joao") && senha.equals ("123")){
            JOptionPane.showMessageDialog(null, "login e senha corretos!");
            break;//quebrar quando acertar.
        }else{
              if(tentativas == 0){
                  JOptionPane.showMessageDialog(null, "acabaram suas tentativas!");
                  break; //quebrar quando chegar a 0.
              }else{
                  JOptionPane.showMessageDialog(null, "Erro, verifique login e senha!\n"+"Voce tem mais "+(tentativas--)+" tentativas");
                  //adicionar operador -- para diminuir as tentativas.
              }  
            }
            cont++; //adicionar operador ++ para contar(somar) cada tentativa.
        }
    }
}

//
