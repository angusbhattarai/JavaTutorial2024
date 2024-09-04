package world.plant;

public class Field {
    Plant plant= new Plant();

    public Field(){
        // size is protected ; Field is in the same package as Plant.
        System.out.println(plant.size);

    }
}
