package aulasPE.exerComp;
// Criar um programa de conversão de temperaturas entre C° F° e K°

import java.io.IOException;
import java.util.Scanner;

public class ConverterTemp {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double temp, c, f, k; char uni;

        System.out.printf("Informe uma temperatura: ");
        temp =input.nextDouble(); // entrada de dados (lendo uma Double)

        System.out.printf("Informe a unidade da temperatura: (C/F/K) ");
        uni = (char)System.in.read();  // entrada de dados (lendo um caractere)
        switch(uni) {
            case 'C':
                k = temp + 273.15;
                f = temp * 1.8 + 32;
                System.out.printf("Temperatura em graus Farenheit (F°): %.2f%n", f , "\n");
                System.out.printf("Temperatura em graus Kelvin (K°): %.2f%n", k , "\n");
                break;
            case 'F':
                k = ((temp - 32) * (5/9)) + 273.15;
                c = (temp - 32) * (5/9);
                System.out.printf("Temperatura em graus Kelvin (K°): %.2f%n", k , "\n");
                System.out.printf("Temperatura em graus Celcius (C°): %.2f%n", c , "\n");
                break;
            case 'K':
                c = temp - 273.15;
                f = (temp - 273.15) * 9 / 5 + 32;
                System.out.printf("Temperatura em graus Farenheit (F°): %.2f%n", f , "\n");
                System.out.printf("Temperatura em graus Celcius (C°): %.2f%n" ,c , "\n");
            default:
                System.out.print("Essa unidade de temperatura não existe. Digite uma válida!");
        }
    }
}
