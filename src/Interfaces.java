public class Interfaces {
    private int id = 7;
    public void start() {
        System.out.println("Machine started");
    }







    public static class People {
        private String name;

        public People(String name) {
            super();
            this.name = name;
        }

        public void greet() {
            System.out.println("Hello there !!! ");
        }

    }




    public static class App {
        public static void main(String[] args) {
            Interfaces interface1 = new Interfaces();
            interface1.start();

            People pe1= new People("Angus");
            pe1.greet();
        }
    }
}

