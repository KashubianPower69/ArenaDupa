import java.util.ArrayList;
import java.util.List;

public class Cannon {

    private String cannonName;
    private double accuracy;
    //private double fireRatio;
    private int focusFire = 0;
    private int numberOfShells = 3;
    private List<Shell> shells = new ArrayList<>();

    public Cannon(String cannonName, double accuracy) {
        this.cannonName = cannonName;
        this.accuracy = accuracy;
        //this.fireRatio = fireRatio; no i trzeba w konstruktorze dodać wtedy oraz get i set
        System.out.println("utowrzono " + cannonName);
        shellMaker();

    }

    private void shellMaker() {

        for (int i = 0; i < getNumberOfShells(); i++) {
            Shell shell = new Shell("Pocisk" + (i + 1), 20, 0.005);
            shells.add(shell);

        }
    }

    public void fire() {
        if(numberOfShells>0){
            shells.remove((getNumberOfShells() - 1));
            setNumberOfShells(numberOfShells - 1);
            System.out.println(cannonName + ": pozostało " + getNumberOfShells()+ " pocisków");
        } else {
            System.out.println(cannonName + " brak amunicji!");
        }

    }

    public String getCannonName() {
        return cannonName;
    }

    public void setCannonName(String cannonName) {
        this.cannonName = cannonName;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

      public int getFocusFire() {
        return focusFire;
    }

    public void setFocusFire(int focusFire) {
        this.focusFire = focusFire;
    }

    public int getNumberOfShells() {
        return numberOfShells;
    }

    public void setNumberOfShells(int numberOfShells) {
        this.numberOfShells = numberOfShells;
    }
}