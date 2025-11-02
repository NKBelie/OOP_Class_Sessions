import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String expectedUsername = "Belie";
        String expectedPassword = "123";

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user for username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Prompt user for password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Check if username and password match using the logical AND operator (&&)
        if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        // Close the scanner
        input.close();
    }
}