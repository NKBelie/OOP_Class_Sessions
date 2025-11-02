import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter OOP Marks /100");
        float oop =Scanner.nextFloat();
        System.out.println("Enter Requirement Marks /100");
        float Req = Scanner.nextFloat();
        System.out.println(" Enter English Marks /100");
        float Eng=Scanner.nextFloat();
        System.out.println("Enter Math Marks /100");
        float Math= Scanner.nextFloat();
        System.out.println("Enter Linux Marks /100");
        float Linux=Scanner.nextFloat();

        float Average;
        Average=(oop+Req+Eng+Math+Linux) /5;
        System.out.println(" The Average of 5 Subject = " + Average);

    }
}
