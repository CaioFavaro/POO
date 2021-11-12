package Exercicio07;
import javax.swing.JOptionPane;

public class Principal_Vogais {
    public static void main (String[] args){
        String letra;
        Vogais vogais = new Vogais();
        
        
             do {
                 letra = JOptionPane.showInputDialog("Informe letras: ");        
         
            while(letra != 0){
                vogais.verificar(letra);
                letra = JOptionPane.showInputDialog("Informe letras: ");
             }
            
            
            
    }
    JOptionPane.showMessageDialog(null, vogais.impressao());
        
    }
      
}
