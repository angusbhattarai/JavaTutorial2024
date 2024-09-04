package world.plant;

public class Oak extends Plant{
    public Oak(){
        // Won't work-----type is protected
       // type= "tree";


        // This works----size is protected, oak is a subclass of plant.
        this.size= "Large";

        // No access specifier---- works because Oak and plant in same package.
        this.height= 10;

    }


    }
