class Person {
    String name;
    int age;

   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }
   public void printDetails() {
       System.out.println("Name " + this.name);
       System.out.println("Age " + this.age);
   }
    public static void main(String[] args) {
            Person person1 = new Person("Belie", 10);

            System.out.println("Person Details:");
            person1.printDetails();
        }
    }

