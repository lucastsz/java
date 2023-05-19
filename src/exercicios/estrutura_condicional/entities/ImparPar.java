/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class ImparPar {
    private int numero;

    public ImparPar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        if(this.numero % 2 == 0){
            return "PAR";
        }
        return "IMPAR";
    }
    
}
