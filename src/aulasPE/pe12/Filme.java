package aulasPE.pe12;

import java.util.Scanner;

public class Filme {

    public static class RegistroFilme {
        public String nomeFilme;
        public String autorFilme;
        public int anoFilme;
        public double precoFilme;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Digite os dados do 1º filme--");
        Filme.RegistroFilme F1 = LerDadosFilme(input);
        System.out.println("-- Digite os dados do 2º filme--");
        Filme.RegistroFilme F2 = LerDadosFilme(input);
        System.out.println("-- Digite os dados do 3º filme--");
        Filme.RegistroFilme F3 = LerDadosFilme(input);
        System.out.println("------ Dados do 1º Filme -----");
        imprimirDadosFilme(F1);
        System.out.println("------ Dados do 1º Filme -----");
        imprimirDadosFilme(F2);
        System.out.println("------ Dados do 3º Filme -----");
        imprimirDadosFilme(F3);
    }

    public static RegistroFilme LerDadosFilme(Scanner input) {
        RegistroFilme F = new RegistroFilme();
        System.out.println("Nome: ");
        F.nomeFilme = input.nextLine();
        System.out.println("Autor: ");
        F.autorFilme = input.nextLine();
        System.out.println("Ano:");
        F.anoFilme = input.nextInt();
        input.nextLine();
        System.out.println("Preço de Locação:");
        F.precoFilme = input.nextDouble();
        input.nextLine();
        return F;
    }

    public static void imprimirDadosFilme (Filme.RegistroFilme F) {
        System.out.println("****************** DADOS DO FILME *******************");
        System.out.print("Nome: " + F.nomeFilme + " | ");
        System.out.print("Autor: " + F.autorFilme + " | ");
        System.out.print("Ano: " + F.anoFilme + " | ");
        System.out.print("Preço: " + F.precoFilme + " | ");

    }
}
