import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("arun");
        list.add("kumar");
        list.add("reddy");
        try {
            PrintWriter pw=new PrintWriter("names.txt");
            for(String name:list){
                pw.println(name);
            }
            pw.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
