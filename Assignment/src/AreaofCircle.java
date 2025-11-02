import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        final float pi=3.14f;
        System.out.println("Enter the value of Radius \n");
        float radius = Scanner.nextInt();

        float Area;
        Area=pi*(radius*radius);
        System.out.println("Area of Circle = " +Area);


    }
}
