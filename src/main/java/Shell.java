public class Shell {
    private String shellName;
    private double avDmg;
    private double crit;

    public Shell(String shellName, double avDmg, double crit) {
        this.shellName = shellName;
        this.avDmg = avDmg;
        this.crit = crit;
        System.out.println("utowrzono " + shellName);
    }

    public String getShellName() {
        return shellName;
    }

    public void setShellName(String shellName) {
        this.shellName = shellName;
    }

    public double getAvDmg() {
        return avDmg;
    }

    public void setAvDmg(double avDmg) {
        this.avDmg = avDmg;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }
}

