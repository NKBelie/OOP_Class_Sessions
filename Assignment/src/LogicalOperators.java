public class LogicalOperators {
    public static void main(String[] args) {
        int a=10;
        if (a >= 9 && a<=12){
            System.out.println(a + " Is Btn 9 and 12" );
        }
        else {
            System.out.println(a + " Is Not Btn 9 and 12");
        }
        if (a >=12 || a<=9){
            System.out.println( a + " Is out the range 9 to 12");
       }
        else {
            System.out.println(a + " Is in the range 9 to 12");
        }
    }
}
