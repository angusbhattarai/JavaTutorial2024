package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

       try ( FileInputStream fi = new FileInputStream("people.bin")){

           ObjectInputStream os = new ObjectInputStream(fi);

           Person person1 = (Person)os.readObject();
           Person person2 = (Person)os.readObject();


           os.close();

           System.out.println(person1);
           System.out.println(person2);

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }
}
