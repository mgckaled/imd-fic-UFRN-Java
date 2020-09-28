package aulasPE.exerComp;
// Implemente um programa que calcule o fatorial de um número N passado pelo usuário.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("Entre com o número N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // 0! = 1 e 1! = 1
        int i = n;
        int fat = 1;

        // enquanto o valor i for maior que zero
        while (i > 0) {
            // loop de multiplicação pelo valor N. Cada vez que o loop repete, N sofre decremento de -1.
            fat = fat *i ;
            i--; // decremento
        }
        System.out.println("O fatorial de " + n + " é igual a " + fat + ".");
    }
}
