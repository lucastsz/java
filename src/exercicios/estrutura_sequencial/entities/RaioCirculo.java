/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_sequencial.entities;

/**
 *
 * @author lucas
 */
public class RaioCirculo {
    private double raio;
    private double PI = 3.14159;

    public RaioCirculo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }
    
    public double valorRaioCirculo(){
        return getPI() * Math.pow(getRaio(), 2);
    }

    @Override
    public String toString() {
        return "A=" + this.valorRaioCirculo();
    }
    
    
}
