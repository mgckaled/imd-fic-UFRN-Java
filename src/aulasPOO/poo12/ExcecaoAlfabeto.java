package aulasPOO.poo12;

import java.util.Scanner;

public class ExcecaoAlfabeto extends Exception {

    public static void validarLetrasAlfabeto(String texto) {

        if (texto.contains(("[a-Z]"))) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Todas são letras do alfabeto");
        }
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String texto = input.next();
        validarLetrasAlfabeto(texto);

    }
}
