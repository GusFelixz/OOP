/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1banco;

/**
 *
 * @author guhen
 */
public class ContaBase {
    private int cpf;
    protected double saldo;

    public ContaBase(int cpf, double saldo) {
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }        

    public void setSaldo(int saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    // METODOS
    
    public void depositar (double valor){
    this.saldo = this.saldo + valor;
    }
    
    public boolean sacar (double valor){
    if(this.saldo >= valor){
        this.saldo = this.saldo - valor;
     return true;
    }else
        System.out.println("Saldo insuficiente");
     return false;
    }
    
    public void atualizar(double taxa){
        System.out.println("Taxa aplicada!");
    }
    
    public void fecharMes(){
        System.out.println("Mes fechado!");
    }
    
    public void demonstrativo(){
        System.out.println("O CPF do dono da conta e: " + cpf 
                            + " o saldo atual e de R$" + saldo);
    }
}
