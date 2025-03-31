/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Consignado extends Carro {
    private String nomeDono;
    private float valorPedido;

    public Consignado(String nomeDono, float valorPedido, int codigo, String placa, String ano, String modelo) {
        super(codigo, placa, ano, modelo);
        this.nomeDono = nomeDono;
        setValorPedido(valorPedido);
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        if (valorPedido >= 0){
        this.valorPedido = valorPedido;
        }else{
            System.out.println("Valor invalido");
        }
    }
    
    @Override
    public void imprimeDados(){
    super.imprimeDados();
        System.out.println("o dono se chama: " + nomeDono 
                            + " ele espera conseguir: " + valorPedido
                            + " com a venda.");
    }
    
    @Override
    public boolean oferta(double valor){
        if (disponivel() == true && valor >= valorPedido + valorPedido*0.05){
            System.out.println("Boa oferta");
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
