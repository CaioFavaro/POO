package Exercicio07;



public class Vogais {
    
    private String letra;
    private int quantidade, quantidader;
    


public void verificar(String letra){
    this.letra = letra;
    if(letra.equalsIgnoreCase("A") || ("E")) || ("I") || ("O") || ("U")
            {
        this.quantidade++;
        else this.quantidader++; 
   }
}

public int impressao(){
        return this.quantidade;
    }
}
