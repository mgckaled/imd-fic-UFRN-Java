package aulasPOO.poo12.ExemploExcecoes;

import java.util.HashMap;
import java.util.HashSet;

public class Cozinha {
    //Atributos de Classe

    private HashSet<Receita> receitas; // Set porque a lista não pode ter receitas repetidas
    private HashMap<String, Float> estoque; // Map para incluir um conjunto de tipos de dados

    // Método Constructor
    public Cozinha() {
        // Inicializar
        receitas = new HashSet<Receita>();
        estoque = new HashMap<String, Float>();
    }

    public void AdicionarNoEstoque(String ingrediente, float quantidade) throws QuantidadeException {
        if (quantidade <=0) {
            throw new QuantidadeException("Só pode adicionar no estoque quantidades positivas.");
        }
        // Se o ingrediente foi adicionado anteriormente no estoque
        // Pegar a quantidade informada
        // Incrementar com a quantidade anterior.
        if (estoque.containsKey(ingrediente)) {
            Float quantidadeAnterior = estoque.get(ingrediente);
            quantidade += quantidadeAnterior;
        }
        estoque.put(ingrediente, quantidade);
    }

    // Método cujo atributo é um HashSet
    public void AdicionarReceita (Receita receita) throws Exception {
        // Se a receita já existe, disparar uma mensagem (exceção)
        if (receitas.contains(receita)) {
            throw new Exception("Receita já adicionada.");
        }
        // Adicionar receita no Set.
        receitas.add(receita);
    }

    void prepararReceita(Receita receita) throws Exception {
        System.out.println("Preparando " + receita.getNome());

        // Se a receita não existir, lançar mensagem de exceção.
        if (!receitas.contains(receita)) {
            throw new Exception("A cozinha não sabe preparar essa receita");
        }

        // Preparar receita
        //for (var ingrediente : receita.getIngredientes().entrySet()) {
        // String ingredienteNome = ingrediente.getKey();
        // Float quantidadeParaReceita = ingrediente.getValue();
        // }
    }

    void limparFogao() {
        System.out.println("Limpando o fogão");
    }

    public HashSet<Receita> getReceitas() {
        return receitas;
    }

    public HashMap<String, Float> getEstoque() {
        return estoque;
    }
    
}
