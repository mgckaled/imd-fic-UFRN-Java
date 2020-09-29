package aulasPE.pe06;

import java.util.Scanner;

public class a02 {
    public static void main(String[] args) {
        // Ao declarar um vetor, indicamos o tipo do array e o nome da variável.
        // O uso do [] é para indicar que a variável é um array.
        // Existe, porém, uma diferença quando declaramos um array em relação às declarações
        // de variáveis de tipos primitivos. Para que seja alocado o espaço na memória
        // relativo ao array, é necessário usar a palavra chave new, seja na própria declaração
        // do array, ou inicializando-o posteriormente.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas: ");
        int quantidade = input.nextInt();
        // Declaração e inicialização de array / vetor
        // a "quantidade" dentro das chaves irá definir quantos elementos serão armazenados na array
        double notas[] = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            // dentro de cada repetição o array irá armazenar um valor de entrada (input).
            notas[i] = input.nextDouble();
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println((i + 1) +"º" + " Nota: " + notas[i] +
                    " - Posição no Array: [" + i + "]");
        }
    }
}
