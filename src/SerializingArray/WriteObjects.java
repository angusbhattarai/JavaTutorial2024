package SerializingArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person[] people = {new Person(1, "Angus"), new Person(8, "Robert"), new Person(7 , "Elon")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try(FileOutputStream fs = new FileOutputStream("test.ser")){

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(people);

            os.writeObject(peopleList);

            os.writeInt(peopleList.size());

            for(Person person: peopleList){
                os.writeObject(person);
            }
            os.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
