import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Num1, Num2, Sum, Multi,Division, Sub ;
        System.out.println(" Enter first Value");
        Num1 = input.nextDouble();

        System.out.println("Enter Second Value");
        Num2 = input.nextDouble();

        Sum=Num1 + Num2;
        System.out.println("Sum =" + Sum);
        Multi=Num1* Num2;
        System.out.println("Multiplication = " + Multi);
        Division=Num1 /Num2;
        System.out.println("Division = " + Division);
        Sub= Num1 - Num2;
        System.out.println("Substraction = " + Sub);

    }
}
