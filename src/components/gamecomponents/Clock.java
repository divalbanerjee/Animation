package components.gamecomponents;

import java.awt.*;

/**
 * Created by bandi on 11/19/2016.
 */
public class Clock {
    //variables
    private long mySeconds;
    private long myMinutes;
    private long myElapsedTime;
    private long myStartTime;
    private Color myColor;
    private Boolean myState;  //true represents that the clock has started, while false means the clock is stopped

    public Clock(){
        this.mySeconds = 0;
        this.myMinutes = 0;
        this.myColor = Color.white;
    }
    public void clockReset(){
        this.mySeconds = 0;
        this.myMinutes = 0;
    }
    public long getMinutes(){
        return this.myMinutes;
    }

    public long getMySeconds(){
        return this.mySeconds;
    }

    public void clockStart() {
        this.myStartTime = System.currentTimeMillis();
    }

    public void setElapsedTime(){
        this.myElapsedTime = System.currentTimeMillis() - this.myStartTime;
        this.mySeconds = (this.myElapsedTime/1000) %60;
        this.myMinutes = (this.myElapsedTime/1000)/60;
    }
    public void setCritical(Boolean Critical){
        if(Critical == false){
            this.myColor = Color.white;
        }
        if(Critical == true){
            this.myColor = Color.red;
        }
    }

    public void paint(Graphics g){
        Font font = new Font("Helvetica",Font.PLAIN, 30);
        g.setColor(this.myColor);
        g.drawString((this.myMinutes + ":" + this.mySeconds),10,0);
    }
}
