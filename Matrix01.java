import java.util.Scanner;

public class Matrix01 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        printMatrix(x);
    }
    public static void printMatrix(int n){
        int a[][],i,j;
        a=new int[n][n];
        for(i=0;i<n; i++) {
            for (j=0; j<n; j++){
                double r=Math.random();
                int b= (int) Math.round(r);
                a[i][j]=b;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
