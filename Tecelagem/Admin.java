/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author guhen
 */
public class Admin extends Funcionario {
        int faltas;

    public Admin( String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.faltas = 0;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public void registraFalta(){
    faltas++;
    }
    
    @Override
    public double salarioLiquido(){
    return this.salarioBase - (faltas*0.033*this.salarioBase);       
    }
    
    @Override
    public void hollerith(){
    super.hollerith();
        System.out.println(" este funcionario faltou: " + faltas +" vezes este mes e seu salario liquido foi de: " + salarioLiquido());
    }
    
    @Override
    public void novoMes(){
    super.novoMes();
    faltas = 0;
    }
}
