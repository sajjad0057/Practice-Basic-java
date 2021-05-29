package Inheritance;

public class Teacher extends Person {
    //here teacher class inherite Person .
    private String Qualification;



    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    void displayInfo(){
//        System.out.println("Name : "+name);
//        System.out.println("Age : "+age);
        display();
        System.out.println("Qualification : "+Qualification);
    }

}
