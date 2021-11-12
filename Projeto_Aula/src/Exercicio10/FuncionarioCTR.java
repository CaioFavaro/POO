
package Exercicio10;


public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostrarCodTel(FuncionarioDTO FuncionarioDTO){
        return funcionarioDAO.mostrarCodTel(FuncionarioDTO);
    }
    
}
