package aulasPE.pe07;

// Buscas em Strings - P.02
import java.util.Scanner;

public class a12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = leitor.next();

        //  substring() --> retorna um pedaço da String origina a partir de dois números
        // O primeiro deles representa o índice de início do texto.
        // O segundo representa a posição de fim do texto + 1
        // substring(0, 4) -->  posição 0 a 3
        if (nome.length() >=4 &&
                nome.substring(0, 4).equalsIgnoreCase("João")) {
            System.out.println("Olá João!");
        } else {
            System.out.println("Epa, você não é João!");
        }
    }
}
