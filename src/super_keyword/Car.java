package super_keyword;

public class Car extends Vehicle{

    int gear;

    Car(String color, double weight , int gear){
        super(color,weight);   // calling Vehicle class constructor .
        this.gear = gear;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("gear : "+gear);
    }
}
