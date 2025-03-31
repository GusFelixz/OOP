/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
        this.preco = preco;
        }else{
            System.out.println("Valor inválido!");
        }
    }
    
    public void consultaProduto(){
        System.out.println("O nome do produto é " + nome + " e ele custa R$" + preco);
    }
    
    
}
