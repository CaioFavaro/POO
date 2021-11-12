
package Exercicio09;


public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO ClienteDTO){
        return "O nome informado foi: "
                + ClienteDTO.getNome() + "\n O RG informado foi: "
                + ClienteDTO.getRg();
        
    }
    
    public String mostrarNomeIdade(ClienteDTO ClienteDTO){
        return "O nome informado foi: "
                + ClienteDTO.getNome() + "\n A idade informado foi: "
                + ClienteDTO.getIdade();
    
    }
    
}
