package Exercicio04;
import javax.swing.JOptionPane;

public class SoloPrincipal {
    public static void main (String args[]){
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null,"A situação do solo é: " +
                solo.classificacao(
                    Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de agua do solo: "))
              
                ));
    }
    
}
