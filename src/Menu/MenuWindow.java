package Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import components.Button;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by bandi on 11/19/2016.
 */
public class MenuWindow extends JFrame {

    //Fonts
    private Font font30Pt = new Font("Helvetica",Font.PLAIN, 30);
    private Font font20Pt = new Font("Helvetica" , Font.PLAIN, 20);
    //Buttons
    private Button btnPlay = new Button(new Color(3,169,244), new Color(2,136, 209), "Play");
    private Button btnScores = new Button(new Color(3,169,244), new Color(2,136, 209), "View Scores");
    private Button btnExit = new Button(new Color(3,169,244), new Color(2,136,209), "Quit Game");
    BufferedImage imgBackground;

    private JLabel lblTitle = new JLabel("Elon Musk and the Quest for a Fantastic Future");

    public MenuWindow(){
        lblTitle.setFont(font30Pt);
        Container container = getContentPane();
         //scaled background
        //Open the background image
        try {
            File imgPath = new File("files/Images/menu2.jpg"); //FIXME: fails to open an image from file
            //  if(imgPath.exists() == true){
            BufferedImage imgBackground = ImageIO.read(imgPath);
            BackGroundPanel backGround = new BackGroundPanel(imgBackground,0);
            container.add(backGround);

        }catch(IOException e){
            e.printStackTrace();
            container.setBackground(Color.black);
        }

        btnPlay.setCenter(true);
        btnPlay.setButtonWidth(200);
        //container.add(btnPlay);

    }
}
