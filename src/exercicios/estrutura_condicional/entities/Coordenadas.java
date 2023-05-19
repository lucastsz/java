package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class Coordenadas {
    private double eixoX;
    private double eixoY;

    public Coordenadas(double eixoX, double eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public double getEixoX() {
        return eixoX;
    }

    public void setEixoX(double eixoX) {
        this.eixoX = eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }

    public void setEixoY(double eixoY) {
        this.eixoY = eixoY;
    }
    
    public String checkout(){
        if(this.eixoX > 0 && this.eixoY > 0){
            return "Q1";
        } else if (this.eixoX > 0 && this.eixoY < 0){
            return "Q4";
        } else if (this.eixoX < 0 && this.eixoY > 0){
            return "Q2";
        } else if (this.eixoX < 0 && this.eixoY < 0){
            return "Q3";
        }
        return "Origem";
    }
}
