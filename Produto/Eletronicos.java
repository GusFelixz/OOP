/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Eletronicos extends Produto {
    private int tempoGarantia;

    public Eletronicos(int TempoGarantia, String nome, double preco) {
        super(nome, preco);
        this.tempoGarantia = TempoGarantia;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(int TempoGarantia) {
        if (tempoGarantia >= 0){
        this.tempoGarantia = tempoGarantia;
        }else{
            System.out.println("tempo inválido");
        }
    }
            
        public void consultaProdEletro(){
        super.consultaProduto();
            System.out.println("Este produto tem: " + tempoGarantia + " meses de garantia.");
        }
        
}
