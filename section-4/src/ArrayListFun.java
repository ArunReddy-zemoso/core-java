import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("arun");
        names.add("kumar");
        names.add("reddy");

//        for(int i=0;i< names.size();i++)
//            System.out.println(names.get(i));

        for(String x:names)
            System.out.println(x);

    }
}
