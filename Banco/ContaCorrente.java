/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1banco;

/**
 *
 * @author guhen
 */
public class ContaCorrente extends ContaBase {
    private double chequeEspecial, taxa, juros;

    public ContaCorrente(double chequeEspecial, int cpf, double saldo) {
        super(cpf, saldo);
        this.chequeEspecial = chequeEspecial;
        this.taxa = taxa;
        this.juros = juros;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    //METODOS
    
    @Override
    public boolean sacar (double valor){
    if(this.saldo + this.chequeEspecial >= valor){
        this.saldo = this.saldo - valor;
        return true;
    }else{
        System.out.println("Valor acima do seu cheque especial!");
     return false;
    }
    }
   
    @Override
    public void atualizar(double taxa){
    super.atualizar(taxa);
    if (this.saldo < 0){
        juros = this.saldo *taxa;       
    }else{
        System.out.println("Conta não ultrapassou o cheque especial!");
    }
    }
    
    @Override
    public void fecharMes(){
        if(juros == 0){
            System.out.println("Ótimo mês!");
        }else{
        this.saldo = this.saldo + juros;
        juros = 0;
            System.out.println("Juros debitado!");
        }
    }
    
    @Override
    public void demonstrativo(){
    super.demonstrativo();
        System.out.println(" este cliente possui uma conta do tipo corrente, no momento os juros estão em: " 
                            + juros 
                            + " o saldo pós fechamento será de: " + (this.saldo + juros));
    }
    
    public void mudaCheque(int valor){
    this.chequeEspecial = valor;
        System.out.println("Cheque especial alterado!");
    }
    
    
}
