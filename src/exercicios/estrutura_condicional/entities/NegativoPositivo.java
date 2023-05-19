/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class NegativoPositivo {
    private int numero;

    public NegativoPositivo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String result(){
        if(this.numero >= 0){
            return "NAO NEGATIVO";
        }
        return "NEGATIVO";
    }

    @Override
    public String toString() {
        if(this.numero >= 0){
            return "NAO NEGATIVO";
        }
        return "NEGATIVO";
    }
    
    
}
