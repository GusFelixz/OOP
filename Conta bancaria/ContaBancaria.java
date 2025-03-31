/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class ContaBancaria {
    private String Titular;
    public double saldo; // o melhor é manter o atributo como privado e levar o getter no lugar

    public ContaBancaria(String Titular, double saldo) {
        this.Titular = Titular;
        this.saldo = saldo >=0 ? saldo : 0;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >=0){
            this.saldo = saldo;
        }else 
            System.out.println("Seu saldo não pode ser negativo!");
    }
    
    public void depositar(double valor){
        if (valor >0){
        saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        }else{
            System.out.println("Valor inválido para depósito");
        }   
    }
    
    public void sacar(double valor){
        if (saldo >0 && saldo>=valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " Concluido.");   
        }else{
            System.out.println("Saldo insuficiente ou valor inválido!");
        }   
    }
    
    public void exibirSaldo()
    {
        System.out.println("O titular da conta é " 
                + Titular + ". E o saldo é de R$"
                + saldo);
    }
}
