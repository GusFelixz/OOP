/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Funcionario extends Pessoa {
    private double salHora;
    private int horasMes;

    public Funcionario(double salHora, int horasMes, String nome, int RG) {
        super(nome, RG);
        setSalHora(salHora);
        setHorasMes(horasMes);
    }

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        if (salHora>=0){
        this.salHora = salHora;
        }else{
            System.out.println("Salário inválido!");
        }
            
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        if (horasMes>=0 && horasMes<=220){
        this.horasMes = horasMes;
        }else{
            System.out.println("Quantidade de horas inválidas!");
        }            
    }
    
    @Override
    public void Mostrar(){
        super.Mostrar();
        System.out.println("O salario por hora e: " + salHora + " as horas trabalhadas por mes são: "+ horasMes);
    }
        
}
    
