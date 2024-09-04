class Anything{
    private int id;
    private String name;

    public Anything(int id, String name){
        this.id= id;
        this.name= name;

    }

    public String toString(){
        return  String.format("%-4d: %s" , id, name);

        /*
        StringBuilder sb= new StringBuilder();
        sb.append(id);
        sb.append(" : ");
        sb.append(name);
        return sb.toString();

         */
    }

}

public class ToString {
    public static void main(String[] args) {
        Anything anything1= new Anything(18,"Angus");
        Anything anything2= new Anything(28,"Hary");

        System.out.println(anything1);
        System.out.println(anything2);


    }
}
