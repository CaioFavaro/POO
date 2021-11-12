package Exercicio02;
import javax.swing.JOptionPane;

public class Funcionario_Principal {
    public static void main (String [] args){
    Funcionario funcionario = new Funcionario();  
    
    float salario, aumento, salariofinal = 0;
    
    salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario do funcionario: ")) ;
    aumento = Float.parseFloat(JOptionPane.showInputDialog("Informe o aumento do salario do funcionario: ")) ;
    
    funcionario.salario(salario, aumento, salario);
    
     JOptionPane.showMessageDialog(null, funcionario.salario(salario, aumento, salariofinal));
    }
    
        
    
}
