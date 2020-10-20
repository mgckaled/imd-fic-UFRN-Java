package aulasPOO.poo06;


// A Composição e o Método Construtor
public class Main {
    public static void main(String[] args) {


        Automovel automovel1 = new Automovel(1600);

        //CASO 2
        Automovel automovel2 = new Automovel();
        automovel2.ligarPrimeiraVez();
        //outra maneira
        automovel2.ligarPrimeiraVez(1600);

        //CASO 3
        Automovel automovel3 = new Automovel();
        //outra maneira
        Motor motor = new Motor (1600);
        automovel3.setMotor(motor);

    }
}