class Machinesss{
    public void start(){
        System.out.println("Machine starting......");
    }
}

interface Plants{
    public void grow();
}



public class AnonymousClasses {
    public static void main(String[] args) {
        Machinesss machine1= new Machinesss(){

        @Override public void start(){
            System.out.println("Camera snapping!!!");
        }

        };
        machine1.start();

        Plants plant = new Plants() {
            @Override
            public void grow() {
                System.out.println("Plant growing!!!");

            }
        };
        plant.grow();

    }
}
