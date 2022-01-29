import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        int indexOfSpace=name.indexOf(" ");
        String firstName=name.substring(0,indexOfSpace);
        String lastName=name.substring(indexOfSpace+1);
        String upper=firstName.toUpperCase();
        String lower=lastName.toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(upper);
        System.out.println(lower);
    }
}
