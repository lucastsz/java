/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada_dados;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class EntradaDadosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            //.next pega o texto ate voce dar espaco (somente a primeira palavra)
            //.nextLine pega todo o texto ate vocce dar enter
            System.out.println("Digite um texto: ");
            String string = sc.nextLine();
            
            
            System.out.println("Digite um numero inteiro: ");
            int inteiro = sc.nextInt();
            
            
            System.out.println("Digite um numero decimal: ");
            double decimal = sc.nextDouble();
            
            //Para pegar um caracter pela posição
            System.out.println("Digite um texto: ");
            char caracter = sc.next().charAt(0);
            
            System.out.println("texto: " + string);
            System.out.println("inteiro: " + inteiro);
            System.out.println("decimal: " + decimal);
            System.out.println("caracter: " + caracter);
            
            /* Sempre que for usar um .next diferente do .nextLine,
            usar um .nextLine extra
            exemplo:
            */
            
            String s1, s2, s3;
            int x = sc.nextInt();
            sc.nextLine();
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            
            sc.close();
        }
    }
    
}
