package Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import components.Button;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Dival Banerjee on 11/19/2016.
 */
public class MenuWindow extends JFrame {

    //Fonts
    private Font font30Pt = new Font("Helvetica",Font.PLAIN, 30);
    private Font font20Pt = new Font("Helvetica" , Font.PLAIN, 20);
    //Buttons
    private Button btnPlay = new Button(new Color(3,169,244), new Color(2,136, 209), "Play");
    private Button btnScores = new Button(new Color(3,169,244), new Color(2,136, 209), "View Scores");
    private Button btnExit = new Button(new Color(3,169,244), new Color(2,136,209), "Quit Game");
    BufferedImage imgBackground; // background image

    private JLabel lblTitle = new JLabel("Elon Musk and the Quest for a Fantastic Future"); //title

    public MenuWindow() {
        Container container = getContentPane();
        //scaled background
        //Open the background image
        try {
            BufferedImage imgBackground = ImageIO.read(new File("src/files/Images/menu.jpg"));
            BackGroundPanel backGround = new BackGroundPanel(imgBackground, 0);

            configureUI(); //sets up fonts, colors, layouts for components
            backGround.add(lblTitle);
            backGround.add(btnPlay);
            backGround.add(btnScores);
            backGround.add(btnExit);
            container.add(backGround);
            // container.add(buttonPanel);

        } catch (IOException e) {
            e.printStackTrace();
            container.setBackground(Color.black);
            System.out.println("Opening the image file failed");
        }
    }

        //container.add(btnPlay);
        public void configureUI(){
            btnPlay.setCenter(true);
            btnPlay.setButtonWidth(300);
            btnPlay.addMouseListener(new btnPlayListener());

            btnScores.setButtonWidth(300);
            btnScores.setCenter(true);
            btnScores.addMouseListener(new btnScoresListener());

            btnExit.setCenter(true);
            btnExit.setButtonWidth(300);
            btnExit.addMouseListener(new btnExitListener());

            lblTitle.setForeground(Color.white);
            lblTitle.setFont(font30Pt);

            lblTitle.setHorizontalAlignment(JLabel.CENTER);
        }

    public class btnPlayListener extends MouseAdapter{
        public void MousePressed(MouseEvent e){
            btnPlay.push(true);
            //Switch to game window
        }
    }

    public class btnScoresListener extends MouseAdapter{
        public void MousePressed(MouseEvent e){
            btnScores.push(true);
            //Switch to scores window
        }
    }

    public class btnExitListener extends MouseAdapter{
        public void MousePressed(MouseEvent e){
            btnExit.push(true);
            //Close the game
            System.exit(0);
        }
    }
}


