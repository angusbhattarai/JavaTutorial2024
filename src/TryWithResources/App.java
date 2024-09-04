package TryWithResources;

class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing !!");
        throw new Exception("Oh no !");

    }
}





public class App {
    public static void main(String[] args) {

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
