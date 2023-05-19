/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_sequencial.entities;

/**
 *
 * @author lucas
 */
public class CalcArea {
    private double a, b, c;

    public CalcArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double areaTriangulo(){
        return this.a * this.c / 2;
    }
    
    public double areaCirculo(){
        double PI = 3.14159;
        return PI * (Math.pow(this.c, 2));
    }
    
    public double areaTrapezio(){
        return ((this.a + this.b) * this.c) / 2;
    }
    
    public double areaQuadrado(){
        return Math.pow(this.b, 2);
    }
    
    public double areaRetangulo(){
        return this.a * this.b;
    }
    
    public void showResult(){
        System.out.printf("%nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTriangulo(),areaCirculo(), areaTrapezio(), areaQuadrado(), areaRetangulo());
    }
    
}
