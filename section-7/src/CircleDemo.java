public class CircleDemo {
    public static void main(String[] args) {
        Circle c1=new Circle(5);
        Circle c2=new Circle();

        printCircleDetails(c1);
        System.out.println();
        printCircleDetails(c2);

    }
    static void printCircleDetails(Circle circle){
        System.out.println(circle.getRadius());
        System.out.println(String.format("%.2f",circle.area()));
        System.out.println(circle.circumference());
    }
}
