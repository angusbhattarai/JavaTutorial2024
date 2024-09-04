class  Persons{
    String name;
    int age;

    //Methods
    void speak(){
        System.out.println("My name is "+ name+ " "+ "I am "+ age+" "+" years old");

    }
}



public class Methods {
    public static void main(String[] args) {
        Persons student1= new Persons();
        student1.name="Angus Bhattarai";
        student1.age=23;
        student1.speak();

        Persons student2= new Persons();
        student2.name="John Bhattarai";
        student2.age=24;
        student2.speak();


        System.out.println(student1.name);
        System.out.println(student2.name);



    }
}
