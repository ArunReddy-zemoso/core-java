import java.util.Scanner;

public class Proj3_1_LearingPackages {
    public static void main(String[] args) {
         int Package,courses,baseCost,costPerCourse,numInclude,totalCost;
        Scanner input=new Scanner(System.in);
        System.out.println("Which package do you want? 1,2, or 3?");
        Package=input.nextInt();
        System.out.println("How many courses did you enroll in this month?");
        courses=input.nextInt();
        if(Package==1){
            baseCost=10;
            costPerCourse=6;
            numInclude=2;
        }
        else if(Package==2){
            baseCost=12;
            costPerCourse=4;
            numInclude=4;
        }
        else {
            baseCost=15;
            costPerCourse=3;
            numInclude=6;
        }

        if(courses>numInclude){
            totalCost=baseCost+(courses-numInclude)*costPerCourse;
        }
        else
            totalCost=baseCost;
        System.out.println("Total cost is $"+totalCost);
    }
}
