import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


class Animal{

}




public class UsingGenerics {
    public static void main(String[] args) {

    //////////// Before java 5 //////////////
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);

     /////////// Modern style /////////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(2);
        System.out.println(animal);

        ////// There can be more than one type argument ///////
        HashMap<Integer, String>map = new HashMap<Integer, String>();

        ////// Java 7 style ////////////
        ArrayList<Animal> someList = new ArrayList<>();




    }
}
