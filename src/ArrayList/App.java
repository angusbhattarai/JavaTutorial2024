package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
     // Adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

    // Retrieving
        System.out.println(numbers.get(1));

        System.out.println("\nIteration #1: ");

    // Indexed for loop iteration
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // Removing items (careful!!)
        numbers.remove(numbers.size() -1);

        // This is very slow
        numbers.remove(0);


        System.out.println("\nIteration #2: ");
        for (Integer value: numbers){
            System.out.println(value);
        }

        // List interface...
        List<String> values = new ArrayList<String>();




    }
}
