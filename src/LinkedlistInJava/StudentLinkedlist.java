package LinkedlistInJava;

import java.util.LinkedList;

public class StudentLinkedlist {
    public static void main(String[] args) {
        LinkedList<Student> std_list = new LinkedList<Student>();

        Student s1 = new Student("sajjad","one",111);
        Student s2 = new Student("kona","Two",222);
        Student s3 = new Student("Rafiyat","Three",333);
        Student s4 = new Student("mahimuna","four",444);


        std_list.add(s1);
        std_list.add(s2);
        std_list.add(s3);
        std_list.add(s4);

        for (Student s : std_list){
            System.out.println("name : "+s.name+". class name : "+s.class_name+". Roll : "+s.roll);
        }


    }

}
