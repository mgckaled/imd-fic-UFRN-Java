package aulasPOO.poo06;

public class Automovel {
    private Motor motor;
    private Direcao direcao;

    // CASO 1: Chamadas nos construtores da classe que é composta

    //construtor da Classe Automóvel chama o construtor de motor SEM parêmetro
    public Automovel() {
        motor = new Motor();
    }

    public Automovel (int potencia) {
        motor = new Motor(potencia);
    }

    // CASO 2: chamadas em qualquer método da classe que é composta
    public void ligarPrimeiraVez(){
        motor = new Motor();
    }

    public void ligarPrimeiraVez(int potencia) {
        motor = new Motor(potencia);
    }

    public Motor getMotor(){
        return this.motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public Direcao getDirecao(){
        return this.direcao;
    }
    public void setDirecao(Direcao direcao){
        this.direcao = direcao;
    }
}

