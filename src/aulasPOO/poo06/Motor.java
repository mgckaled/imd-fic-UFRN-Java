package aulasPOO.poo06;

public class Motor {
    private int potencia;

    // método constructor => valor default
    public Motor() {
        potencia = 1000;
    }

    // método constructor
    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia(){
        return this.potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}

