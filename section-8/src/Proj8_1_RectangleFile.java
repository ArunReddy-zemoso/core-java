import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangleList=new ArrayList<>();



        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }
    public  static void fillArrayList(ArrayList<Rectangle> rectangleAL){
        try {
            Scanner sc = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length,width;

            while (sc.hasNext()){
                length=sc.nextDouble();
                width=sc.nextDouble();
                temp=new Rectangle(length,width);
                rectangleAL.add(temp);
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
    static void printRectangles(ArrayList<Rectangle> rectangleAL){
    for(Rectangle r:rectangleAL){
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println();
    }
    }
}
