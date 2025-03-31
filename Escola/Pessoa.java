/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Pessoa {
    private String nome;
    private int RG;

    public Pessoa(String nome, int RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public void Mostrar(){
        System.out.println("O nome desta pessoa é: " + nome + " portador(a) do RG: " + RG);
    }
    
    
}
