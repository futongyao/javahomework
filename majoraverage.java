import java.util.Scanner;

public class majoraverage {
    public static void main(String[] args){
        System.out.println("Enter a 4-by-4 matrix row by row：");
        double a[][];
        a=new double[4][4];
        double b=averageMajorDiagonal(a);
        System.out.print("Average of the elements in the major diagonal is："+b);
    }
    public static double averageMajorDiagonal(double[][] m){
        m=new double[4][4];
        int i,j;
        double sum=0,average;
        Scanner input=new Scanner(System.in);
        for(i=0;i<4;i++) {
            for (j=0; j<4; j++){
                m[i][j]=input.nextDouble();
                if(i==j){
                    sum=sum+m[i][j];
                }
            }
        }
        average=sum/4;
        return average;
    }
}
