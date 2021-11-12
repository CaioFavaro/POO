package Exercicio04;
import javax.swing.JOptionPane;


public class Solo {
    
    private double amostra;
    private String resposta;
    
    public String classificacao (double amostra){
        
        if (this.amostra <= 10){
            this.resposta = "Rochosa";
        }
        else{
            if((this.amostra > 10 ) && (this.amostra <= 40)){
                this.resposta = "Firme";
            }
            else {
                if((this.amostra > 40 ) && (this.amostra <= 80)){
                    this.resposta = "Pantanosa";
                  }
                else {
                    this.resposta = "Quantidade de água inválida";
                }
            }
        }
        return this.resposta;
        
    }
    
}
 
