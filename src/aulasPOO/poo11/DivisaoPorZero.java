package aulasPOO.poo11;

import java.util.Scanner;

public class DivisaoPorZero {

    // Método 'static' - > permite executar uma função sem a dependência de conteúdo de um
    // objeto ou a execução da instância de uma classe.

    // a palavra-chave 'throws' serve para lançar uma exceção.
    // esse método informa ao compilador que ele poderá causar risco(s).
    public static int quociente(int numerador, int denominador) throws Exception {
        return numerador/denominador;
    }

    public static void main(String[] args) {

        // o bloco 'try/catch' serve para tratamento de exceções, isto é, tratamento de códigos
        // que podem ser totalmente atendidos e gerarem alguma exceção/erro.

        // o 'try' consegue procurar e recuperar erros que possam ocorrer dentro do bloco
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o numerador: ");
            int numerador = input.nextInt();
            System.out.println("Digite o denominador: ");
            int denominador = input.nextInt();
            double resultado = quociente(numerador, denominador);
            System.out.println("O resultado da divisão é: " + resultado);

        // o 'catch' faz o tratamento dos erros que ocorrerem dentro do bloco 'try'.
        } catch (Exception erro) {
            // err -> módulo que retorna o erro do sistema
            System.err.println("Erro: " + erro);
            System.out.println("Zero não é um denominador válido.");
        }
    }
}
