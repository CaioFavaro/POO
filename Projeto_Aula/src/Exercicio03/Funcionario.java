package Exercicio03;
import javax.swing.JOptionPane;


public class Funcionario {
    
    private float salariofixo, comissao, vendas, salariofinal;
    
    
    public String salario (float salariofixo, float vendas){
       this.salariofixo = salariofixo;
       this.vendas = vendas;
       
       this.comissao = (float) (this.vendas * 0.04);
       this.salariofinal = salariofixo + this.comissao;
      
     return "O valor da comissão foi de: " + this.comissao + "\n O salario final do funcionario foi de: " + this.salariofinal;  
   }    
}
