public class Circle {
    static final double pi=(22/7.0);
    private int radius;
    public Circle(){
        this(1);
    }
    public  Circle(int radius){
        this.radius=radius;
    }
    public double circumference(){
        return 2*pi*this.radius;
    }
    public double area(){
        return pi*this.radius*this.radius;
    }
    public double getRadius(){
        return radius;
    }
}
