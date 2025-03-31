/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Aluno extends Pessoa {
    private int RA;
    private String turno;
    private String status;

    public Aluno(int RA, String turno, String nome, int RG) {
        super(nome, RG);
        this.RA = RA;
        this.turno = turno;
        this.status = "Ativo";
        
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getStatus() {
        return status;
    }
   
    
    @Override
    public void Mostrar(){
    super.Mostrar();
        System.out.println("o RA do aluno é: " + RA + " o turno é o: " + turno + " e no momento o status da matricula é: "+ status);
    }
    
    public void Trancar(){
    if(status.equals("Ativo")){
        this.status = "Suspenso";
    }else{
        System.out.println("Esta matricula não pode ser trancada");
    }
    }
    
     public void Destrancar(){
    if(status.equals("Suspenso")){
        this.status = "Ativo";
    }else{
        System.out.println("Esta matricula não pode ser destrancada");
    }
    }
    
    public void Formar(){
    if(status.equals("Ativo")){
        this.status = "Egresso";
    }else{
        System.out.println("Esta matricula não pode ser egressa");
    }
    }
    
    public void Desistir(){
    if(!status.equals("Egresso")){
        this.status = "Desistente";
    }else{
        System.out.println("Esta matricula não pode ser cancelada");
    }
    }
    
    
}
