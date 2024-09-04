import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        /*
       //Create Scanner Object
        Scanner input=new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a line of text:");

       //Wait for the user to enter a line text
        String line = input.nextLine();

        //Tell the what they entered
        System.out.println("You entered: "+ line);
    }

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer value :");

        int myInt = input.nextInt();

        System.out.println("You entered: " + myInt);

    }
}
