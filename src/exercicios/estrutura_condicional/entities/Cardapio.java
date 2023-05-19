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
public class Cardapio {

    List<Lanche> listaLanche = new ArrayList<>();

    public Cardapio() {
    }

    public void addLanche(Lanche lanche) {
        listaLanche.add(lanche);
    }
    
    public void removeLanche(Lanche lanche) {
        listaLanche.remove(lanche);
    }
    
    public String totalPagar(int codigo, int qtd){
        for (Lanche l : listaLanche) {
            if(l.getCodigo() == codigo){
                return "Codigo " + l.getCodigo() + ", " + l.getEspecificacao() + ", Total: R$ " + l.getPreco() * qtd;
            }
        }
        return "Codigo invalido";
    }
}
