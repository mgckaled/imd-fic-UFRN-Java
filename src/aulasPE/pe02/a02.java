package aulasPE.pe02;

public class a02 {
    public static int varGloblal = 5;
    private static int varLocalClasse = 6;
    private static String linha = "Esta é a linha";
    private static String x = " 1";
    private static String y = " 2";

    public static void main(String[] args) {
        int varLocalRotina = 10;

        if (varGloblal == 0) {
            int varLocalComando = varLocalRotina;
            System.out.println(varLocalComando);
        }
        System.out.println(varLocalRotina);
        System.out.println(varLocalClasse);
        System.out.println(varGloblal);
        System.out.println(linha + x);
        System.out.println(linha + y);

        exer_pe_02 nome = new exer_pe_02();
        nome.nomeCompleto();

    }




}
