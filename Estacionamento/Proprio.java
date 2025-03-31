/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Proprio extends Carro {
    private double compra;
    private String data;

    public Proprio(double compra, String data, int codigo, String placa, String ano, String modelo) {
        super(codigo, placa, ano, modelo);
        setCompra(compra);
        this.data = data;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        if(compra>=0){
        this.compra = compra;
        }else{
            System.out.println("valor de compra invalido");
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
    public void imprimeDados(){
    super.imprimeDados();
        System.out.println(" este carro foi comprado por:" + compra
                           + " no dia: " + data);
    }
    
    @Override
    public boolean oferta(double valor){
        if (disponivel() == true && valor >= compra + compra*0.10){
            System.out.println("Oferta aceitavel");
            return true;
        }else{
            System.out.println("Oferta ruim");
            return false;
        }
    }
    
    @Override
    public boolean vendeCarro(String vendedor, double valorVenda){
        if (oferta(valorVenda) == true){
            setDisponivel("vendido");
            setVendedor(vendedor);
            System.out.println("Carro vendido por: " + vendedor
                                + " pelo valor de R$: " + valorVenda);
        return true;
    }else{
            System.out.println("Venda impossibilitada.");
        return false;
    }
    }
}
