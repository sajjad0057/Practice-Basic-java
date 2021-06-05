package abstraction;

public class UserOne extends MobileUser{
    UserOne(int mobile_no,String mess){
        super(mobile_no,mess);
    }
    @Override
    void sendMessage(){
        System.out.println(super.message);

    }
}
