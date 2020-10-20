package aulasPOO.poo10;

public class TrainadorMain {
    public static void main(String[] args) {
        String nomeAtleta = "Bolt";

        // Criação de uma array cujo tipo de dados é double e com até no máximo 5 elementos.
        // O par de conchetes serve para indicar a dimensão --> array ou vetor
        // operador "new" --> operador new para alocar espaço para armazenar o conjunto de valores.
        // double[] marca = new double[5];

        double[] marca = {10.02, 10.0, 9.56, 9.57, 9.56};

        for(int i = 0;i < marca.length ;i++){
            System.out.println ("Marca"+(i+1)+": " +marca[i]);
        }

        // marca[0] = 10.02 marca[1] = 10.0; marca[2] = 9.56; marca[3] = 9.57; marca[4] = 9.56;

        // System.out.println("Tempo 1:" + marca[0]);
        // System.out.println("Tempo 2:" + marca[1]);
        // System.out.println("Tempo 3:" + marca[2]);
        // System.out.println("Tempo 4:" + marca[3]);
        // System.out.println("Tempo 5:" + marca[4]);

    }

}
