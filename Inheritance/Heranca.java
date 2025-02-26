/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;

/**
 *
 * @author guhen
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Pessoa p = new Pessoa("Mickey", "1203904385");       
        p.print();
                
        Aluno a = new Aluno ("Zé", "918337842", "1390348450");
        a.print();
    }
    
       
}
