/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * 
 */
public class Pessoa 
{    
   private String nome,cpf;
    

    public Pessoa(String nome, String cpf) {
        if(!nome.isEmpty())
            this.nome= nome;

        if(!cpf.isEmpty())
            this.cpf= cpf;
      
    }

    public void setNome(String nome)
    {
        if(!nome.isEmpty())
            this.nome= nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setcpf(String cpf)
    {
        if(!cpf.isEmpty())
            this.cpf= cpf;
    }

    public String getcpf()
    {
        return cpf;
    }
    
    public void print()
    {
        System.out.println("Nome: " + nome + "\n" +
                "CPF: " + cpf);
                
    }
}


    

