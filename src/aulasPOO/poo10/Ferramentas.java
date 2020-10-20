package aulasPOO.poo10;

public class Ferramentas {
    public static void main(String[] args) {


        String[] ferramentas = {
                "chave de Fenda",
                "martelo",
                "chave inglesa",
                "Alicate",
                "Régua",
                "chave L"
        };

        for (int i = 0; i< ferramentas.length;i++) {
            System.out.println("Ferramenta " + (i + 1) + ": " + ferramentas[i]);
        }

        // enchanced for
        for (String a : ferramentas)
            System.out.print(a + ", ");
    }
}