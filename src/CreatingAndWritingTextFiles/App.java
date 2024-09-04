package CreatingAndWritingTextFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file   = new File("/home/monk/IdeaProjects/JavaLarning/src/CreatingAndWritingTextFiles/test.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){

        br.write("Hello, Angus Bhattarai");
        br.newLine();

        br.write("How you doing ?");

        br.newLine();
        br.write("Where you from ?");

        } catch (IOException e) {
            System.out.println("Unable to read file" + file.toString());
        }

    }
}
