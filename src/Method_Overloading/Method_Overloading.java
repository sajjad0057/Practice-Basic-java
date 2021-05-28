package Method_Overloading;

public class Method_Overloading {
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(double a , double b){
        System.out.println(a+b);  // overloaded method
    }
    void add(double a , double b , double c){
        System.out.println(a+b+c);    //overloaded method
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.add(5,6);
        obj.add(5.5,6);
        obj.add(5,6,7);
    }
}
