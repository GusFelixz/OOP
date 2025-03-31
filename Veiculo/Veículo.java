/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Veículo {
    private String modelo, marca;
    private int ano;

    public Veículo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1885 && ano <= 2025 ){
            this.ano = ano;
    }else{
         System.out.println("Ano inválido");
    } 
}
    
    public void exibirInfo(){
        System.out.println("O modelo do veículo é " + modelo 
                + " da marca " + marca 
                + " feito no ano " + ano);
    }
}
