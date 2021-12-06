public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        return (double) Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));   // Since "x-0 = x"
    }

    public double distance(int x, int y){
        return (double) Math.sqrt((x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
    }

    public double distance(Point another){          // We Created an Object. So, an object with this method will have another object in it.
        return (double) Math.sqrt((another.x-this.x) * (another.x-this.x) + (another.y-this.y) * (another.y-this.y));
    }
}
