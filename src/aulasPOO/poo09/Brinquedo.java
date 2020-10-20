package aulasPOO.poo09;

public class Brinquedo {

    String nome;
    double velocidade;
    double aceleracao;

    // construtor
    public void Brinquedo(String nome) {
        this.nome = nome;
    }

    public void Brinquedo() {
        nome = nome;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(double velocidade, double aceleracao) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public static void main(String[] args) {
        Brinquedo B1 = new Brinquedo();
        Brinquedo B2 = new Brinquedo();

        B2.Brinquedo();
        B1.Brinquedo("Carrinho");
        B1.setVelocidade(10);
        B1.setVelocidade(25.59);
        B1.setVelocidade(25.59, 24.56);



    }
}
