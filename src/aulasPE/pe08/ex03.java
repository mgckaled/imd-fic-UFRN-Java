package aulasPE.pe08;

import java.util.Scanner;

public class ex03 {
    public static void main(String args[]){

        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um numero");
        double x=leitor.nextDouble();
        System.out.println("Digite um numero");
        double y=leitor.nextDouble();

        // retona o módulo aninhado
        media(x,y);
    }

    // utiliza os métodos declarados posteriomente
    public static void media(double x, double y){
        imprime(calc(x,y));
    }

    public static double calc(double x, double y){
        return (x+y)/2;
    }

    public static void imprime(double a){
        System.out.println(a);
    }
}
