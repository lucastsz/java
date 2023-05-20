/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.estrutura_repetitiva_while;

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

        //Exercicio 01
        System.out.println("Exercicio 01");
        System.out.print("Informe a senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Informe a senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        System.out.println("\nExercicio 02");
        int x, y;

        System.out.println("Digite o X e Y ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else {
                break;
            }

            System.out.println("Digite o X e Y ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println("\nExercicio 03");
        int alcool = 0, gasolina = 0, diesel = 0, fim;

        fim = sc.nextInt();

        while (fim != 4) {
            if (fim == 1) {
                alcool++;
            } else if (fim == 2) {
                gasolina++;
            } else if (fim == 3) {
                diesel++;
            }
            fim = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO\n"
                + "Alcool: " + alcool + "\n"
                + "Gasolina: " + gasolina + "\n"
                + "Diesel: " + diesel + "\n");

        sc.close();
    }

}
