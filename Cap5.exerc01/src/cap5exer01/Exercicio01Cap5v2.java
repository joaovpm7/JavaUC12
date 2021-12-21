package cap5exer01;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio01Cap5v2 {

    public static void main(String[] args) {
        double notas[] = new double[5];
        //double v[] = new double[5];
        double soma = 0;
        int i;
        
        //Entradas de notas
        for(i=0; i<5; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
            soma = soma + notas[i];
        }
        Arrays.sort(notas); //ordenar
        for(i=4; i>=0; i--){
            System.out.println(notas[i]);
        }
        System.out.println(Arrays.toString(notas));//mostrar a arrays completa.
    }
}