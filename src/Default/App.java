package Default;

import world.plant.Plant;

/*
1. private---- only within same class
2. public------ from anywhere
3. protected----- same class, subclass, and same package
4. no modifier---- same package only
 */

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

       //Won't work --- type is private
       // System.out.println(plant.type);

        // size is protected---- App is not in the same package ad Plant. won't work
        //System.out.println(plant.size);

        // Won't work ---- App and plant in different packages, height has package-level vissibility.
       // System.out.println(plant.height);
    }
}
