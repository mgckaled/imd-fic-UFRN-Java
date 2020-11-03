package aulasPOO.poo12.ExemploExcecoes;

// Essa classe herda atributos e métodos da classe built-in "Exception"
public class QuantidadeException extends Exception {

    // Método Constructor
    // Super para chamar o construtor da classe mãe (Exception)
    public QuantidadeException(String mensagem) {
        super(mensagem);
    }
}
