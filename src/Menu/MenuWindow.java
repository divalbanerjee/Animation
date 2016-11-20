package Menu;

import javax.swing.*;
import java.awt.*;
import components.Button;


/**
 * Created by bandi on 11/19/2016.
 */
public class MenuWindow extends JFrame {

    //Fonts
    private Font font30Pt = new Font("Helvetica",Font.PLAIN, 30);
    private Font font20Pt = new Font("Helvetica" , Font.PLAIN, 20);
    //Buttons
    private Button btnPlay = new Button(new Color(2,136,209), new Color(3,169, 244), "Play");
    private Button btnScores = new Button(new Color(2,136,209), new Color(3,169,244), "View Scores");
    private Button btnExit = new Button(new Color(2,136,209), new Color(3,169,244), "Quit Game");

    private JLabel lblTitle = new JLabel("Elon Musk and the Quest for a Fantastic Future");

    public MenuWindow(){
        lblTitle.setFont(font30Pt);

    }
}
