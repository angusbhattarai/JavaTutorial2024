package TheTransientKeyword;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects....");

        try (FileInputStream fi = new FileInputStream("test.ser");) {
            ObjectInputStream os = new ObjectInputStream(fi);

            Person person = (Person)os.readObject();
            System.out.println(person);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}