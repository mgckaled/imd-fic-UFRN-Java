package aulasPE.pe06;

import java.util.Scanner;

// MATRIZES
public class a08 {
    public static void main(String[] args) {

        // String nomes[][] = new String[10][3];
        // A ocorrência do [] em duas vezes indica que o vetor tem duas dimensões.

        Scanner leitor = new Scanner(System.in);
        String[][] nomes = new String[10][3];
        System.out.println("Digite o nome dos proprietários dos apartamentos");
        for (int andar = 1; andar <= nomes.length; andar++) {
            for (int posicao = 1; posicao <= nomes[andar - 1].length; posicao++) {
                System.out.println("Apto. " + andar + "0" + posicao);
                nomes[andar - 1][posicao - 1] = leitor.next();
            }
        }
        System.out.println("Lista dos proprietários dos apartamentos:");
        for (int andar = 0; andar < nomes.length; andar++) {
            for (int posicao = 0; posicao < nomes[andar].length; posicao++) {
                System.out.println("Apto. " + (andar + 1) + "0" +
                        (posicao + 1) + ": " + nomes[andar][posicao]);
            }
        }
    }
}
