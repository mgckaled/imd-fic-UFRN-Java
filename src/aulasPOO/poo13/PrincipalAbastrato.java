package aulasPOO.poo13;

// Criação de uma classe abstrata

class PrincipalAbstrato {

    public static abstract class FiguraAbstrata {

        // Definição de método abstrato
        // não é necessário definir um código em bloco.
        // é apenas uma chamada de

        abstract public void desenha();


    }

    private static class Quadrado extends FiguraAbstrata {
        @Override
        public void desenha() {
            System.out.println(" ---");
            System.out.println("|   |");
            System.out.println(" ---");
        }
    }

    public static class Triangulo extends FiguraAbstrata {
        @Override
        public void desenha() {
            System.out.println("//\\");
            System.out.println("___");
        }
    }

    public static class Trapezio extends FiguraAbstrata {
        @Override
        public void desenha() {
            System.out.println("Trapézio");
        }
    }

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.desenha();
        Triangulo t = new Triangulo();
        t.desenha();
        Trapezio tr = new Trapezio();
        tr.desenha();
    }
}

