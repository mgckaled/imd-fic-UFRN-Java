package aulasPOO.poo03;

public class a05 {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa Java");

        // Um objeto ou instância é criado através de operador 'new'
        // objeto = instância
        // lado esquerdo: declara uma variável do tipo 'Carro', referência ao mesmo objeto.
        // lado direito: Cria o objeto na memória e retorna sua referência para a variável.
        Carro meuCarro = new Carro();
        Carro outroCarro = new Carro();

        // usar os métodos 'sets' para deninir os atributos
        meuCarro.setTipo("Sedan");
        meuCarro.setCor("Cinza");
        meuCarro.setPlaca("GUZ0197");
        outroCarro.setTipo("Hatch");
        outroCarro.setCor("Branco");
        outroCarro.setPlaca("GUZ0000");


        // usar os métodos 'gets' para retonar o atributos
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Tipo: " + outroCarro.getTipo());
        System.out.println("Cor: " + outroCarro.getCor());
        System.out.println("Placa: " + outroCarro.getPlaca());
    }
}
