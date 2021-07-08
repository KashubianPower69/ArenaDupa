import java.util.ArrayList;
import java.util.List;

public class StarShip {

    private String shipName;
    private double hp;
    private int numberOfCannons;
    private char cannonType;
    private int aimX = 0;
    private boolean isDestroyed = false;
    private List<Cannon> cannons = new ArrayList<>();


    public StarShip(String shipName, int hp, int numberOfCannons, char cannonType) {
        this.shipName = shipName;
        this.hp = hp;
        this.numberOfCannons = numberOfCannons;
        this.cannonType = cannonType;
        System.out.println("Utworzono " + shipName);
        cannonMaker();
    }

    private void cannonMaker() {

        for (int i = 0; i < getNumberOfCannons(); i++) {
            Cannon cannon = new Cannon("Działo" + (i + 1), 0.6, 1);
            cannons.add(cannon);

        }

    }

    public void aim() {

    }

   /* public void fire(Amunicja amunicja) {
        double dmg = amunicja.getDmg();
        double hp = getHp();
        int guns = getGuns();
        double fireRatio = amunicja.getFireRatio();

        System.out.println(getShipName() + " strzela");

        double critCheck = (double) (Math.random());

        if (amunicja.getCrit() > critCheck) {
            System.out.println("Trafienie krytyczne!");
            setDestroyed(true );
        } else if (amunicja.getCrit() <= critCheck) {
            dmg =  dmg*guns*fireRatio*60;
            amunicja.setHit(dmg);
            System.out.println("Przeciwnik otrzymuje obrażenia wynoszące " + dmg);

        }

    }*/

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