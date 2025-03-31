/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perras;

/**
 *
 * @author guhen
 */
public class Professor extends Funcionario{
    private String area;

    public Professor(String area, double salHora, int horasMes, String nome, int RG) {
        super(salHora, horasMes, nome, RG);
        setArea(area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area.equalsIgnoreCase("Humanas") || 
            area.equalsIgnoreCase("Exatas") || 
            area.equalsIgnoreCase("Biologicas")) {
            this.area = area;
        } else {
            System.out.println("Área inválida! Escolha entre: Humanas, Exatas ou Biologicas.");
            this.area = "Não definida"; 
        }
    }
    
    @Override
    public void Mostrar(){
    super.Mostrar();
        System.out.println("a area deste professor e: " + area);
    }
}
    
