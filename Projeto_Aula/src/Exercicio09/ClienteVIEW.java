package Exercicio09;
import javax.swing.JOptionPane;


public class ClienteVIEW {
    public static void main(String args[]){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.MostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.MostrarNomeIdade(clienteDTO));
                                           
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO NO SISTEMA"+ e.getMessage());
        }           
        
                     
    }
    
}
