package aulasPE.exerComp;
// Implemente um programa que imprima os N primeiros números da sequência de Fibonacci.
// O valor N deve ser passado pelo usuário.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Entre com o valor N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // 2 primeiros elementos da sequencia Fibonacci
        int n1 = 0;
        int n2 = 1;
        int aux = 0;

        for (int i = 1; i <= n ; i++) {
            System.out.print(n1 + " ");
            // armazena os número conforme os n primeiros números, quantificado  pelo loop.
            aux = n2 + n1;
            n1 = n2;
            n2 = aux;
        }
    }
}
