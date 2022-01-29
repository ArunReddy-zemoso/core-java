import java.util.Scanner;

public class Proj2_2_MadlibsClone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;
        System.out.println("Enter an adjective1");
        adjective1=input.nextLine();
        System.out.println("Enter a girlsName");
        girlsName=input.nextLine();
        System.out.println("Enter another adjective");
        adjective2=input.nextLine();
        System.out.println("enter Occupation");
        occupation1=input.nextLine();
        System.out.println("enter place");
        placeName=input.nextLine();
        System.out.println("enter name of clothing");
        clothing=input.nextLine();
        System.out.println("Enter hobby");
        hobby=input.nextLine();
        System.out.println("Enter another adjective");
        adjective3=input.nextLine();
        System.out.println("Enter another Occupation");
        occupation2=input.nextLine();
        System.out.println("Enter boy name");
        boysName=input.nextLine();
        System.out.println("Enter man Name");
        mansName=input.nextLine();
        System.out.println();
        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a "+adjective2+" "+ occupation1+" in the Kingdom of " + placeName + ".");
        System.out.println("She loved to wear "+clothing + " and to " + hobby+". She wanted to marry "+adjective3+" "+ occupation2+" named "+boysName + " but her father, King " + mansName+ "forbid her from seeing him.");
    }
}
