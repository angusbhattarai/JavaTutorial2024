package InnerClasses;

public class App {
    public static void main(String[] args) {

        Robot robot = new Robot(7);
        robot.start();

        // ...........This works only if the brain was declared public.........
        //Robot.Brain brain = robot.new Brain();
        //brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();



    }
}
