package TheTransientKeyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects....");

        try(FileOutputStream fs = new FileOutputStream("test.ser")){

            ObjectOutputStream os = new ObjectOutputStream(fs);

            Person person = new Person(7, "Angus");
            Person.setCount(88);
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
