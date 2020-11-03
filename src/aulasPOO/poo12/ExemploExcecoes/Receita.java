package aulasPOO.poo12.ExemploExcecoes;

import java.util.HashMap;

public class Receita {
    private String nome;
    // permite que cada criação de uma par dentro da variável
    private HashMap<String, Float> ingredientes;

    // Método Constructor
    public Receita(String nome) {
        ingredientes = new HashMap<String, Float>();
        this.nome = nome;
    }

    public void AdicionarIngrediente(String nome, Float quantidade) throws QuantidadeException, Exception {

        // se a quantidade for negativa, lançar exceção
        if (quantidade <= 0) {
            throw new QuantidadeException("Quantidade de "+ nome + " deve ser maior que 0.");
        }
        // Se já o ingrediente já foi adicionado na receita. Evitar repetição de ingrediente
        if (ingredientes.containsKey(nome)) {
            throw new Exception("Ingrediente já adicionado na receita.");
        }
        // caso não dispare exceção, os parâmetros são adicionados.
        this.ingredientes.put(nome, quantidade);
    }

    // Método Get --> variáveis de classe com acesso privado
    public String getNome() {
        return nome;
    }

    // Método Get --> variáveis de classe com acesso privado
    public HashMap<String, Float> getIngredientes() {
        return ingredientes;
    }
}