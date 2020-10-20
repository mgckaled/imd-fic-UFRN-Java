package aulasPOO.poo05;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String data;

    public void anotarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private void validarData() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0 || ano > 9999) {
            dia = 0;
            mes = 0;
            ano = 0;
            data = "Anotação não inserida por data inválida";
        }
    }

    public String getDataAtual() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);

    }

    public void mostrarData() {
        System.out.println(dia + "/" + mes + "/" + ano);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
