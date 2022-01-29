import java.util.Scanner;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,avg;
        System.out.println("please enter three numbers");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        //input.nextLine();
        avg=(a+b+c)/3.0;
        System.out.println("Average is "+avg);
    }
}
