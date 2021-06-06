package Interface;

public class Cow implements Animal,AnimalDetails{
    public void eat(){
        System.out.println("Cow eat Grass");
    }

    @Override
    public void details() {
        System.out.println("Cow has four leg");
    }
}
