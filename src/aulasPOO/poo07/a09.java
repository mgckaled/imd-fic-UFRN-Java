package aulasPOO.poo07;

public class a09 {
    public static void main(String[] args) {


        class Transporte {
            private int capacidade;
        }

        class Terreste extends Transporte {
            private int numRodas;
        }

        // herda atributos asd
        class Automovel extends Terreste {
            private String cor;
            private int numPortas;
            private String placa;

        }
    }
}
