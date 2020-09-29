package aulasPE.pe07;

import java.util.Scanner;

public class a02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();

        // a forma mais recomendada para comparar dados é equals. (em detrimento de "==")
        // equals é case-sensitive, ou seja, faz distinção de letras maiusculas e minúsculas.
        if (nome1.equals(nome2))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");

    }
}
