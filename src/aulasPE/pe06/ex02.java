package aulasPE.pe06;

public class ex02 {
    public static void main(String[] args) {

        int[][] m= new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==j){
                    // quando i e j são iguais, alterar valor da matriz para 1
                    m[i][j]=1;
                }else{
                    // quando diferente, alterar para 0
                    m[i][j]=0;
                } } }
        System.out.println(m[3][3]); // 1, pois i e j são iguais
        System.out.println(m[4][5]); // 0, pois i e j diferentes.
        System.out.println(m[3][3] + m[4][5]); // 1
    }}
