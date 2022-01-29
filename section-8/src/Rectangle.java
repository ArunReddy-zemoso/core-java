public class Rectangle {
    private double length;
    private double width;

    public static int numRectangles;

    public  Rectangle(){
        this(1.0,1.0);
    }
    public  Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        numRectangles++;
    }

    public  double getLength(){
        return  length;
    }
    public void setLength(int length){
        this.length=length;
    }
    public  double getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public  double area(){
        return length*width;
    }
    public  double perimeter(){
        return 2*(length+width);
    }
    public  static int getNumRectangle(){
        return numRectangles;
    }

}
