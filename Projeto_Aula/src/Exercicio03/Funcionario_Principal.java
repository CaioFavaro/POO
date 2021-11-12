package Exercicio03;

import javax.swing.JOptionPane;


public class Funcionario_Principal {
    public static void main (String [] args){
    Funcionario funcionario = new Funcionario(); 
    
    
    float salariofixo,vendas;
    
    salariofixo = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario do funcionario: ")) ;
    vendas = Float.parseFloat(JOptionPane.showInputDialog("Informe o numero de vendas do funcionario: ")) ;
    
    JOptionPane.showMessageDialog(null, funcionario.salario(salariofixo, vendas));
    }
    
}
