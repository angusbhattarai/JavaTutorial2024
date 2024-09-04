class Person{
    // Instance variable (data or "state")
    String name;
    int age;

    // Classes can contain
    //1. Data
    //2. subroutines(methods)
}




public class ClassesAndObject {
    public static void main(String[] args) {

        Person student1 =new Person();
        student1.name="Angus Bhattarai";
        student1.age=23;

        Person student2= new Person();
        student2.name="John Bhattarai";
        student2.age=24;

        System.out.println(student1.name);
        System.out.println(student1.age);

    }
}
