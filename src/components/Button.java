package components;

/*
 * Created by Dival Banerjee on 11/19/2016.
 * Custom Button Component for Java GUI
 * Looks better than the JButton class
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;

public class Button extends JPanel {
    //button properties or variables
    Font myFont = new Font("Helvetica", Font.PLAIN, 20);
    String myButtonText = "New Button";
    private int myButtonPadding = 3;
    private int myButtonWidth = 150;
    private int myVerticalShift = 0;
    private int myButtonHeight = 60;
    private Color myPaddingColor = Color.darkGray;
    private Color myBackColor = Color.gray;

    int myPush = 0;
    int myButtonposx = 0;
    int mtButtonposy = 0;

    public Button() {
    }

    public Button(Color backColor){
        this.myBackColor = backColor;
    }

    public Button(Color backColor, Color paddingColor, String buttonText){
        this.myBackColor = backColor;
        this.myPaddingColor = paddingColor;
        this.myButtonText = buttonText;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        myVerticalShift = getHeight() / 2 - myButtonHeight / 2;
        g.setFont(myFont);

        //padded rectangle drawn
        g.setColor(new Color(144, 12, 63));
        g.fillRoundRect(20 + this.myButtonPadding, myVerticalShift + this.myButtonPadding, this.myButtonWidth, this.myButtonHeight, 25, 25); //xpos, y pos, width, height

        //padded
        g.setColor(this.myBackColor);
        g.fillRoundRect(20 + this.myPush, myVerticalShift + this.myPush, this.myButtonWidth, this.myButtonHeight, 25, 25); //xpos, y pos, width, height

        g.setColor(this.myPaddingColor);
        //g.drawString(myButtonText,(int)(getWidth()/2-myButtonText.length()*myFont.getSize()/2), (int)(getHeight()/2*myFont.getSize()/2));
        g.drawString(this.myButtonText, -30 + this.myButtonWidth / 2, myVerticalShift + 5 + this.myButtonHeight / 2);
    }

    public void setFont(Font font) {
        this.myFont = font;
    } //change font

    public void setText(String buttonText) {
        this.myButtonText = buttonText;
    } //Change text

    public void setPadding(int paddingAmount) {
        this.myButtonPadding = paddingAmount;
    } //Change text

    public void setPaddingColor(Color paddingColor) {
        this.myPaddingColor = paddingColor;
    } //change padding color of button

    public void setBackColor(Color backColor){
        this.myBackColor = backColor;
    }

    public void push(Boolean Pushed) {
        if (Pushed = true) {
            this.myPush = this.myButtonPadding;
        } else if (Pushed = false) {
            this.myPush = 0;
        }
    }
}
