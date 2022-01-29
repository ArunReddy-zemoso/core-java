import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("student_ages.txt"));
            PrintWriter pw=new PrintWriter("twice_nums.txt");
            while(sc.hasNextInt()){
                pw.println(2* sc.nextInt());
            }
            pw.close();
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}
