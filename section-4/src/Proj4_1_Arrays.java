import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] ar=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter number");
            ar[i]=input.nextInt();
        }
        for(int x:ar) System.out.println("result "+x*2);
    }
}
