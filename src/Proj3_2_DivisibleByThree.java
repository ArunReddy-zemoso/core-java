import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=input.nextInt();
        if(num%3==0)
            System.out.println("Divisible by 3");
        else{
            System.out.println("Not divisible by 3");
        }
    }
}
