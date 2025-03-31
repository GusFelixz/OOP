/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Alimentos extends Produto {
    private String dataVal;

    public Alimentos(String dataVal, String nome, double preco) {
        super(nome, preco);
        this.dataVal = dataVal;
    }
   

    public String getDataVal() {
        return dataVal;
    }

    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }
    
    public void consultaAlimento(){
        super.consultaProduto();
        System.out.println("Este produto é válido até: " + dataVal);
    }
    
}
