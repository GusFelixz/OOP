/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Carro {
    private int codigo;
    private String ano, modelo, vendedor, placa;
    private String disponivel;
    

    public Carro(int codigo, String placa, String ano, String modelo) {
        setCodigo(codigo);
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.disponivel = "Disponivel";
        this.vendedor = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo>=0){
        this.codigo = codigo;
        }else{
            System.out.println("O codigo não pode ser negativo!");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;       
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    public boolean disponivel(){
        if(disponivel.equalsIgnoreCase("disponivel")){
        return true;
    }else{
        return false;
        }
    }
    
    public void imprimeDados(){
        System.out.println("A placa do carro e: " + placa 
                            + " o ano dele e: " + ano 
                            +" o modelo e: " + modelo
                            + " disponibilidade: " +disponivel
                            + " vendedor: " + vendedor);
    }
    
    
    public boolean oferta(double valor){
        if (disponivel() == true){
            System.out.println("aceitável!");
        return true;
    }else{
        return false;
    }
    }
    
    public boolean vendeCarro(String vendedor, double valorVenda){
        if (oferta(valorVenda) == true){
            setDisponivel("vendido");
            setVendedor(vendedor);
            System.out.println("Carro vendido por: " + vendedor
                                + "pelo valor de R$: " + valorVenda);
        return true;
    }else{
            System.out.println("Venda impossibilitada.");
        return false;
    }
    }
}
