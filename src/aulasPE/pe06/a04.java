package aulasPE.pe06;

// Calculando o espaço ocupado na memória por um vetor

public class a04 {
    public static void main(String[] args) {

        // spaço ocupado = tamanho ocupado por cada elemento do vetor * tamanho do vetor

        // Dessa forma, considerando um vetor com 10 inteiros, ele irá ocupar 10 x 4 bytes,
        // ou seja, 40 bytes, pois cada inteiro ocupa 4 bytes na memória

        // Calcule o espaço ocupado na memória
        // para os tipos de dados char, short, long, float e double.

        System.out.println("Tipos de dados em Java: \n" +
                "\nMenor Byte: " + Byte.MIN_VALUE +
                "\nMaior Byte: " + Byte.MAX_VALUE +
                "\nMenor Short Int: " + Short.MIN_VALUE +
                "\nMaior Short Int: " + Short.MAX_VALUE +
                "\nMenor Int: " + Integer.MIN_VALUE +
                "\nMaior Int: " + Integer.MAX_VALUE +
                "\nMenor Long: " + Long.MIN_VALUE +
                "\nMaior Long:" + Long.MAX_VALUE +
                "\nMenor Float: " + Float.MIN_VALUE +
                "\nMaior Float: " + Float.MAX_VALUE +
                "\nMenor Double: " + Double.MIN_VALUE +
                "\nMaior Double: " + Double.MAX_VALUE);

        // máximo em bytes para cada tipo de dado
        int _char = 16;
        int _short = 16;
        int _long = 64;
        int _float = 32;
        int _double = 64;

    }
}
