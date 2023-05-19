/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.estrutura_sequencial;

import exercicios.estrutura_sequencial.entities.CalcArea;
import exercicios.estrutura_sequencial.entities.DiferencaProduto;
import exercicios.estrutura_sequencial.entities.Funcionario;
import exercicios.estrutura_sequencial.entities.RaioCirculo;
import exercicios.estrutura_sequencial.entities.Soma;
import exercicios.estrutura_sequencial.entities.ValorPeca;

/**
 *
 * @author lucas
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Exercicio 01
        System.out.println("EXERCICIO 01");
        Soma s1 = new Soma(10, 30);
        System.out.println(s1);
        Soma s2 = new Soma(-30, 10);
        System.out.println(s2);
        Soma s3 = new Soma(0, 0);
        System.out.println(s3);

        //Exercicio 02
        System.out.println("\nEXERCICIO 02");
        RaioCirculo r1 = new RaioCirculo(2.00);
        System.out.printf("A=%.4f%n", r1.valorRaioCirculo());
        RaioCirculo r2 = new RaioCirculo(100.64);
        System.out.printf("A=%.4f%n", r2.valorRaioCirculo());
        RaioCirculo r3 = new RaioCirculo(150.00);
        System.out.printf("A=%.4f%n", r3.valorRaioCirculo());

        //Exercicio 03
        System.out.println("\nEXERCICIO 03");
        DiferencaProduto df1 = new DiferencaProduto(5, 6, 7, 8);
        System.out.println(df1);
        DiferencaProduto df2 = new DiferencaProduto(5, 6, -7, 8);
        System.out.println(df2);

        //Exercicio 04
        System.out.println("\nEXERCICIO 04");
        Funcionario f1 = new Funcionario(25, 100, 5.50);
        System.out.printf("%nNUMBER = %d%nSALARY = U$ %.2f%n", f1.getNumber(), f1.salario());
        Funcionario f2 = new Funcionario(1, 200, 20.50);
        System.out.printf("%nNUMBER = %d%nSALARY = U$ %.2f%n", f2.getNumber(), f2.salario());
        Funcionario f3 = new Funcionario(6, 145, 15.55);
        System.out.printf("%nNUMBER = %d%nSALARY = U$ %.2f%n", f3.getNumber(), f3.salario());

        //Exercicio 05
        System.out.println("\nEXERCICIO 05");
        ValorPeca peca1 = new ValorPeca(12, 1, 5.30, 16, 2, 5.10);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", peca1.valorPagar());
        ValorPeca peca2 = new ValorPeca(13, 2, 15.30, 161, 4, 5.20);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", peca2.valorPagar());
        ValorPeca peca3 = new ValorPeca(1, 1, 15.10, 2, 1, 15.10);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", peca3.valorPagar());
        
        //Exercicio 06
        System.out.println("\nEXERCICIO 06");
        CalcArea c1 = new CalcArea(3.0, 4.0, 5.2);
        c1.showResult();
        CalcArea c2 = new CalcArea(12.7, 10.4, 15.2);
        c2.showResult();
    }

}
