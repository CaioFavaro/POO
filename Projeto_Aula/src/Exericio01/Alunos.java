package Exericio01;
import javax.swing.JOptionPane;

public class Alunos {
    
    private float n1, n2, n3, mf;
    private int p1, p2, p3, pf;
    public String conta (float n1, float n2, float n3, float mf, int p1, int p2, int p3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mf = (n1 * p1 + n2 * p2 + n3 * p3)/ (p1 + p2 + p3);
        
     return "A media final foi de: " + this.mf;  
    }
    
      }