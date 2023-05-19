/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

import java.util.Locale;

/**
 *
 * @author lucas
 */
public class Imposto {

    private double renda;
    private double imposto;

    public Imposto(double renda) {
    Locale.setDefault(Locale.US);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void calcImposto() {
        if (this.renda <= 2000.0) {
            this.imposto = 0.0;
        } else if (this.renda <= 3000.0) {
            this.imposto = (this.renda - 2000.0) * 0.08;
        } else if (this.renda <= 4500.0) {
            this.imposto = (this.renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            this.imposto = (this.renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (this.imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", this.imposto);
        }
    }
}
