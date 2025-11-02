import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter two numbers \n");
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int sum;
        sum = a+b;
        System.out.println("The sum is " +sum);
    }

}
