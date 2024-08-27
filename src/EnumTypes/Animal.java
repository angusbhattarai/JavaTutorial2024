package EnumTypes;

public enum Animal {

    DOG ("Fido"), CAT("Fergus") , LION("King");
    private String name;

    Animal(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "This animal is called: "+ name;
    }


}
