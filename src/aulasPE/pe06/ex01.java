package aulasPE.pe06;

public class ex01 {
    public static void main(String[] args) {

        int m=10;
        int n=10;
        int[][] mtz= new int[m][n];
        int c=0;

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                mtz[i][j]=0;
                // incremento de 100 vezes 10 do 1º loop x 10 º2 loop
                c=c+1;
            }
        }
        System.out.println(m * n);
        System.out.println(c==(m*n)); // retorna true, pois 100 = 100.
    }
}
