/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author guhen
 */
public class Vendedor extends Funcionario {
    private double venda;

    public Vendedor(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);        
        this.venda = venda;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
     
    public void RegistraVenda(double valor){
    this.venda = this.venda + valor;
    }
    
    @Override
    public double salarioLiquido(){
    return this.salarioBase + (venda*0.03);
    }
    
    @Override
    public void hollerith(){
    super.hollerith();
        System.out.println(" este vendedor vendeu R$" + venda + " este mes, o salario liquido dele foi R$" + salarioLiquido());
    }
    
    @Override
    public void novoMes(){
    super.novoMes();
    venda = 0;
    }
}
