package aulasPOO.poo04;

public class Main {

    public static void main(String[] args) {

        Carro1 meuCarro1 = new Carro1();

        meuCarro1.setCor("preto");
		meuCarro1.setNumPortas(4);
        meuCarro1.setPlaca("MHX 1234");
        meuCarro1.setTipo("esportivo");

        Pessoa pessoa = new Pessoa();
		pessoa.setNome("Camila");
		pessoa.setIdade(27);

		System.out.println("Cor: "+ meuCarro1.getCor());
		System.out.println("Número de portas: "+ meuCarro1.getNumPortas());
		System.out.println("Placa: "+ meuCarro1.getPlaca());
		System.out.println("Tipo: "+ meuCarro1.getTipo());
		System.out.println("Pertence a: "+ meuCarro1.getDono().getNome());

    }
}
