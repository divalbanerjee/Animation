/**
 * Created by bandi on 11/19/2016.
 */
import java.awt.*;
import javax.swing.*;
import Menu.MenuWindow;

public class Main {
    public static void main(String[]args){
        JFrame theGUI = new MenuWindow();
        theGUI.setTitle("Elon Musk and the Quest for a Fantastic Future");
        theGUI.setSize(1600,900);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theGUI.setVisible(true);
    }
}
