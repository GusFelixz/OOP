/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Moto extends Veículo {
    
    private boolean temES; //ES vem de Eletric starter

    public Moto(boolean temES, String modelo, String marca, int ano) {
        super(modelo, marca, ano);
        this.temES = temES;
    }

    public boolean isTemES() {
        return temES;
    }

    public void setTemES(boolean temES) {
        this.temES = temES;
    }
    
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        if (temES == true){
             System.out.println("Esta moto tem partida eletrica");
        }else{ 
             System.out.println("Esta moto não tem partida eletrica");                
        }
    }
    
}
