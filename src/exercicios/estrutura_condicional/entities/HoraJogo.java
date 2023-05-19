/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class HoraJogo {

    private int horaInicial;
    private int horaFinal;
    private final int minimo = 1;
    private final int maximo = 24;

    public HoraJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(int horaInicial) {
        this.horaInicial = horaInicial;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void result() {
        int duracao;
        if (this.horaInicial < this.horaFinal){
            duracao = this.horaInicial - this.horaFinal;
            System.out.println("O JOGO DUROU " + Math.abs(duracao) + " HORA(S)");
        } else {
            duracao = 24 - this.horaInicial + this.horaFinal;
            System.out.println("O JOGO DUROU " + Math.abs(duracao) + " HORA(S)");
        }
    }
}
