package studyswingwxample;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){
        /*
        JFrame frame = new JFrame();
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("My frame");
        frame.setSize(new Dimension(400, 500));
        frame.setLocation(500, 300);
        //frame.setLocation(new Point(100, 50));
        frame.setBounds(250, 250, 350, 350);
        frame.setResizable(false);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("2_Knitting Balls.jpg"));
        */

    this.setDefaultCloseOperation(3);
    this.setBounds(40, 50, 300, 500);
    this.setTitle("My second frame");
    //this.pack();
    }


    public static void main(String[] args) {
        new Main().setVisible(true);


    }
}
