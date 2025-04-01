/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1banco;

/**
 *
 * @author guhen
 */
public class P1Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ContaCorrente a = new ContaCorrente (215.00, 13498593, 1920.00);
        //a.demonstrativo();
        //a.sacar(2000);
        //a.demonstrativo();
        //a.atualizar(0.15);
        //a.demonstrativo();
        //a.mudaCheque(50);
        //a.depositar(142);
        //a.demonstrativo();
        //a.sacar(50);
        //a.demonstrativo();
        //a.sacar(72);
        //a.demonstrativo();
        //a.sacar(150);
        //a.demonstrativo();
        //a.fecharMes();
        //a.demonstrativo();
        //a.fecharMes();
        //a.demonstrativo();
        
        ContaPoupanca b = new ContaPoupanca (192833724, 2000.00);
        b.demonstrativo();
        b.atualizar(0.15);
        b.demonstrativo();
        b.fecharMes();
        b.demonstrativo();
    }
    
}
