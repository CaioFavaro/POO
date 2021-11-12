package Exercicio02;
import javax.swing.JOptionPane;


public class Funcionario {
    private float salario, aumento, salariofinal;
    
   public String salario (float salario, float aumento, float salariofinal){
       this.salario = salario;
       this.aumento = aumento;
       this.salariofinal = salario * ((aumento / 100) + 1 );
      
    return "O valor do salario foi de: " + this.salariofinal;  
   }

  
}
