package Exericio01;
import javax.swing.JOptionPane;

public class Principal_Alunos {
    public static void main (String [] args){
        Alunos alunos = new Alunos();
        
        float n1, n2, n3, mf = 0;
        int p1, p2, p3;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: ")) ;
        p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da primeira nota: ")) ;
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: ")) ;
        p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da segunda nota: ")) ;
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: ")) ;
        p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da terceira nota: ")) ;
        
        JOptionPane.showMessageDialog(null, alunos.conta(n1, n2, n3, mf, p1, p2, p3));
        
        }   
}