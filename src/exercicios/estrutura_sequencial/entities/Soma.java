/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_sequencial.entities;

/**
 *
 * @author lucas
 */
public class Soma {
    private int valueA, valueB;

    public Soma(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }
    
    public double soma(){
        return getValueA() + getValueB();
    }

    @Override
    public String toString() {
        return "SOMA = " + this.soma();
    }
    
    
}
