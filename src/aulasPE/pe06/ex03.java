package aulasPE.pe06;

public class ex03 {
    public static void main(String[] args) {

        int a = 1;
        boolean[] matriz = new boolean[1];

        // a condição é falsa, pois o array está vazio
        // logo o valor de "a" permanecerá = 1
        if (matriz[0])
            a++;

        System.out.println(matriz[0]); // matriz vazia é "falsy",
        System.out.println(a);
    }
}
