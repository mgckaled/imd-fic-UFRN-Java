package exer;

import java.util.Scanner;

public class NotaProva {
    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();
        if (numero >= 9) {
            System.out.println("Você conseguiu com distinção");
        } else if (numero >= 7) {
            System.out.println("Você conseguiu");
        } else if (numero >= 3) {
            System.out.println("Você está quase conseguindo");
        } else if (numero >= 0) {
            System.out.println("Você precisa melhorar muito");
        }
    }
}