public class Cannon {

    private String cannonName;
    private double accuracy;
    private double fireRatio;

    public Cannon(String cannonName, double accuracy, double fireRatio) {
        this.cannonName = cannonName;
        this.accuracy = accuracy;
        this.fireRatio = fireRatio;
        System.out.println("utowrzono " + cannonName);
    }
    public void fire() {

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

    public double getFireRatio() {
        return fireRatio;
    }

    public void setFireRatio(double fireRatio) {
        this.fireRatio = fireRatio;
    }
}




