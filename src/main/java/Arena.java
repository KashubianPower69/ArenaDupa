public class Arena {
    public static void main(String[] args) {
        /*Amunicja amunicja1 = new Amunicja("laser", 12, 0.5, 0.1);
        Amunicja amunicja2 = new Amunicja("śrut", 10, 0.5, 0.2);*/

        StarShip statek1 = new StarShip("Niszczyciel", 6000, 4, 'a', -50);
        StarShip statek2 = new StarShip("Fregata", 5000, 6, 'b', 50);

        statek1.salvo();
        statek1.salvo();
        statek1.salvo();
        statek1.salvo();
        statek1.salvo();
        statek1.salvo();

    }
}
