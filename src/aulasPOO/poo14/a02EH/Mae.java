package aulasPOO.poo14.a02EH;

public class Mae {

    // Atributos de classe
    private int idade;
    public String nome;
    private String sobrenomeMaterno;
    protected String sobrenomePaterno;

    // Método construtor
    public Mae(String primeiroNome, String materno, String paterno) {
        this.nome = primeiroNome;
        this.sobrenomeMaterno = materno;
        this.sobrenomePaterno = paterno;
    }

    public String nomeCompleto(){
        return nome + " "+sobrenomeMaterno + " " + sobrenomePaterno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenomeMaterno() {
        return sobrenomeMaterno;
    }

    public void setSobrenomeMaterno(String sobrenomeMaterno) {
        this.sobrenomeMaterno = sobrenomeMaterno;
    }

    public String getSobrenomePaterno() {
        return sobrenomePaterno;
    }

    public void setSobrenomePaterno(String sobrenomePaterno) {
        this.sobrenomePaterno = sobrenomePaterno;
    }
}
