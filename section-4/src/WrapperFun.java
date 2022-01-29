import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(new Integer(10));
        list.add(20);//auto boxing
        list.add(30);
        for(int x:list)
            System.out.println(x);
        String st="3.1234";
        double d=Double.parseDouble(st);
        System.out.println(d);
    }
}
