import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

      MyFrame(){
        this.setTitle("This is the window Title"); //set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //by default the frame only hides when the cross button is pressed
        this.setResizable(false);  //cant resize it now
        this.setSize(420, 420);    //set the dimensions of the frame
        this.setVisible(true);     //can actually see the frame now

        ImageIcon image = new ImageIcon("debianLogo.png");  //create an image icon
        this.setIconImage(image.getImage());   //set the image icon for the frame
        this.getContentPane().setBackground(new Color(0,0,0));  //Change color of background
    }
}