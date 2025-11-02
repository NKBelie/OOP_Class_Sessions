import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = Scanner.nextInt();
        if (Age >=18){
            System.out.println("You are Adult " +Age);
        }
        else {
            System.out.println("You are Minor " +Age);
        }
    }
}
