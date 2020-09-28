package aulasPE.pe03;

import java.util.Scanner;

public class a03 {

    public static String nome = "Marcel";
    public static String sobrenome = " Gaudard Cheik Kaled";


    public static void main(String[] args) {
        int x = 10;
        double y = 10.2;
        int a = 0;
        double b = 2;
        System.out.println("Esta mensagem será impressa na tela!");
        System.out.println("O valor da variável x é " + x);
        System.out.println("Os valores de x e y são " + x + " e " + y);
        System.out.println("Linha 1\nLinha 2");
        System.out.println("Aspas simples: \' ");
        System.out.println("Barra invertida: \\ ");
        System.out.println("Aspas duplas: \" ");
        System.out.println("Tabulação:\tnome\tsobrenome");
        System.out.println("um");
        System.out.println("\tdois");
        System.out.println("\t\ttrês");
        System.out.println("Meu nome completo é \"" + nome + sobrenome +"\"");
        System.out.println(++a + b);

        // Leitura de teclado para variáveis de diferentes tipos de dados

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("O Aluno "+nome+" possui "+idade+" anos");


        // comparadores lógicos
        int var1 = 27;
        int var2 = 74;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 == var2 --> " + (var1== var2));
        System.out.println("var1 != var2 --> " + (var1!= var2));
        System.out.println("var1 < var2 --> " + (var1< var2));
        System.out.println("var1 > var2 --> " + (var1> var2));
        System.out.println("var1 <= var2 --> " + (var1<= var2));
        System.out.println("var1 >= var2 --> " + (var1>= var2));




    }
}

