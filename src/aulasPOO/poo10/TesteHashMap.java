package aulasPOO.poo10;

import java.util.HashMap;

// exemplo de uma MAP (coleção)

public class TesteHashMap{
    public static void main(String[] args){
        HashMap livros = new HashMap();

        // método put()
        livros.put(1, "Volta ao mundo em 80 dias");
        livros.put(2, "Alice no país das maravilhas");
        livros.put(5, "Caninos Brancos ");

        System.out.println(livros);
    }
}
