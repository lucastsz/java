/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saida_dados;

import java.util.Locale;

/**
 *
 * @author lucas
 */
public class SaidaDadosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Escolher quantas casas decimais imprimir
        double x = 10.35784;
        System.out.println("numero sem formatação: " + x);
        System.out.printf("numero formatado com duas casas decimais: " + "%.2f%n" ,x);
        
        //para mudar de "," para "." deve usar o "Locale"
        Locale.setDefault(Locale.US);
        System.out.printf("numero formatado com duas casas decimais: " + "%.2f%n" ,x);
    
        //Explorando melhor o printf
        /*  %f = Decimal
            %d = inteiro
            %s = texto
            %n = quebra de linha
        */

        String nome = "Lucas";
        int idade = 23;
        double altura = 1.86;
        
        System.out.printf("Nome: %s, Idade: %d anos, Altura: %.2f metros %n", nome, idade, altura);
    }
    
}
