package praktica;

public class Dot {
    private  double x;
    private double y;

    public Dot(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Dot dot2){
        this.x = x;
        this.y = y;
        return Math.sqrt(Math.pow(dot2.x-x, 2.0)+Math.pow(dot2.y-y, 2.0));
    }
    public String toString(Dot dot2){
        this.x = x;
        this.y = y;
        return("[" + x + "]" + "[" + y +"]");

    }
}

