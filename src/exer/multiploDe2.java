package exer;

import java.util.Scanner;

public class multiploDe2 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, nota5, soma;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 5 números");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();
        nota4 = leitor.nextFloat();
        nota5 = leitor.nextFloat();
        soma = nota1 + nota2 + nota3 + nota4 + nota5;
        if (soma % 2 == 0) {
            System.out.println("O número " + soma + " é divisível por 2");
        } else {
            System.out.println("O número " + soma + " NÃO é divisível por 2");
        }

    }
}
