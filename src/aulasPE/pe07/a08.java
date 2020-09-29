package aulasPE.pe07;

import java.util.Scanner;

//Strings como arrays de caracteres
public class a08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();

        // toCharArray(). --> Essa função é aplicada a uma variável do tipo String, que no caso é nome1,
        // e seu retorno é um array de caracteres com o tamanho exato do texto e que
        // armazena exatamente os caracteres que formam o texto original.
        char[] caracteres = nome1.toCharArray();

        System.out.println("Inverso:");
        // caracteres.lenght -1 para considerar o index da array.
        // i-- --> decremento
        for (int i = caracteres.length - 1; i >= 0 ; i--) {
            System.out.print(caracteres[i]);
        }

        String nome2 = leitor.next();
        for (int i = nome2.length() - 1; i >= 0 ; i--) {
            // a função charAt() irá retornar o primeiro caractere da String.
            // Lembre-se que os índices começam do número zero!
            System.out.print(nome2.charAt(i));
        }
    }
}
