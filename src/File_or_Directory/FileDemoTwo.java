package File_or_Directory;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileDemoTwo {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter("/media/sajjad/New Volume_Pro/BasicJava/test/student.txt");
            formatter.format("%s %s\n","101","sajjad");
            formatter.format("%s %s\n","435","zahan");
            formatter.close();
        }catch (FileNotFoundException e){
            System.out.println(e);

        }
    }
}
