public class Arena {
    public static void main(String[] args) {

        // StarShip starship1 = new StarShip("Niszczyciel", 6000, 4, 'a', -50);
        // StarShip starship2 = new StarShip("Fregata", 5000, 6, 'b', 50);

        //private int

        /*starship1.salvo();
        starship1.salvo();
        starship1.salvo();
        starship1.salvo();
        starship1.moveShip();
        starship1.aim();*/
        Segment[][] map = new Segment[100][100];
        WaterCraft watercraft = new WaterCraft(10, 10);

        for (int i = 1; i <= watercraft.getSegments(); i = i + 2) { //dodać do klasy waterjet
            int a = watercraft.getCenterX();
            int b = watercraft.getCenterY();
            Segment segment = new Segment(6000);
            if (i == 3) {
                map[a + 1][b + 1] = segment;
                map[a - 1][b - 1] = segment;
            } else if(i == 5){
                map[a + 2][b + 2] = segment;
                map[a - 2][b - 2] = segment;
            }
        }
        System.out.println(map);


    }
}
