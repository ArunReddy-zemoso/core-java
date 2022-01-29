import java.util.Scanner;

public class Repetation {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a non-negitive integer");
        System.out.println("Or negative to exit");
        int var=input.nextInt();

        while (var>=0){
            System.out.println(var);
            System.out.println("Enter a non-negitive integer");
            System.out.println("Or negative to exit");
            var=input.nextInt();
        }

        /*int count=0;
        while (count < 10){
            System.out.println(count);
            count++;
        }*/

//        int count1=0;
//        do{
//            System.out.println(count1);
//        }while (count1++ <10);

//        for(int i=0;i<10;i++)
//            System.out.println(i);


    }
}
