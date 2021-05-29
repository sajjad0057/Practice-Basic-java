package varargs;

public class varargs {

    void add( int num1,int num2){
        System.out.println(num1+num2);
    }


    // varargs method.
    void anotherAdd(int ...num){   //data_type ...var_name is same as python args. ...var_name store arguments in array.
            int sum = 0;
            for (int x : num){
                sum +=x;
            }
        System.out.println(sum);
    }


    public static void main(String[] args) {

        varargs obj = new varargs();
        obj.add(1,3);
        obj.anotherAdd(1,2,3,5,6,7);
    }
}
