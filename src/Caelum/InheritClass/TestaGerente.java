package Caelum.InheritClass;
/*

A nomenclatura mais encontrada é que Funcionario é a superclasse de Gerente, e
Gerente é a subclasse de Funcionario. Dizemos também que
'tod@' Gerente é um Funcionário. Outra forma é
dizer que Funcionario é classe mãe de Gerente e Gerente é classe filha de Funcionario.
 */


public class TestaGerente {
    public static void main(String[] args) {

        // Instâciando um objeto de classe 'Gerente'
        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();

        // podemos chamar métodos de Funcionários
        gerente.setNome("joão da Silva");
        // e também métodos de Gerente
        gerente.setSenha(4321);

        funcionario.setSalario(1500); // 10% de aumento para o funcionário
        gerente.setSalario(5000.0); // 15% de aumento para o gerente
        System.out.println(funcionario.getBonificacao());
        System.out.println(gerente.getBonificacao());
    }
}
