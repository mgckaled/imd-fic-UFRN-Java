package aulasPOO.poo03;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    String modelo;
    String tipoCambio;

    // a definição do método tem 5 partes básicas:
    // 1) tipo de acesso ao módulo (public, private, protected)
    // 2) nome do método
    // 3) o tipo do retorno, o qual pode ser um objeto ou um tipo primitivo ou vazio (void)
    // 4) um ou mais parâmetros
    // 5) finalmente, o corpo do método

    // definir o valor do atributo 'cor'
    void setCor(String cor) {

        // a palavra-chave 'this' representa a instância da Classe Carro.
        // Usa-se para diferenciar o atributo da classe do parâmetro do método
        this.cor = cor;
    }

    // recuperar o valor do atributo 'cor'
    String getCor() {
        return this.cor;
    }

    public String getTipo() {
        // não inclusão da palavra-chave 'this' por ausência de parâmetro do método
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
