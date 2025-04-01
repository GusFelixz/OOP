/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1banco;

/**
 *
 * @author guhen
 */
public class ContaPoupanca extends ContaBase {
    private double rendimento, taxa;

    public ContaPoupanca(int cpf, double saldo) {
        super(cpf, saldo);
        this.rendimento = rendimento;
        this.taxa = taxa;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }    

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Saque completo!");
         return true;
        }else{
            System.out.println("Saldo insuficiente!");
         return false;
    }       
    }
    
    @Override
    public void atualizar(double taxa){
        super.atualizar(taxa);
        if(this.saldo > 0){
            this.rendimento = this.rendimento + (this.saldo*taxa);
            System.out.println("Rendimento atualizado!");
        }else{
            System.out.println("Conta vazia, sem rendimento");
        }
    }
    
    @Override
    public void fecharMes(){
        if(rendimento == 0){
            System.out.println("Sem rendimento esse mes!");
        }else{
            this.saldo = this.saldo + rendimento;
            System.out.println("Rendimento adicionado ao saldo!");
            rendimento = 0;
        }
    }
    
    @Override
    public void demonstrativo(){
        super.demonstrativo();
        System.out.println(" esta conta e poupanca, no momento seu rendimento e de: " + rendimento
                            + " o saldo pos-fechamento sera de: " + (this.saldo+rendimento));
    }
}
