import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        int randInt= rand.nextInt(100)+1;
        System.out.println("Guess the Number");
        int num=input.nextInt();
        int count=1;
        while(randInt!=num){
            if(num<1 || num>100)
                System.out.println("Wasted! Guess between 1-100");
            else if(num>randInt)
                System.out.println("Your guess was too high");
            else if(num<randInt)
                System.out.println("Your guess was too low");

            System.out.println("Guess the Number");
            num=input.nextInt();
            count++;
        }
        System.out.println("congratulations! You gussed the number in "+count+" guess");
    }
}
