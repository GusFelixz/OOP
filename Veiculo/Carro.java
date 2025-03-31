/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Carro extends Veículo 
{
    private int portas;

    public Carro(int portas, String modelo, String marca, int ano) {
        super(modelo, marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        if (portas >0){
            this.portas = portas;
    }else{
            System.out.println("Número de portas inválido");        
        }           
    }
 
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Este carro possui " + portas + " portas");
    }
}