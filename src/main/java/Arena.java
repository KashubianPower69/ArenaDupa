public class Arena {
    public static void main(String[] args) {
        Amunicja amunicja1 = new Amunicja("laser", 12, 0.5, 0.1);
        Amunicja amunicja2 = new Amunicja("śrut", 10, 0.5, 0.2);

        StarShip statek1 = new StarShip("Niszczyciel", 6000, 4);
        StarShip statek2 = new StarShip("Fregata", 5000, 6);

        while (statek1.getHp() > 0 && statek2.getHp() > 0) {
            statek1.fire(amunicja1);
            statek2.setHp(statek2.getHp() - amunicja1.getHit());
            if (statek1.isDestroyed()) {
                statek2.setHp(0);
            }
            statek2.fire(amunicja2);
            statek1.setHp(statek1.getHp() - amunicja2.getHit());
            if (statek2.isDestroyed()) {
                statek1.setHp(0);
            }
        }

        if (statek1.getHp() <= 0 && statek2.getHp() <= 0) {
            System.out.println("Oba statki zniszczone w tym samym momencie!");
        } else if (statek2.getHp() <=0) {
            System.out.println("Fregata zniszczona! Niszczyciel zwyciężył");
        } else {
            System.out.println("Niszczyciel zniszczony! Fregata zwyciężyła!");
        }

    }
}
