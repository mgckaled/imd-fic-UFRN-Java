package aulasPOO.InheritClass;

/*
 A classe gerente herda todos os atribuitos e métodos da classe Funcionário
 Gerente "extende" para funcionário
 Em qualquer momento que criarmos um objeto do tipo Gerente,
 este objeto possuirá também os atributos definidos na classe Funcionario, pois um Gerente é um Funcionario:
*/

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica (int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }

    /*
    Há como deixar explícito no seu código que determinado método é a
    reescrita de um método da sua classe mãe. Fazemos isso colocando @Override
    em cima do método. Isso é chamado "anotação". Existem diversas anotações e
    cada uma vai ter um efeito diferente sobre seu código.
     */

    @Override // ANOTAÇÃO
    public double getBonificacao() {
        return this.salario * 0.15;
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
