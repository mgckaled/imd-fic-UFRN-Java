package aulasPE.pe07;

// Crie um programa que lê uma String e imprima apenas os caracteres de índice ímpar.
import java.util.Scanner;

public class a09 {
    public static void main(String[] args) {

        System.out.println("Digite uma palavra:");
        Scanner input = new Scanner(System.in);
        String palavra = input.next();

        System.out.println("Impressão dos caracteres de índice impar:");
        for (int i = 0; i < palavra.length(); i++) {
            if (i % 2 != 0) {
                // a função charAt() irá retornar o índice da String
                System.out.print(palavra.charAt(i));
            }
        }
    }
}
