package aulasPOO.poo12;

public class ex01 {

    public static void main(String args []) {
        String teste = "no";
        try {
            System.out.println("Início do try");
            facaCoisaPerigosa(teste);
            System.out.println("Final do try");
        } catch ( Exception ex ) {
            System.out.println("Excecao assustadora");
        } finally {
            System.out.println("finally");
        }
        System.out.println("final do main");
    }

    static void facaCoisaPerigosa(String teste)  throws Exception {
        System.out.println("Início coisa perigosa");
        if ( "yes".equals(teste) ) {
            throw new Exception();
        }
        System.out.println("Final da coisa perigosa");
        return;
    }
}

