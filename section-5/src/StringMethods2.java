import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String name="ArunReddy";
        String upper=name.toLowerCase();
        String lower=name.toUpperCase();
        int whereIsR=name.indexOf('r');
        String lastName=name.substring(4);
        System.out.println(name);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(whereIsR);
        System.out.println(lastName);


    }
}
