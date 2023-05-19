/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class Multiplos {
    private int a, b;

    public Multiplos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if(this.a % this.b == 0 || this.b % this.a == 0){
            return "Sao Multiplos";
        } else
        return "Nao sao Multiplos";
    }
    
    
}
