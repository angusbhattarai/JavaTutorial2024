package TryWithResources;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        File file = new File("/home/monk/IdeaProjects/JavaLarning/src/TryWithResources/test.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {

            System.out.println("Unable to read file " + file.toString());
        }

    }
}
