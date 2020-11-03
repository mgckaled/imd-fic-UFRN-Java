package exer;

public class ConversaoDeUnidadesDeTempo {

    // atributo de classe constante (palavra chave final)
    public static final int CONSTANTE_TEMPO = 60;


    // HORAS --> MINUTOS
    public static float converteHorasParaMinutos(float horas) {
        return horas * CONSTANTE_TEMPO;
    }

    // HORAS --> SEGUNDOS
    public static float converteHorasParaSegundos(float horas) {
        return horas * CONSTANTE_TEMPO * CONSTANTE_TEMPO;
    }

    // MINUTOS --> HORAS
    public static float converteMinutosParaHoras(float minutos) {
        return minutos / CONSTANTE_TEMPO;
    }

    // MINUTOS --> SEGUNDOS
    public static float converteMinutosParaSegundos(float minutos) {
        return minutos * CONSTANTE_TEMPO;
    }


    // SEGUNDOS --> MINUTOS
    public static float converteSegundosParaMinutos(float segundos) {
        return segundos / CONSTANTE_TEMPO;
    }

    // SEGUNDOS --> HORAS
    public static float converteSegundosParaHoras(float segundos) {
        return segundos / CONSTANTE_TEMPO / CONSTANTE_TEMPO;
    }

    public static void main(String[] args) {

        // Métodos e atributos estáticos podem ser chamados na ausência de criação de objetos.
        System.out.println(ConversaoDeUnidadesDeTempo.CONSTANTE_TEMPO);
        System.out.println(ConversaoDeUnidadesDeTempo.converteSegundosParaHoras(3600));

        float area = (float) (Math.PI * Math.pow(5.0,2.0));
        System.out.println(area);
    }
}
