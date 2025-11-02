public class Q1 {
       int int_var;
       char char_var;
       float Float_var;
       double double_var;
       boolean boolean_var;
       byte byte_var;
       short short_var;
       long long_var;

       public void Printdefaults(){
           System.out.println("Default int :" + int_var);
           System.out.println("Default char : '" + char_var + "'");
           System.out.println("Default float :" + Float_var);
           System.out.println("Default double :" +double_var);
           System.out.println("Default boolean :" +boolean_var);
           System.out.println("Default byte :" +byte_var);
           System.out.println("Default short :" +short_var);
           System.out.println("Default long :" +long_var);
       }
       public static void main(String[] args) {
           Q1 dv = new Q1();
           dv.Printdefaults();

       }


}
