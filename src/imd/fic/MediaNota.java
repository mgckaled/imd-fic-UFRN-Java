package imd.fic;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        System.out.print("Entre com a nota do aluno: ");

        Scanner leitor = new Scanner(System.in);
        float nota = leitor.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            if (nota >= 3) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
