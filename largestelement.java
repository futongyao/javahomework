import java.util.Scanner;

public class largestelement {
    public static void main(String[] args){
        System.out.print("请输入10个数字： ");
        double a[];
        a=new double[10];
        int n=indexOfLargestElement(a);
        System.out.println("最大值下标为： "+n);
    }
    public static int indexOfLargestElement(double[] array){
        int i,j=0;
        array=new double[10];
        Scanner input=new Scanner(System.in);
        double max=0;
        for(i=0;i<10;i++){
            array[i]=input.nextDouble();
            if(array[i]>max){
                max=array[i];
                j=i;
            }
        }
        System.out.println("最大值为： "+max);
       return j;
    }
}
