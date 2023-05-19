/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.estrutura_condicional;

import exercicios.estrutura_condicional.entities.Cardapio;
import exercicios.estrutura_condicional.entities.Coordenadas;
import exercicios.estrutura_condicional.entities.HoraJogo;
import exercicios.estrutura_condicional.entities.ImparPar;
import exercicios.estrutura_condicional.entities.Imposto;
import exercicios.estrutura_condicional.entities.Intervalos;
import exercicios.estrutura_condicional.entities.Lanche;
import exercicios.estrutura_condicional.entities.ListaIntervalos;
import exercicios.estrutura_condicional.entities.Multiplos;
import exercicios.estrutura_condicional.entities.NegativoPositivo;

/**
 *
 * @author lucas
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Exercicio 01");
        NegativoPositivo np1 = new NegativoPositivo(-10);
        System.out.println(np1);
        NegativoPositivo np2 = new NegativoPositivo(8);
        System.out.println(np2);
        NegativoPositivo np3 = new NegativoPositivo(0);
        System.out.println(np3);
        
        System.out.println("\nExercicio 02");
        ImparPar ip1 = new ImparPar(12);
        System.out.println(ip1);
        ImparPar ip2 = new ImparPar(-27);
        System.out.println(ip2);
        ImparPar ip3 = new ImparPar(0);
        System.out.println(ip3);
        
        System.out.println("\nExercicio 03");
        Multiplos m1 = new Multiplos(6, 24);
        System.out.println(m1);
        Multiplos m2 = new Multiplos(6, 25);
        System.out.println(m2);
        Multiplos m3 = new Multiplos(24, 6);
        System.out.println(m3);
        
        
        System.out.println("\nExercicio 04");
        HoraJogo hora = new HoraJogo(15, 2);
        hora.result();
        
        System.out.println("\nExercicio 05");
        Lanche cachorroQuente = new Lanche(1, "Cachorro Quente", 4.00);
        Lanche xSalada = new Lanche(2, "X-Salada", 4.50);
        Lanche xBacon = new Lanche(3, "X-Bacon", 5.00);
        Lanche torradaSimples = new Lanche(4, "Torrada Simples", 2.00);
        Lanche refrigerante = new Lanche(5, "Refrigerante", 1.50);
        
        Cardapio cardapio = new Cardapio();
        
        cardapio.addLanche(cachorroQuente);
        cardapio.addLanche(xSalada);
        cardapio.addLanche(xBacon);
        cardapio.addLanche(torradaSimples);
        cardapio.addLanche(refrigerante);
        
        System.out.println(cardapio.totalPagar(3, 2));
        System.out.println(cardapio.totalPagar(2, 3));
        
        System.out.println("\nExercicio 06");
        Intervalos i1 = new Intervalos(0, 25);
        Intervalos i2 = new Intervalos(25, 50);
        Intervalos i3 = new Intervalos(50, 75);
        Intervalos i4 = new Intervalos(75, 100);
        
        ListaIntervalos listaIntervalos = new ListaIntervalos();
        listaIntervalos.addIntervalos(i1);
        listaIntervalos.addIntervalos(i2);
        listaIntervalos.addIntervalos(i3);
        listaIntervalos.addIntervalos(i4);
        
        System.out.println(listaIntervalos.buscaIntervalo(25.01));
        System.out.println(listaIntervalos.buscaIntervalo(25.00));
        System.out.println(listaIntervalos.buscaIntervalo(100.00));
        System.out.println(listaIntervalos.buscaIntervalo(-25.02));
        
        System.out.println("\nExercicio 07");
        Coordenadas cord1 = new Coordenadas(4.5, -2.2);
        System.out.println(cord1.checkout());
        Coordenadas cord2 = new Coordenadas(0.1, 0.1);
        System.out.println(cord2.checkout());
        Coordenadas cord3 = new Coordenadas(0.0, 0.0);
        System.out.println(cord3.checkout());
        
        System.out.println("\nExercicio 08");
        Imposto imp1 = new Imposto(3002.00);
        imp1.calcImposto();
        Imposto imp2 = new Imposto(1701.12);
        imp2.calcImposto();
        Imposto imp3 = new Imposto(4520.00);
        imp3.calcImposto();
        
    }
    
}
