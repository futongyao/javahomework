import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Number> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一串数字，并以0结束： ");
    int number;
        do{
            number=input.nextInt();
            if(number!=0)
                list.add(number);
        }while (number!=0);
        System.out.println("您输入的数字是： ");
        for(int i=0;i< list.size();i++)
            System.out.print(list.get(i)+" ");
        System.out.println();
        sort(list,list.size());
        System.out.println("由小到大排列后为： ");
        for(int i=0;i< list.size();i++)
            System.out.print(list.get(i)+" ");
    }
    public static void sort(ArrayList<Number> list,int n) {
        if (n <= 1) return; //如果只有一个元素就不用排序了
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        //冒泡是把每轮循环中较大的数飘到后面
                // 数组下标是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (list.get(j).intValue() > list.get(j+1).intValue() ) {        //即这两个相邻的数是逆序的，交换
                    int temp = list.get(j).intValue();
                    list.set(j,list.get(j+1).intValue());
                    list.set(j+1,temp);
                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }

}
}
