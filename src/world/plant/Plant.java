package world.plant;

public class Plant {
    // bad practice
    public String name;

    //Acceptable practice
    public final static int ID = 11;

    private String type;

    protected String size;

    int height;


    public Plant(){
        this.name = "Angus";

        this.type= "plant";

        this.size= "Large";

        this.height= 8;
    }
}
