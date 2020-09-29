package aulasPE.pe07;

import java.util.Scanner;

public class a06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();

        // equalsIgnoreCase() é uma rotina que flerta com as boas prátivas.
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}
