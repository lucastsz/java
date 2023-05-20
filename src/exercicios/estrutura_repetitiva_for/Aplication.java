/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int inteiroPositivo;
        System.out.print("Numero: ");
        inteiroPositivo = sc.nextInt();
        
        for (int i = 0; i < inteiroPositivo; i++) {
            System.out.println( (i + 1) + " " + (int)(Math.pow((i + 1), 2)) + " " + (int)(Math.pow((i + 1), 3)));
        }
        

        System.out.println("Exercicio 01");
        System.out.print("Digite o Numero: ");
        int impares = sc.nextInt();

        for (int i = 1; i <= impares; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Exercicio 02");
        System.out.print("Digite a quantidade de inteiros: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        int valor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        System.out.println("Exercicio 03");

        int qtdN;
        double a, b, c, result;

        System.out.print("Digite a quantidade de testes: ");
        qtdN = sc.nextInt();

        for (int i = 0; i < qtdN; i++) {

            System.out.print("Digite os 3 numeros: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            result = (((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10);

            System.out.printf("%.1f%n", result);

        }
        
        System.out.println("Exercicio 04");
        int qtd;
        double valorA, valorB, resultDivisao;

        System.out.print("Informe a quantidade de testes: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.print((i + 1) + "º: Digite o valor de A e B: ");
            valorA = sc.nextDouble();
            valorB = sc.nextDouble();

            if (valorB == 0) {
                System.out.println("divisao impossivel");
            } else {
                resultDivisao = valorA / valorB;
                System.out.println("Resultado da divisão: " + resultDivisao);
            }
        }
        
        System.out.println("Exercicio 05");
        int valorFatorial, resultado = 1;
        
        valorFatorial = sc.nextInt();
        
        for (int i = 1; i <= valorFatorial; i++) {
            resultado = (resultado * i);
        }
        
        System.out.println(resultado);
        

        System.out.println("Exercicio 06");
        System.out.print("Digite o numero: ");
        int numero;
        
        numero = sc.nextInt();
        
        System.out.println("Divisores:");
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                System.out.println(i);
            }
        }
        
        sc.close();
    }

}
