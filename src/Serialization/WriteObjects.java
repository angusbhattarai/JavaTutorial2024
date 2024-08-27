package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects....");

        Person angus = new Person(543, "Angus");
        Person robert = new Person(612, "Robert");

        System.out.println(angus);
        System.out.println(robert);

       try ( FileOutputStream fs = new FileOutputStream("people.bin")){

           ObjectOutputStream os = new ObjectOutputStream(fs);

           os.writeObject(angus);
           os.writeObject(robert);
           os.close();

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
