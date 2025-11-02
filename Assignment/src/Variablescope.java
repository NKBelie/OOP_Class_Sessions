public class Variablescope {
        // This is a class-level (global) variable
        // It is accessible by all methods in this class
        static String className = "VariableScopeExample";

        public static void main(String[] args) {
            // This is a local variable, declared within the main method
            // It is only accessible inside this method
            String methodName = "main";
            int localNumber = 10;

            // We can access both the local and class-level variables here
            System.out.println("Inside " + methodName + " method.");
            System.out.println("Class-level variable className: " + className);
            System.out.println("Local variable localNumber: " + localNumber);

            // Call the method to demonstrate scope
            anotherMethod();
        }

        public static void anotherMethod() {
            // We can access the class-level variable here
            System.out.println("\nInside anotherMethod.");
            System.out.println("Class-level variable className: " + className);

            // We cannot access localNumber here, as it is out of scope
            // The following line would cause a compiler error:
            // System.out.println("Local variable localNumber: " + localNumber);
        }
    }
