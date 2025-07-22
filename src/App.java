import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        
        // A JFrame to display the image...
        JFrame frame = new JFrame("Image Display");

        // This will make the Program Close when Image x thing is pressed...
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // The Code to display the Image Size for Image Width and Height when the program is run
        frame.setSize(1200, 1800); 

        // Create a Jlabel to display the metadata of the image
        JLabel label = new JLabel();
        frame.add(label);

        // Load The Image
        try {

            BufferedImage image = ImageIO.read(new File("src\\Cat.jpg"));
            label.setIcon(new ImageIcon(image));

        } catch (Exception e) {

            System.out.println("Something Went Wrong Sadly...");

        }

        frame.setVisible(true);
        
        

    }
}
