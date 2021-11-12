
package Exercicio09;


public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String MostrarNomeRg(ClienteDTO ClienteDTO){
        return clienteDAO.mostrarNomeRg(ClienteDTO);
    }
    
     public String MostrarNomeIdade(ClienteDTO ClienteDTO){
        return clienteDAO.mostrarNomeIdade(ClienteDTO);
    }

    
}
