/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes_string;

/**
 *
 * @author lucas
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        System.out.println("Original: -" + original + "-");
        System.out.println("Minusculo: -" + original.toLowerCase() + "-");
        System.out.println("Maiusculo: -" + original.toUpperCase() + "-");
        System.out.println("Eliminar os espaços em branco das extremidades da string: -" + original.trim() + "-");
        System.out.println("recortar a string a partir da 2ª posicao: -" + original.substring(2) + "-");
        System.out.println("recortar a string a partir de intervalor (indice 2 a 9): -" + original.substring(2, 9) + "-");
        System.out.println("alterar todas as ocorrencias da letra: (a -> x) -" + original.replace('a', 'x') + "-");
        System.out.println("alterar todas as ocorrencias da letra: (abc -> xy) -" + original.replace("abc", "xy") + "-");
        System.out.println("indice da primeira ocorrencia do texto: (bc) -" + original.indexOf("bc") + "-");
        System.out.println("indice da ultima ocorrencia do texto: (bc) -" + original.lastIndexOf("bc") + "-");
    
        //recortar string e armazenar em vetor
        String s = "banana abacaxi uva";
        String[] vect = s.split(" ");
        System.out.println("\nTamanho vetor: " + vect.length);
        for (String string : vect) {
            System.out.println(string.toString());
        }
    }

}
