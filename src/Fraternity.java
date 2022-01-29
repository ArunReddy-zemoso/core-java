import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        char gender;

        System.out.println("enter age");
        age=input.nextInt();
        System.out.println("Enter age");
        gender=input.next().charAt(0);
        if(age>=19 && gender=='M'){
            System.out.println("You can join");
        }
        else
            System.out.println("You can't join");
    }
}
