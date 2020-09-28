package aulasPE.exerComp;
//Informado um ano pelo usuário, informe se ele é ou não bissexto.
//Dica: um ano é bissexto se é divisível por 400 ou se é divisível por 4 mas não por 100.

import java.util.Scanner;
public class AnoBissexto {
    public static void main(String[] args) {

        // Receber do usuário a informação "ano"
        System.out.println("Digite uma ano válido: ");
        Scanner input = new Scanner(System.in);
        int ano = input.nextInt();
        // divisível por 400 ou se é divisível por 4 mas não por 100.
        // || -> operador lógico "OU".
        // && -> operador lógico "E".
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 !=0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }
    }
}
