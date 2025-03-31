/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author guhen
 */
public class Funcionario {
    private String nome;
    private int rg;
    protected double salarioBase;

    public Funcionario(String nome, int rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase >=0){
            this.salarioBase = salarioBase;
        }else{
            System.out.println("Salario invalido");
        }
    }
    
    public double salarioLiquido(){
        System.out.println("O salario liquido deste funcionario é de: " + salarioBase); 
        return salarioBase;
    }
    
    public void hollerith(){
        System.out.println("O funcionario se chama: " + nome 
                            + " do RG: " + rg
                            + " do salario: " + salarioBase);
    }
    
    public void novoMes(){
        System.out.println("Fim do mês!");
    }
}
