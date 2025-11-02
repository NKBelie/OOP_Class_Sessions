import java.util.Scanner;
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String First =Scanner.nextLine();
        System.out.println("Enter Last Name");
        String Last= Scanner.nextLine();
        System.out.println(" Full Name Is " + First + ' ' +Last);
    }
}
