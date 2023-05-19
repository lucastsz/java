/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_sequencial.entities;

/**
 *
 * @author lucas
 */
public class Funcionario {
    private int number;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(int number, int horasTrabalhadas, double valorHora) {
        this.number = number;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double salario(){
        return this.horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "NUMBER =" + number + "\nSALARY = %.2f" + this.salario();
    }
    
    
}
