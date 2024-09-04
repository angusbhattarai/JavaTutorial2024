import java.util.ArrayList;

class Machiness{
    public String toString(){
        return "I am a machine";

    }

    public void start(){
        System.out.println("Machine starting");
    }

}

class Cameras extends Machiness{
    public String toString(){
        return "I am a camera";
    }

    public void snap(){
        System.out.println("Snap!!");
    }

}


public class GenericsAndWildcards {
    public static void main(String[] args) {


        ArrayList<Machiness> list1 = new ArrayList<Machiness>();
        list1.add(new Machiness());
        list1.add(new Machiness());

        ArrayList<Cameras> list2 = new ArrayList<Cameras>();

        list2.add(new Cameras());
        list2.add(new Cameras());

        showList(list2);
        showList2(list1);
        showList3(list2);

    }

    public static void showList(ArrayList<? extends Machiness> list) {
        for (Machiness value : list) {
            System.out.println(value);
        }

    }

    public static void showList2(ArrayList<? super Cameras> list) {
        for (Object value : list) {
            System.out.println(value);

        }

    }

    public static void showList3(ArrayList<?> list){
        for (Object value : list){
            System.out.println(value);
        }
    }
}

