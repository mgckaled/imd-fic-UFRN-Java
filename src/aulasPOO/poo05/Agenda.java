package aulasPOO.poo05;

// A ausência de modificadores de acesso concede automaticamente o acesso Package
// permite que classes do mesmo pacote acessem atributos ou métodos que estejam com tal modificador.

class Agenda {

    // Com o modificador de acesso 'private' só é possível inserir uma anotação na classe Agenda usando o método anote()
    private int dia;
    private int mes;
    private String anotacao;

    // método de anotação da informação
    public void anote(int d, int m, String nota) {
        dia = d;
        mes = m;
        anotacao = nota;
    }

    private void validaData() {
        if (dia<1 || dia > 31 || mes <1 || mes > 12) {
            dia = 0;
            mes = 0;
            anotacao = "Anotação não inserida por data inválida";
        }
    }

    public void mostrarAnotacao() {
        System.out.println(dia + "/" +  mes + ":" + anotacao);
    }
}
