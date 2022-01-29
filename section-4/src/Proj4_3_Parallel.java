import java.util.Scanner;

public class Proj4_3_Parallel{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] ages=new int[5];
        String[] names=new String[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter name: ");
            names[i]=in.nextLine();
            System.out.print("Enter Age: ");
            ages[i]=in.nextInt();
            in.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(names[i]+" is "+ages[i]+" years old");
        }
    }
}
