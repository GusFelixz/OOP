/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Animal {
    private String nome;
    private int idade; 

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >=0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida!");
        }
    }
    
    public void consultaAnimal(){
        System.out.println("O nome do animal e: " + nome + " e ele tem " + idade + " anos");
    }
    
    public void emitirSom(){
        System.out.println("O animal fez um som");
    }
}
