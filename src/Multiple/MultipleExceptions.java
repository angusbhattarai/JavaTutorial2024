package Multiple;


import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
    public static void main(String[] args) {

        Test test = new Test();

/*
        try {
            test.run();
        } catch (IOException e) {

            throw new RuntimeException(e);

        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
*/

        try {
            test.run();
        } catch (Exception e) {

            e.printStackTrace();
        }



    }
}
