package LambdaExpressions;

interface Executable {
    int execute(int a, int b);
}

interface StringExecutable{
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block....");
        int value = e.execute(12, 13);
        System.out.println("Return value is " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block....");
        int value = e.execute("Hello");
        System.out.println("Return value is " + value);
    }
}


public class App {

    public static void main(String[] args) {

        int c = 100;

        Runner runner = new Runner();
        runner.run(new Executable() {

            @Override
            public int execute(int a, int b) {
                System.out.println("Hello there !");

                return a + b + c;

            }
        });

        System.out.println("-----------------------");

        runner.run((int a, int b) -> {

            System.out.println("This is code passed in a lambda expression.");

            System.out.println("Hello there !");

            return a + b + c;

        });
    }
}
