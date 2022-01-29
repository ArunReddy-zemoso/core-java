import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(new File("circle_data.txt"));
            ArrayList<Circle> circleArrayList=new ArrayList<>();
            fillArrayList(circleArrayList);
            printCircles(circleArrayList);
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
    public  static void fillArrayList(ArrayList<Circle> circleAL){
        try {
            Scanner sc = new Scanner(new File("circle_data.txt"));
            Circle temp;
            int radius;

            while (sc.hasNext()){
                radius=sc.nextInt();
                temp=new Circle(radius);
                circleAL.add(temp);
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
    static void printCircles(ArrayList<Circle> CircleAL){
        for(Circle r:CircleAL){
            System.out.println(r.getRadius());
            System.out.println(r.area());
            System.out.println(r.circumference());
            System.out.println();
        }
    }
}
