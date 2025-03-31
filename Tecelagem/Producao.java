/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author guhen
 */
public class Producao extends Funcionario {
    private int horas;
    private int horNoturna, horDiurna;

    public Producao(String nome, int rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.horas = 0;
        this.horNoturna = 0;
        this.horDiurna = 0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorNoturna() {
        return horNoturna;
    }

    public void setHorNoturna(int horNoturna) {
        this.horNoturna = horNoturna;
    }

    public int getHorDiurna() {
        return horDiurna;
    }

    public void setHorDiurna(int horDiurna) {
        this.horDiurna = horDiurna;
    }    
            
    public void horasNoturnas(int horas){
    this.horNoturna = this.horNoturna + horas;
    this.horas = this.horas + horas;
    }
    
    public void horasDiurnas(int horas){
    this.horDiurna = this.horDiurna + horas;
    this.horas = this.horas + horas;
    }
    
    @Override
    public double salarioLiquido(){
    return ((this.salarioBase * horDiurna) + ((this.salarioBase*1.3) * horNoturna));
    }
    
    @Override
    public void hollerith(){
    super.hollerith();
        System.out.println("Este funcionario trabalhou: " + horas + " horas este mes, sendo: "
                            + horDiurna + " Diurnas, e: " + horNoturna + " noturna "
                            + "seu salario liquido e: " +salarioLiquido());
    }
    
    @Override
    public void novoMes(){
    super.novoMes();
    horas = 0;
    horDiurna = 0;
    horNoturna = 0;
    }
    
}
