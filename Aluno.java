/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * 
 */
public class Aluno {
    
    private String nome, ra;
    private double media;
    
    public Aluno(String nome, String ra, Double media){
       this.nome = nome;
       this.ra = ra;
       this.media = media;
               
    }
    
//    public String getNome(){
//        return nome;
//    }
//    
//    public void setRa(String vRa){
//        if(!vRa.isEmpty()){
//            ra = vRa; 
//        }
//    }
//    
//    public String getRa(){
//        return ra;
//    }
//    
//    public void setMedia(double vMedia){
//        if(vMedia >= 0 && vMedia <= 10){
//            media = vMedia;
//        }
//    }
//    
//    public double getMedia(){
//        return media;
//    }
    
    public boolean aprovado(){
        return media >= 6.0;
    }
    
    public void print(){
    System.out.println("Nome: " + nome + "\n" +
                        "RA: " + ra + "\n" +
                        "Média: " + media + "\n" +
                        "Aprovado?: " + (aprovado()?"Sim":"Não"));
    }     
}


