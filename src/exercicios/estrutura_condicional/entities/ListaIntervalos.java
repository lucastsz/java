/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ListaIntervalos {
    List<Intervalos> listaIntervalos = new ArrayList<Intervalos>();

    public ListaIntervalos() {
    }
    
    public void addIntervalos(Intervalos intervalo){
        listaIntervalos.add(intervalo);
    }
    
    public void removeIntervalos(Intervalos intervalo){
        listaIntervalos.remove(intervalo);
    }
    
    public String buscaIntervalo(double valor){
        for (Intervalos li : listaIntervalos) {
            if(li.getValorInicial() <= valor && li.getValorFinal() >= valor){
                return "Intervalo [" + li.getValorInicial() + "," + li.getValorFinal() + "]";
            }
        }
        return "Fora de Intervalo";
    }
}
