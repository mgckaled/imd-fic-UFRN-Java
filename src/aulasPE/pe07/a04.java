package aulasPE.pe07;

import java.util.Scanner;

public class a04 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();

        // método "toUpperCase();" - todas maiusculas
        // método "toLowerCase()," - todas minusculas
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();

        if (nome1.equals(nome2))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");

        System.out.println(nome1);
        System.out.println(nome2);
    }
}
