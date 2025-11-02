public class BMI {
    public static void main(String[] args) {
        int weight=60;// in kg
        float height=1.54f;// in m
        float bmi;
        bmi= weight/ (height * height);
        System.out.println("BMI is " + bmi);
        if (bmi<18.5){
            System.out.println("This Person is underweight ");
        } else if (bmi>=25.5) {
            System.out.println("This Person is Normal");

        }
        else if (bmi<30){
            System.out.println("This Person over weight ");
        }
        else {
            System.out.println("This Person is Obese");
        }
    }
}
