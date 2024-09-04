public class IfLoops {
    public static void main(String[] args) {
/*
        int myInt=20;

        if(myInt>30){
            System.out.println("Yes, it's true");
        }
        else if (myInt<10){
            System.out.println("No, it's false");
        }

        else{
            System.out.println("None of the above");
        }

    }
    */

        int loop = 0;

        while (true) {
            System.out.println("Looping :" + loop);
            if (loop == 5) {

                break;

            }

            loop++;

            System.out.println("Running");
        }

    }
}
