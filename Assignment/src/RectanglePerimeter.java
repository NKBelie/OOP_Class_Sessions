import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        float W =Scanner.nextInt();
        System.out.println("Enter the height");
        float H = Scanner.nextInt();
        float Perimeter;
        Perimeter= W * H;
        System.out.println("The Rectangle Of perimeter =" + Perimeter);

    }
}
