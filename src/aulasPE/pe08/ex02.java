package aulasPE.pe08;

import java.util.Scanner;

public class ex02 {

    public static void main(String args[]){

        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra=leitor.next();

        // System.out.println(primeiraMaiuscula(palavra));
        // System.out.println(minusculo(palavra));

        // Exemplo de função aninhada
        // 1) TRANSFORMA A STRING EM MINUSCULA
        // 2) TRANSFORMA apenas a primeira letra em maiuscula
        System.out.println(primeiraMaiuscula(minusculo(palavra)));
    }

    public static String minusculo(String x){
        return x.toLowerCase();
    }

    public static String primeiraMaiuscula(String x){
        return x.substring(0, 1).toUpperCase().concat(x.substring(1));
    }
}
