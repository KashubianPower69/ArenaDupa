import java.util.ArrayList;
import java.util.List;

public class StarShip {

    private String shipName;
    private double hp;
    private int numberOfCannons;
    private char cannonType;
    private int aimX = 0;
    private int positionX;
    private boolean isDestroyed = false;
    private final List<Cannon> cannons = new ArrayList<>();


    public StarShip(String shipName, int hp, int numberOfCannons, char cannonType, int positionX) {
        this.shipName = shipName;
        this.hp = hp;
        this.numberOfCannons = numberOfCannons;
        this.cannonType = cannonType;
        this.positionX = positionX;
        System.out.println("Utworzono " + shipName);
        cannonMaker();
    }

    public void moveShip() {
        System.out.print(shipName +" zmienia pozycję z " + positionX + " X ");
        if (positionX > 1) {
            setPostitionX(positionX - 1); //tutaj lepiej bez settera?
        } else if (positionX < -1) {
            setPostitionX(positionX + 1);
        }
        System.out.println("na pozycję " + positionX + " X");
    }

    private void cannonMaker() {
        for (int i = 0; i < getNumberOfCannons(); i++) {
            Cannon cannon = new Cannon("Działo" + (i + 1), 0);
            cannons.add(cannon);
            if (cannonType == 'a') {
                cannon.setAccuracy(0.8);
            } else if (cannonType == 'b') {
                cannon.setAccuracy(0.7);
            } else {
                cannon.setAccuracy(0.6);
            }
        }
    }


    public void aim() {
        // ????
        System.out.println(shipName + " celuje na pozycję " + aimX + " X");
        for (Cannon cannon : cannons) { //gdybym chciał System.out.println(cannons.get(cannons.indexOf(cannon))); to jak override?
            cannon.setFocusFire(aimX);
        }
    }

    public void salvo() {
        System.out.println(shipName + " strzela!");
        for (Cannon cannon : cannons) {
            cannon.fire();
        }
    }

    public void setCannonType(char cannonType) {
        this.cannonType = cannonType;
    }

    public int getPostitionX() {
        return positionX;
    }

    public void setPostitionX(int postitionX) {
        this.positionX = postitionX;
    }

    public int getAimX() {
        return aimX;
    }

    public void setAimX(int aimX) {
        this.aimX = aimX;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getNumberOfCannons() {
        return numberOfCannons;
    }

    public void setNumberOfCannons(int numberOfCannons) {
        this.numberOfCannons = numberOfCannons;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }


}