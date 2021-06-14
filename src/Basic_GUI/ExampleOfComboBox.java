package Basic_GUI;
import javax.swing.*;

public class ExampleOfComboBox {
    JFrame frame;
    ExampleOfComboBox(){
        frame = new JFrame("ExampleOfComboBox");
        String name[] = {"sajjad","arif","nafiul","arman","mahdi"};
        JComboBox jbox = new JComboBox(name);
        jbox.setBounds(50,50,90,20);
        frame.add(jbox);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ExampleOfComboBox();
    }
}
