import java.util.ArrayList;
import java.util.List;

public class StarShip {

    private String shipName;
    private double hp;
    private int numberOfCannons;
    private char cannonType;
    private int aimX = 0;
    private int postitionX;
    private boolean isDestroyed = false;
    private List<Cannon> cannons = new ArrayList<>();


    public StarShip(String shipName, int hp, int numberOfCannons, char cannonType, int postitionX) {
        this.shipName = shipName;
        this.hp = hp;
        this.numberOfCannons = numberOfCannons;
        this.cannonType = cannonType;
        System.out.println("Utworzono " + shipName);
        cannonMaker();
    }

    private void cannonMaker() {

        for (int i = 0; i < getNumberOfCannons(); i++) {
            Cannon cannon = new Cannon("Działo" + (i + 1), 0.6);
            cannons.add(cannon);

        }

    }

    public void aim() {
        System.out.println(shipName + " celuje na " + getAimX() + " ");
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
        return postitionX;
    }

    public void setPostitionX(int postitionX) {
        this.postitionX = postitionX;
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