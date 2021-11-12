
package Exercicio06;

import javax.swing.JOptionPane;


public class MaiorMenor {
    
    private int numero;
    private int menor = 0;
    private int maior = 0;
public int calculo (int numero){
    this. numero = numero;
    
    for(int cont=1; cont <=10; cont++){
        
        
        if (numero > maior )
            maior = numero;
        
        if (numero < menor)
            menor = numero;
    }
        
        
    
    return maior;
    }    

public void MostrarResultado (int maior, int menor){
       this.maior = maior;
       this.menor = menor;

JOptionPane.showMessageDialog(null, "O menor  numero foi: " +this.maior + " O maior numero foi: " +this.menor);       




  }

}
