package File_or_Directory;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("/home/sajjad/Desktop/test/");
        dir.mkdir();
        String path  = dir.getAbsolutePath();
        System.out.println("Dir path : "+path);
        System.out.println("Dir Name : "+dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName()+" directory has been deleted !");
        }
    }
}
