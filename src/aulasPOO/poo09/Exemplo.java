package aulasPOO.poo09;

public class Exemplo {

    public class Brinquedos {

        double velocidade;
        double aceleracao;

        public void mover() {
            System.out.println("Mover Brinquedo");

        }
    }

    static class Carro extends Exemplo {
        public void mover(){
            System.out.println("CORRER");

        }
    }

    public static class Aviao extends Exemplo {
        public void mover(){
            System.out.println("VOAR");

        }
    }

    public static class Barco extends Exemplo {
        public void mover(){
            System.out.println("NAVEGAR");

        }
    }

    public static class ControleRemoto{
        private Carro brinquedo;
        public ControleRemoto(Carro b){
            brinquedo =b;
        }
        public void mover(){
            brinquedo.mover();
        }
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        Aviao aviao = new Aviao();
        Barco barco = new Barco();

        ControleRemoto controleRemoto = new ControleRemoto(carro);
        controleRemoto.mover();
        aviao.mover();
        barco.mover();
    }
}


