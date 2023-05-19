/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.estrutura_condicional.entities;

/**
 *
 * @author lucas
 */
public class Lanche {
    private int codigo;
    private String especificacao;
    private double preco;
    

    public Lanche(int codigo, String especificacao, double preco) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
             
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    
}
