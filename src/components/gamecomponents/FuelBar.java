package components.gamecomponents;

import java.awt.*;

/**
 * Created by bandi on 11/19/2016.
 */
public class FuelBar {
    Font font = new Font("Helvetica",Font.PLAIN, 30);

    private int myRemainingFuel;

    public FuelBar() {
        this.myRemainingFuel = 120000;
    }

    public void addFuel(int amountOfFuel){
        this.myRemainingFuel = this.myRemainingFuel - amountOfFuel;
    }

    public void fuelBurn(int payLoadMass, int burnRate){
        this.myRemainingFuel = this.myRemainingFuel - (burnRate*payLoadMass);
    }

    public void paint(Graphics g){

    }

}
