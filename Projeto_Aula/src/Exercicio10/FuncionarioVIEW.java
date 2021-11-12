
package Exercicio10;

import javax.swing.JOptionPane;

public class FuncionarioVIEW {
    public static void main(String[] args){
        
        try{
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o seu codigo: ")));
            funcionarioDTO.setTel(JOptionPane.showInputDialog("Informe seu telefone: "));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarCodTel(funcionarioDTO));
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, "ERRO NO SISTEMA "+ e.getMessage());
       } 
        
    }
    
}
