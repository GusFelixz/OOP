/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treinopp;

/**
 *
 * @author guhen
 */
public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau, o gato mia!");
    }
    
}
