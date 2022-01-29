import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to pub");
        System.out.println("Enter your age");
        age=input.nextInt();

        if(age>=22){
            System.out.println("Here, have a wine");
        }
        else if(age>=16) {
            System.out.println("Here, have a juice");
            System.out.println("Atleast you can drive!");
        }
        else
            System.out.println("Here, have a juice");
        System.out.println("Thanks for comming");
    }
}
