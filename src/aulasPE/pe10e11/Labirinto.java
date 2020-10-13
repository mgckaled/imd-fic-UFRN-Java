package aulasPE.pe10e11;

public class Labirinto {

    // Static serve para referenciar todos aqueles atributos/métodos de classe, ou seja,
    // que podem ser acessados diretamente da definição da classe,
    // sem precisar instanciar nenhum objeto
    private static final char PAREDE_VERTICAL = '|';
    private static final char PAREDE_HORIZONTAL = '-';
    private static final char PAREDE_INTERNA = '#'; // Obstáculos do Labirinto
    private static final char VAZIO = ' ';
    private static final char TAMANHO = 10; // matriz de 10 linhas e 10 colunas
    private static final double PROBABILIDADE = 0.6; // aprox 30% dos carac. serão espaços vazios
    private static final char INICIO = 'I'; // ponto de saída
    private static final char DESTINO = 'D'; // ponto de chegada
    private static int linhaInicio;
    private static int colunaInicio;
    private static int linhaDestino;
    private static int colunaDestino;
    private static final char CAMINHO = '.'; // marca o caminho por onde o computador está percorrendo
    private static final char SEM_SAIDA = 'x'; // IA verificou que por lá não é possível alcançar o destino.
    private static int count=0; // variável para contagem
    private static char[][] tabuleiro;


    public static int gerarNumero(int minimo, int maximo) {
        int valor = (int) Math.round(Math.random()  * (maximo - minimo));
        return minimo + valor;
    }

    public static void inicializarMatriz() {
        int i, j;
        for (i = 0; i < TAMANHO; i++) {
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }
        // conteúdo vazio dentro do tabuleiro - laços com o tamanho -1 do elementos vazios
        for (i = 1; i < TAMANHO - 1; i++) {
            for (j = 1; j < TAMANHO - 1; j++) {
                // Math.random() retorna um número aleatório entre 0 e 1
                if (Math.random() > PROBABILIDADE) {
                    tabuleiro[i][j] = PAREDE_INTERNA;
                } else {
                    tabuleiro[i][j] = VAZIO;
                }
            }
        }
        linhaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        colunaInicio = gerarNumero(1, TAMANHO / 2 - 1);
        tabuleiro[linhaInicio][colunaInicio] = INICIO;

        linhaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        colunaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 2);
        tabuleiro[linhaDestino][colunaDestino] = DESTINO;
    }


    public static boolean procurarCaminho(int linhaAtual, int colunaAtual) {
        int proxLinha;
        int proxColuna;
        boolean achou = false;
        // tenta subir
        proxLinha = linhaAtual - 1;
        proxColuna = colunaAtual;
        achou = tentarCaminho(proxLinha, proxColuna);
        // tenta descer
        if (!achou) {
            proxLinha = linhaAtual + 1;
            proxColuna = colunaAtual;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        // tenta à esquerda
        if (!achou) {
            proxLinha = linhaAtual;
            proxColuna = colunaAtual - 1;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        // tenta à direita
        if (!achou) {
            proxLinha = linhaAtual;
            proxColuna = colunaAtual + 1;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        return achou;
    }

    // impressão do tabuleiro.

    private static boolean tentarCaminho(int proxLinha, int proxColuna) {
        boolean achou = false;
        if (tabuleiro[proxLinha][proxColuna] == DESTINO) {
            achou = true;
        } else if (posicaoVazia(proxLinha, proxColuna)) {
            // marcar
            tabuleiro[proxLinha][proxColuna] = CAMINHO;
            imprimir();
            achou = procurarCaminho(proxLinha, proxColuna);
            if (!achou) {
                tabuleiro[proxLinha][proxColuna] = SEM_SAIDA;
                imprimir();
                count++;
            }
        }
        return achou;
    }

    public static boolean posicaoVazia(int linha, int coluna) {
        boolean vazio = false;
        if (linha >= 0 && coluna >= 0 && linha < TAMANHO && coluna < TAMANHO) {
            vazio = (tabuleiro[linha][coluna] == VAZIO);
        }
        return vazio;
    }

    // Um laço aninhado para impressão das colunas da matriz.
    public static void imprimir() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }

        // Adicionar tempo de pausa para cada ponto percorrido do labirinto
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String Arg[]) {

        // definição da quantidade linhas e colunas da matriz [10][10]
        tabuleiro = new char[10][10];;

        // Métodos chamados dentro do main para sua execução.
        inicializarMatriz();
        imprimir();
        System.out.println("\nProcurando solução... \n");
        boolean achou = procurarCaminho(linhaInicio, colunaInicio);
        if (achou) {
            System.out.println("ACHOU O CAMINHO!");
            System.out.println("Quantidade de posições que não apresentaram saída: " + count);
        } else {
            System.out.println("Não tem caminho!");
        }

    }
}


