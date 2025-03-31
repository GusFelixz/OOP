/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros, String Titular, double saldo) {
        super(Titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
             
    public void aplicarJuros(){
       saldo = getSaldo() + getSaldo()*taxaJuros;    
    }
      
    public void exibirSaldoPoup(){
           super.exibirSaldo();
           System.out.println("A taxa de juros nesta conta é de: %.2f%%\n" + taxaJuros*100);
    }
    // %.2f%%\n serve para garantir que apenas dois números sejam colocados depois da virgula
}
