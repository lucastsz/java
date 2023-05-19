/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_sequencial.entities;

/**
 *
 * @author lucas
 */
public class ValorPeca {
    private int codPeca1;
    private int qtdPeca1;
    private double valorUnitPeca1;
    private int codPeca2;
    private int qtdPeca2;
    private double valorUnitPeca2;

    public ValorPeca(int codPeca1, int qtdPeca1, double valorUnitPeca1, int codPeca2, int qtdPeca2, double valorUnitPeca2) {
        this.codPeca1 = codPeca1;
        this.qtdPeca1 = qtdPeca1;
        this.valorUnitPeca1 = valorUnitPeca1;
        this.codPeca2 = codPeca2;
        this.qtdPeca2 = qtdPeca2;
        this.valorUnitPeca2 = valorUnitPeca2;
    }

    public int getCodPeca1() {
        return codPeca1;
    }

    public void setCodPeca1(int codPeca1) {
        this.codPeca1 = codPeca1;
    }

    public int getQtdPeca1() {
        return qtdPeca1;
    }

    public void setQtdPeca1(int qtdPeca1) {
        this.qtdPeca1 = qtdPeca1;
    }

    public double getValorUnitPeca1() {
        return valorUnitPeca1;
    }

    public void setValorUnitPeca1(double valorUnitPeca1) {
        this.valorUnitPeca1 = valorUnitPeca1;
    }

    public int getCodPeca2() {
        return codPeca2;
    }

    public void setCodPeca2(int codPeca2) {
        this.codPeca2 = codPeca2;
    }

    public int getQtdPeca2() {
        return qtdPeca2;
    }

    public void setQtdPeca2(int qtdPeca2) {
        this.qtdPeca2 = qtdPeca2;
    }

    public double getValorUnitPeca2() {
        return valorUnitPeca2;
    }

    public void setValorUnitPeca2(double valorUnitPeca2) {
        this.valorUnitPeca2 = valorUnitPeca2;
    }
    
    public double valorPagar(){
        return (this.qtdPeca1 * this.valorUnitPeca1) + (this.qtdPeca2 * this.valorUnitPeca2);
    }

    @Override
    public String toString() {
        return "VALOR A PAGAR R$ " + valorPagar();
    }
    
    
}
