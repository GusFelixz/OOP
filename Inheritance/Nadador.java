/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atleta;

/**
 *
 * @author guhen
 */
public class Nadador extends Atleta
{
    private double tempo;
            
    public Nadador(double peso, double altura, double tempo) 
    {
        super(peso, altura);
        this.tempo = tempo;
    }
    
    public void print()
    {
        super.printAtleta();
        System.out.println("Tempo: " + tempo);   
    }
    
}

