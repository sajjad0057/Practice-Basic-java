package abstraction;

public class UserTwo extends MobileUser{
    UserTwo(int mobile_no,String mess){
        super(mobile_no,mess);
    }
    @Override
    void sendMessage(){
        System.out.println(super.message);
    }
}
