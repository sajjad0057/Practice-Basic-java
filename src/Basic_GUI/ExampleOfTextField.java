package Basic_GUI;
import java.awt.*;  // awt = Abstract Window Toolkit


public class ExampleOfTextField {
    public static void main(String[] args) {
        Frame frame = new Frame("ExampleOfTextField");
        TextField t1,t2;
        t1 = new TextField("Welcome To GUI");
        t1.setBounds(60,110,200,35);
        t2 = new TextField("AWT Practice");
        t2.setBounds(60,200,200,35);
        frame.add(t1);frame.add(t2);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
