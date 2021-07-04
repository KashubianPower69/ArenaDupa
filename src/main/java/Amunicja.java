public class Amunicja {

    private String name;
    private double dmg;
    private double fireRatio;
    private double crit;
    private double hit = 0;

    public Amunicja(String name, double dmg, double fireRatio, double crit) {
        this.name = name;
        this.dmg = dmg;
        this.fireRatio = fireRatio;
        this.crit = crit;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getFireRatio() {
        return fireRatio;
    }

    public void setFireRatio(double fireRatio) {
        this.fireRatio = fireRatio;
    }

    public double getHit() {
        return hit;
    }

    public void setHit(double hit) {
        this.hit = hit;
    }
}
