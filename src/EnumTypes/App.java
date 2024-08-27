package EnumTypes;

public class App {

    public static void main(String[] args) {

        Animal animal = Animal.LION;

        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;

            case CAT:
                System.out.println("Cat");
                break;

            case LION:
                System.out.println("lion");
                break;

            default:
                break;

        }

        System.out.println(Animal.DOG);

        System.out.println("Enum name as a string: "+ Animal.DOG.name());

        System.out.println(Animal.CAT.getClass());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.LION.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);

    }
}
