import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;


public class App {
    public static void main(String[] args) throws Exception {

         JFrame frame = new JFrame("Sports");

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         frame.setSize(600, 600);
        
        JLabel label = new JLabel();
        frame.add(label);
 
        try {
             BufferedImage image = ImageIO.read(new File("src\\Swimming.jpg"));
             label.setIcon(new ImageIcon(image));

        } catch (Exception e) {

            System.out.println("Something went wrong...");

        }

         frame.setVisible("True");

    
    }
}