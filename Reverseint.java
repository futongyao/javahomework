import java.util.Scanner;

public class Reverseint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int x= input.nextInt();
        int y=reverse(x);
        System.out.println("reversed:"+y);
    }
        public static int reverse(int number){
            int a = 0;
            while (number != 0) {
                int b = number % 10;
                number = number / 10;
                a = a * 10 + b;
            }
            return a;
        }
}
