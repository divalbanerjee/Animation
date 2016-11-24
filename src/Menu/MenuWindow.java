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
    Container container;
    private JLabel lblTitle = new JLabel("Elon Musk and the Quest for a Fantastic Future"); //title

    public MenuWindow() {
        container = getContentPane();
        //scaled background
        //Open the background image
        try {
            BufferedImage imgBackground = ImageIO.read(new File("src/files/Images/menu.jpg"));
            BackGroundPanel backGround = new BackGroundPanel(imgBackground, 0);

            configureUI(); //sets up fonts, colors, layouts for components

            btnPlay.addMouseListener(new btnPlayListener());

            btnScores.addMouseListener(new btnScoresListener());

            btnExit.addMouseListener(new btnExitListener());

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

        public void configureUI(){
            btnPlay.setCenter(true);
            btnPlay.setButtonWidth(300);

            btnScores.setButtonWidth(300);
            btnScores.setCenter(true);

            btnExit.setCenter(true);
            btnExit.setButtonWidth(300);

            lblTitle.setForeground(Color.white);
            lblTitle.setFont(font30Pt);

            lblTitle.setHorizontalAlignment(JLabel.CENTER);
        }

    public class btnPlayListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            btnPlay.push(true);
            //remove the previous game window
            container.removeAll();
            //add a new game window
            container.setBackground(Color.black);
            container.add(new Game.GameWindow());

        }
    }
    public class btnScoresListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            btnScores.push(true);
            //Switch to scores window
        }
    }
    public class btnExitListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            btnExit.push(true);
            //Close the game
            System.exit(0);
        }
    }
}


