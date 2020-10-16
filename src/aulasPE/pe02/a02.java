package aulasPE.pe02;

public class a02 {

    public static int varGloblal = 5;

    public static void main(String[] args) {
        int varLocalRotina = 10;

        if (varGloblal == 0) {
            System.out.println(varLocalRotina);
        }
        System.out.println(varLocalRotina);
        int varLocalClasse = 6;
        System.out.println(varLocalClasse);
        System.out.println(varGloblal);
        String linha = "Esta é a linha";
        String x = " 1";
        System.out.println(linha + x);
        String y = " 2";
        System.out.println(linha + y);

        exer_pe_02 nome = new exer_pe_02();
        nome.nomeCompleto();
    }
}
