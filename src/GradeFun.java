import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        char grade;

        System.out.println("Enter Grade");
        grade=input.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("You can be Better");
                break;
            case  'D':
            case 'd':
                System.out.println("just pass");
                break;
            case  'F':
            case 'f':
                System.out.println("You are Failed");
                break;
            default:
                System.out.println("You have entered a invalid character");
        }
    }
}
