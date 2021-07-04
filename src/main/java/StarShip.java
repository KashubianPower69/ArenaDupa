public class StarShip {

    private String name;
    private double hp;
    private int guns;
    private boolean isDestroyed = false;

    public StarShip(String name, int hp, int guns) {
        this.name = name;
        this.hp = hp;
        this.guns = guns;
    }

    public void fire(Amunicja amunicja) {
        double dmg = amunicja.getDmg();
        double hp = getHp();
        int guns = getGuns();
        double fireRatio = amunicja.getFireRatio();

        System.out.println(getName() + " strzela"); //cipa

        double critCheck = (double) (Math.random()); //cyce dupa

        if (amunicja.getCrit() > critCheck) {
            System.out.println("Trafienie krytyczne!");
            setDestroyed(true );
        } else if (amunicja.getCrit() <= critCheck) {
            dmg =  dmg*guns*fireRatio*60;
            amunicja.setHit(dmg);
            System.out.println("Przeciwnik otrzymuje obrażenia wynoszące " + dmg);

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public int getGuns() {
        return guns;
    }

    public void setGuns(int guns) {
        this.guns = guns;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}