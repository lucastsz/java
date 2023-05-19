/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes_matematicas;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class FuncoesMatematicasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Raiz Quadrada (Raiz quadrada de 9)
        Math.sqrt(9);
        
        // Numero elevado (5^2)
        Math.pow(5, 2);
        
        //Valor absoluto
        Math.abs(-56);
        
        //funcoes em expressoes
        // x = (-b +- raiz de delta)/2a
        double a = 0, b = 0, c = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        
        
        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();
        
        
        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;
        
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("Valor de X1: " + x1);
        System.out.println("Valor de X2: " + x2);
    }
    
}
