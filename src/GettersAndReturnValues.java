class Student{
    String name;
    int age;

    void speaks(){
        System.out.println("My name is "+ " "+name);

    }

    int calculateYearsToRetirement(){
        int yearsLeft= 65 - age;
        return yearsLeft;



    }

    int getAge() {
        return age;

    }
    String getName(){
        return name;
    }


}


public class GettersAndReturnValues {
    public static void main(String[] args) {
        Student person1=new Student();
        person1.name="Angus";
        person1.age=24;
        person1.speaks();

        int years= person1.calculateYearsToRetirement();
        System.out.println("Years till retirements "+ years);

        int age= person1.getAge();
        String name=person1.getName();

        System.out.println("Name is "+ name);
        System.out.println("Age is "+ age);





    }
}
