package Interface;

public class Cat implements Animal,AnimalDetails{
    public void eat(){
        System.out.println("Cat eat milk !");
    }

    @Override
    public void details() {
        System.out.println("cat has four leg. and this cat name tuna");
    }
}
