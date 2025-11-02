public class LeapYear {
    public static void main(String[] args) {
        int year=2032;
        if (year%4==0) {
            System.out.println("This year is leap year " + year);
        }
        else {
            System.out.println("This year is not leap year " + year);
        }
    }
}
