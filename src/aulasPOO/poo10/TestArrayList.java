package aulasPOO.poo10;

import java.util.ArrayList;

// Exemplo de List (coleção)

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList nomes = new ArrayList();
        nomes.add("Maria");
        nomes.add("João");


        System.out.println(nomes);
        System.out.println(nomes.size());
        System.out.println(nomes.contains("Marcel"));
    }
}
