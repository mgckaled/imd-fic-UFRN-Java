package exer;

import java.util.Scanner;

public class mediaNota {
    public static void main(String[] args) {

        System.out.println("Digite seu nome e disciplina:");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        String disciplina = leitor.nextLine();
        System.out.println("Digite as notas dos 4 testes realizados:");
        int nota1 = leitor.nextInt();
        int nota2 = leitor.nextInt();
        int nota3 = leitor.nextInt();
        int nota4 = leitor.nextInt();
        float media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
        System.out.println("Média do aluno " + nome + " matriculado na disciplina"+ ":" +media);
    }
}
