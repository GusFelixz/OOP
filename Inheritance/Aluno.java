/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * 
 */
public class Aluno extends Pessoa
{
    private String ra;

    public Aluno(String nome, String cpf, String ra)
    {
        super(nome, cpf); //Deve sempre ser a primeira linha dentro do construtor
        this.ra=ra;
    }
    
    @Override // Anotação: informação ao programador
    public void print()
    {
        super.print();
        System.out.println("RA: " + ra);
    }
}
