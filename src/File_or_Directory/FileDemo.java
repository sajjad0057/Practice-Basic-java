package File_or_Directory;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("test");
        dir.mkdir();
        String path  = dir.getAbsolutePath();
        System.out.println("Dir path : "+path);
        System.out.println("Dir Name : "+dir.getName());
//        if(dir.delete()){
//            System.out.println(dir.getName()+" directory has been deleted !");
//        }

        File file1 = new File(path+"/student.txt");
        File file2 = new  File(path+"/Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created successfully");
        }catch (Exception e){
            System.out.println("An Exception occur : "+e);
        }
        if(file1.exists()){
            System.out.println("File Exists !");
        }else{
            System.out.println("File Dosenot Exists !");
        }
    }
}
