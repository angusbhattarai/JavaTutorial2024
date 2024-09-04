
public class RuntimeVsCheckedExceptions {
    public static void main(String[] args) {

        String[] texts = {"One", "Two", "Three"};


        try{
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

    }
}
