class Machines{
    public void start(){
        System.out.println("Machines started");
    }
}

class Camera extends Machines{
    public void start(){
        System.out.println("Camera started");
    }

    public void snap(){
        System.out.println("Photo taken");
    }
}


public class UpcastingAndDowncasting {
    public static void main(String[] args) {

        Machines machine1 = new Machines();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machines machine2 = camera1;
        machine2.start();

        // Error... machines2.snap();

        // Downcasting
        Machines machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        Machines machine4 = new Camera();
        Camera camera3 = (Camera) machine4;
        camera3.start();
        camera3.snap();

       // Doesn't work------run time error
        // Machines machine5 = new Machines();
        // Camera camera4 = (Camera) machine5;
        //camera4.start();
        //camera4.snap();



    }
}
