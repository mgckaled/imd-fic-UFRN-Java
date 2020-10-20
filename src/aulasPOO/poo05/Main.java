package aulasPOO.poo05;

public class Main {
    public static void main(String[] args) {

        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();

        data1.setDia(1); data1.setMes(5); data1.setAno(1985);
        data2.setDia(15); data2.setMes(1); data2.setAno(1988);
        data3.setDia(31);data3.setMes(12); data3.setAno(2020);

        data1.mostrarData();
        data2.mostrarData();
        data3.mostrarData();


    }
}
