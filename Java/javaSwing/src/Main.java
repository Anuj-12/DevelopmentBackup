import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("BambooAtNight.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 3);

        JLabel label = new JLabel();    //create a label
        label.setText("POOP IN MY PANTS!!!"); //set text for a label
        label.setIcon(image);   //add the image
        label.setHorizontalTextPosition(JLabel.CENTER); //set text pos relative to the image (can be LEFT, CENTER, RIGHT)
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(83, 109, 252)); //set text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));     //set Font of text
        label.setIconTextGap(20);   //distance between text and image
        label.setBackground(Color.black);   //set background color
        label.setOpaque(true);  //actually show background color
        label.setBorder(border); //set boarder
        label.setVerticalAlignment(JLabel.CENTER);  //set Vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER);    //set Horizontal position of icon and text within label
        //label.setBounds(90,100, 350, 350); //set the pos and size of the label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        //frame.setLayout(null);  //no more layout manager and need to configure the pos and size of the label manually
        frame.add(label);   //actually add the label to the frame default centers the text and image and adds it to the left
        frame.pack(); //label size = frame size  **add all the label stuff before pack**
        //frame.setResizable(false);
        ImageIcon icon = new ImageIcon("debianLogo.png");
        frame.setIconImage(icon.getImage());
    }
}
