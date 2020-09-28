package exer;

import java.util.Scanner;

public class verificaTriangulo {
    public static void main(String[] args) {
        float A, B, C;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 comprimentos de retas");
        A = leitor.nextFloat();
        B = leitor.nextFloat();
        C = leitor.nextFloat();

        if (A < B + C && B < C + A && C < A + B) {
            System.out.println("As retas formam um triângulo ");
        } else {
            System.out.println("Não é possível montar um triângulo");
        }

    }
}
