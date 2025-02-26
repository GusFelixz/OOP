/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testetecido;

/**
 *
 * @author welis
 */
public class Tecido {
    
    private double Metragem;
    private char TipoTecido; // Alterado para char
    private String cor;
    
    public Tecido(String cor, char TipoTecido){
        this(cor, TipoTecido, 0);
    }
    
    public Tecido(String cor, char TipoTecido, double Metragem)
    {
        this.cor = cor;
        this.setTipoTecido(TipoTecido); // Usar o setter para validação
        this.Metragem = Metragem;
    }
    
    public void setCor(String cor)
    {
        if (!cor.isEmpty()) {
            this.cor = cor;
        }
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setTipoTecido(char TipoTecido)
    {
        if (TipoTecido == 's' || TipoTecido == 'j' || TipoTecido == 'l') {
            this.TipoTecido = TipoTecido;
        } else {
            System.out.println("Tecido Inválido");
        }
    }
    
    public char getTipoTecido(){
        return TipoTecido;
    }

    private String getNomeTecido() {
        switch (TipoTecido) {
            case 's': return "Sarja";
            case 'j': return "Jeans";
            case 'l': return "Linho";
            default: return "Desconhecido"; 
        }
    }
    
    public void comprou(double Metragem){
        this.Metragem += Metragem;
    }
    
    public void vendeu(double Quantidade){
        if (Quantidade <= Metragem && Quantidade > 0) {
            Metragem -= Quantidade;
        } else {
            System.out.println("Quantidade Inválida");
        }
    }
    
    public void print()
    {
        System.out.println("Cor: " + cor + "\n" +
                "Tipo de Tecido: " + getNomeTecido() + "\n" +  // Exibe o nome do tecido
                "Metragem: " + Metragem);
    }
}