import java.util.Scanner;

public class sumFum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a non-negitive integer to add to sum");
        System.out.println("Or negative to exit");
        int var=input.nextInt();
        int sum=0;
        while (var>=0){
            System.out.println(var);
            sum+=var;
            System.out.println("Enter a non-negitive integer to add to sum");
            System.out.println("Or negative to exit");
            var=input.nextInt();
        }
        System.out.println(sum);
    }
}
