public class StringBuilderAndStringFormatting {
    public static void main(String[] args) {
        //Inefficient
        String info= "";

        info+="My name is Angus .";
        info+=" ";
        info+="I am a builder . ";
        System.out.println(info);

        //more efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Leo");
        sb.append(" ");
        sb.append("I am a lion tamer");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder("");
        s.append("My name is Mark . ");
        s.append(" ");
        s.append("I am a pilot");
        System.out.println(s.toString());

        ///Formatting////////
        System.out.println("Here is some text. \tThat was a tab . \nThat was a newline . ");
        System.out.println("More text");

     /////Formatting integer////
        System.out.printf("Total cost %d; quantity is %d\n ", 5, 120);

        for (int i=0; i<20; i++){
            System.out.printf("%-2d: some text here\n", i);
        }
        ////Formatting floating point variable/////
        System.out.printf("Total value: %.2f\n", 5.6);
        System.out.printf("Total value: %3.2f\n", 223.5484849);





    }
}
