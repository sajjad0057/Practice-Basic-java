package File_or_Directory;

import java.io.File;
import java.util.Scanner;


public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("/media/sajjad/New Volume_Pro/BasicJava/test/student.txt");
            Scanner scanner = new Scanner(file); // using Scanner class we can read data .

            while (scanner.hasNext()){
                String id = scanner.next();
                String name  = scanner.next();
                System.out.println("Id : "+id+". Name : "+name);

            }
            scanner.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
