package EnumTypes;

public enum Roles {

    ADMIN("0"), BRANCH_MANAGER("1"), TELLER("2");
    private String name;

    Roles(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }



}
