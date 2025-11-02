public class IncrementDecrement {
    public static void main(String[] args) {
        // Postfix example (i++)
        int i = 5;
        int j = i++;
        System.out.println("--- Postfix (i++) ---");
        System.out.println("Original value of i: 5");
        System.out.println("j = i++;");
        System.out.println("Value of j: " + j); // j gets the value of i (5) before it's incremented
        System.out.println("Value of i: " + i); // i is now 6

        // Reset i for the next example
        i = 5;

        // Prefix example (++i)
        int k = ++i;
        System.out.println("\n--- Prefix (++i) ---");
        System.out.println("Original value of i: 5");
        System.out.println("k = ++i;");
        System.out.println("Value of k: " + k); // i is incremented (to 6) before its value is used in the assignment
        System.out.println("Value of i: " + i); // i is also 6
    }
}