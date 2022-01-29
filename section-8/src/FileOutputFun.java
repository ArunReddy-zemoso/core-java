import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter pw=new PrintWriter("output.txt");
            pw.println("Arun");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
