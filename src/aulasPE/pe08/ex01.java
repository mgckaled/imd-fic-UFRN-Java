package aulasPE.pe08;

import java.util.Scanner;

public class ex01 {
    public static void main(String args[]){

        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra=leitor.next();

        // parâmetro da função é uma String
        letraImpar(palavra);
    }

    public static void imprime(char a){
        System.out.print(a);
    }

    public static void letraImpar(String c){

        // transforma a String em uma array de letras pu Char
        char[] d = c.toCharArray();

        // retorna apenas as letras com posição de índex ímpar
        for(int i=0;i<d.length;i++){
            if(i%2==1){
                // modularização do "System.out.println"
                imprime(d[i]);
            }
        }
    }
}
