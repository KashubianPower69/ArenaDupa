public class WaterCraft {
    private int segments;
    private int centerX;
    private int centerY;

    public WaterCraft(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
        buildSegments();
    }

    private void buildSegments() {
        int segments = (int) (1 + (Math.random() * 2)); //od 1 do 4 segmentów
        System.out.println("Utworzono "+ segments + " segment/y");
    }

    public int getCenterX() {
        return centerX;
    }

    public int getSegments() {
        return segments;
    }

    public int getCenterY() {
        return centerY;
    }
}
