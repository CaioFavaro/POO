
package Exercicio10;

public class FuncionarioDAO {
        
    
    public String mostrarCodTel(FuncionarioDTO FuncionarioDTO){
        return "O codigo informado foi: "
                + FuncionarioDTO.getCod() + "\n O Telefone informado foi: "
                + FuncionarioDTO.getTel();
        
    }
    
}
    
