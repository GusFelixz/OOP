/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetecido;

/**
 *
 * @author welis
 */
public class TesteTecido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tecido t1 = new Tecido ("Laranja", 'l');
    
        t1.print();
        
        t1.comprou(3);
        
        t1.print();
        
        t1.vendeu(1);
        
        t1.print();
        
        Tecido t2 = new Tecido ("Amarelo", 'j', 4);
        
        t2.vendeu(3);
        
        t2.print();
        
        t2.comprou(5);
        
        t2.print();
    }
   
}
