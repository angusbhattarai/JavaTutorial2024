import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
/*
        System.out.println("Enter a number");

        int value= input.nextInt();

        while(value!=5){

            System.out.println("Enter a number: ");
            value= input.nextInt();
        }
*/

        int value=0;
        do{
            System.out.println("Enter a number");
            value= input.nextInt();

        }
        while (value !=5);

        System.out.println("Got 5!");

    }


}
