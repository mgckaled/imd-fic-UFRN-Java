package aulasPOO.poo05;

// Encapsulamento

//

public class Principal {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();

        // os atributos da classe Agenda estão envelopados
        // Seu acesso está restrito ao uso da própria classe agenda.
        // no caso os objetos instanciados.
        agenda1.anote(12,10,"Dia da Criança");
        agenda2.anote(7,15,"Independência do Brasil");

        agenda1.mostrarAnotacao();
        agenda2.mostrarAnotacao();

    }
}
