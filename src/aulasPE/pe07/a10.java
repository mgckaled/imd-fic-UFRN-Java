package aulasPE.pe07;

import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {

        // leitura da entrada de uma String
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();

        // IndexOf() -->  recebe um caractere como parâmetro e retorna a posição da primeira ocorrência
        char ponto = '.';
        int inicio = 0;
        int posicao = nome1.indexOf(ponto); // posição do ponto (.)

        System.out.println("Existe ponto nas posições: ");

        // Enquanto índice 0 for menor que o total de elementos da String
        // e o retorno da função IndexOf() for diferente de -1
        while (inicio < nome1.length() && posicao != -1) {
            System.out.println(posicao);
            // incremento
            inicio = posicao + 1;
            // IndexOf() recebe 2 parâmetros:
            // 1) o elemento a ser procurado
            // 2) o fromIndexOf
            posicao = nome1.indexOf(ponto, inicio);

        }
    }
}
