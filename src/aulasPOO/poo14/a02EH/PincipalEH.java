package aulasPOO.poo14.a02EH;


// RELAÇÃO ENTRE EMCAPSULAMENTO E HERANÇA.
public class PincipalEH {

    public static void main(String[] args) {
        Mae minhaMae = new Mae("Angela", "Gaudard", "Moraes");
        Filha minhaFilha = new Filha("Sarah", "Assis", "Moraes");
        System.out.println(minhaMae.nomeCompleto());
        System.out.println(minhaFilha.nomeCompleto());
        minhaFilha.setIdade(30);
        minhaFilha.setNome("Fernanda");
        System.out.println(minhaFilha.getIdade() + " " + minhaFilha.getNome());
        System.out.println(minhaFilha.nomeCompleto());


        minhaFilha.setApelido("Palestrinha");
        minhaFilha.setEsportePreferido("Palestrar");

    }
}
