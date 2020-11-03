package aulasPOO.poo13;

public class Interface {

    // Numa interface, os métodos são declarado ser blocos de códigos
    public interface Mobilidade {
        public void andarFrente();

        public void andarTras();

        public void parar();

        public void virarDireita(int graus);

        public void virarEsquerda(int graus);
    }

    // a Classe robo implementa a interface Mobilidade
    // Dentro dessa classe métodos exclusivos podem ser implementados -> atividade específica da classe
    public static class Robo implements Mobilidade {
        public void andarFrente() {
            System.out.println("[robô]: andando para frente...");
        }

        public void andarTras() {
            System.out.println("[robô]: andando para trás...");
        }

        public void parar() {
            System.out.println("[robô]: parado");
        }

        public void virarDireita(int graus) {
            System.out.println("[robô]: virando para direita " + graus + " graus");
        }

        public void virarEsquerda(int graus) {
            System.out.println("[robô]: virando para esquerda " + graus + " graus");
        }

        public void moveBracoDireito() {
            System.out.println("[robô]: movendo braço direito");
        }

        public void moveBracoEsquerdo() {
            System.out.println("[robô]: movendo braço esquerdo");
        }
    }

    public static class Trator implements Mobilidade {
        public void andarFrente() {
            System.out.println("[trator]: andando para frente...");
        }

        public void andarTras() {
            System.out.println("[trator]: andando para trás...");
        }

        public void parar() {
            System.out.println("[trator]: parado");
        }

        public void virarDireita(int graus) {
            System.out.println("[trator]: virando para direita " + graus + " graus");
        }

        public void virarEsquerda(int graus) {
            System.out.println("[trator]: virando para esquerda " + graus + " graus");
        }

        public void erqueEscavadeira() {
            System.out.println("[trator]: ergue escavadeira");
        }
    }

    // a classe ControleRemoto possui métodos que operam sobre
    // objetos de classes que implementam a interface Mobilidadex
    // Esse exemplo também representa uma das formas de polimorfismo.
    public static class ControleRemoto {
        private int graus;

        public void moverObjetoParaFrente(Mobilidade obj) {
            obj.andarFrente();
        }

        public void moverObjetoParaTras(Mobilidade obj) {
            obj.andarTras();
        }

        public void dobrarADireita(Mobilidade obj, int graus) {
            this.graus = graus;
            obj.virarDireita(graus);
        }

        public void dobrarAEsquerda(Mobilidade obj, int graus) {
            this.graus = graus;
            obj.virarEsquerda(graus);
        }
    }

    public static void main(String[] args) {

        Robo R2D2 = new Robo();
        Trator X2 = new Trator();
        ControleRemoto controle = new ControleRemoto();


        R2D2.andarFrente();
        R2D2.parar();
        R2D2.moveBracoDireito();
        X2.erqueEscavadeira();
        controle.dobrarADireita(X2, 12);
        controle.moverObjetoParaFrente(R2D2);
        controle.dobrarAEsquerda(R2D2, 90);
        controle.dobrarAEsquerda(X2, 90);

    }
}