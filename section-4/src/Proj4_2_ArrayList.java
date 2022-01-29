import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Double> list=new ArrayList<>();
        System.out.println("Enter positive number to add or negetive number to stop");
        double temp=input.nextDouble();
        while(temp>=0){
            list.add(temp);
            System.out.println("Enter positive number to add or negetive number to stop");
            temp=input.nextDouble();
        }
        for(int i= list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
    }
}
