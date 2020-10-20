package aulasPOO.poo10;

import java.util.HashSet;

// exemplo de uma SET (coleção)

public class TesteHashSet{
    public static void main(String[] args){
        HashSet itens = new HashSet();
        itens.add("Chocolate");
        itens.add("Bala");
        itens.add("Brigadeiro");

        System.out.println(itens);
        System.out.println(itens.size());
        System.out.println(itens.contains("Bala"));
    }
}
