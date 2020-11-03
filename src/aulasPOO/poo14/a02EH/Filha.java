package aulasPOO.poo14.a02EH;


// A classe filha herda todos os atributos da classe 'Mae'
public class Filha extends Mae {

    // Atributos da classe Filha
    public String apelido;
    protected String esportePreferido;


    // Método construtor com a palavra chave 'super' para habilitar a função de herança.
    public Filha(String primeiroNome, String materno, String paterno) {
        super(primeiroNome, materno, paterno);
        System.out.println("Nome: " +this.nome);
        System.out.println("Sobrenome paterno: " +this.sobrenomePaterno);
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEsportePreferido() {
        return esportePreferido;
    }

    public void setEsportePreferido(String esportePreferido) {
        this.esportePreferido = esportePreferido;
    }
}
